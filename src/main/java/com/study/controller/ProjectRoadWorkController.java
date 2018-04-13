package com.study.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.study.model.Dept;
import com.study.model.Dictionarydata;
import com.study.model.ProjectProduce;
import com.study.model.ProjectRoadWork;
import com.study.model.User;
import com.study.service.DictdataService;
import com.study.service.ProjectProduceService;
import com.study.service.ProjectRoadWorkService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value="ProjectRoadWorkController",description="项目施工操作API")
@RestController
public class ProjectRoadWorkController {

  @Autowired
  private ProjectProduceService projectProduceService;
	@Autowired
	private ProjectRoadWorkService roadWorkService;
	@Autowired
  private DictdataService dictdataService;
	
	@RequestMapping(value="/roadworks/getData",method={RequestMethod.GET})
	public DataGridResultInfo getData(@ModelAttribute PageBean bean,@RequestParam(value="proId",required=true)Integer proId){
	  ProjectRoadWork projectRoadWork=new ProjectRoadWork();
	  projectRoadWork.setProId(proId);
	  List<ProjectRoadWork> projectRoadWorkAll = roadWorkService.getProjectRoadWorkAll(projectRoadWork, bean);
	  for (ProjectRoadWork work : projectRoadWorkAll) {
      String proConsts="";
      if(work.getPrwTeam()!=null&&!"".equals(work.getPrwTeam())){
        String[] proConst=work.getPrwTeam().split(",");
        for (String string : proConst) {
          Dictionarydata selectByKey = dictdataService.selectByKey(Integer.parseInt(string));
          if(selectByKey!=null){
            proConsts+=selectByKey.getDictdataName()+",";
          }
        }
      }
      if(proConsts.length()>0){
        proConsts=proConsts.substring(0, proConsts.length()-1);
      }
      work.setPrwTeam(proConsts);
    }
	  
		PageInfo<ProjectRoadWork> info=new PageInfo<ProjectRoadWork>(projectRoadWorkAll);
		return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
	}
	
	@RequestMapping(value = "/roadworks/add",method={RequestMethod.POST})
    public String add(@ModelAttribute ProjectRoadWork roadWork) {
		try {
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      Session session = SecurityUtils.getSubject().getSession();
      User user = (User)session.getAttribute("userSession");
      roadWork.setPrwCreator(user.getId());
      roadWork.setPrwCreateAt(sdf.format(new Date()));
			roadWorkService.save(roadWork);
			
			if(roadWork.getPrwAst()!=null&&!"".equals(roadWork.getPrwAst())){//实际开工日期
			   if(roadWork.getPrwAet()==null||"".equals(roadWork.getPrwAet())){
			     ProjectProduce selectByKey = projectProduceService.selectByKey(roadWork.getProId());
			     selectByKey.setProStatus(1);
			     projectProduceService.updateNotNull(selectByKey);
			   }
			}
			
			if(roadWork.getPrwFigureDate()!=null&&!"".equals(roadWork.getPrwFigureDate())){
			  ProjectProduce selectByKey = projectProduceService.selectByKey(roadWork.getProId());
        selectByKey.setProStatus(3);
        projectProduceService.updateNotNull(selectByKey);
			}
			
			
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
	}
	
	@RequestMapping(value = "/roadworks/edit",method={RequestMethod.POST})
    public String edit(@ModelAttribute ProjectRoadWork roadWork) {
		try {
		  if(roadWork.getPrwAst()!=null&&!"".equals(roadWork.getPrwAst())){//实际开工日期
        if(roadWork.getPrwAet()==null||"".equals(roadWork.getPrwAet())){
          ProjectProduce selectByKey = projectProduceService.selectByKey(roadWork.getProId());
          selectByKey.setProStatus(1);
          projectProduceService.updateNotNull(selectByKey);
        }
     }
     
     if(roadWork.getPrwFigureDate()!=null&&!"".equals(roadWork.getPrwFigureDate())){
       ProjectProduce selectByKey = projectProduceService.selectByKey(roadWork.getProId());
       selectByKey.setProStatus(3);
       projectProduceService.updateNotNull(selectByKey);
     }
			roadWorkService.updateAll(roadWork);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
	}
	
	@RequestMapping(value = "/roadworks/delete",method={RequestMethod.DELETE})
    public String delete(@RequestParam(value="ids",required=true)String ids){
		try {
			if (ids != null) {
				String[] id = ids.split(",");
				for (String string : id) {
					roadWorkService.delete(Integer.parseInt(string));
				}
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
            return "fail";
		}
    }
	
	@RequestMapping(value="/roadworks/multifileUpload",method={RequestMethod.POST})
	public @ResponseBody String multifileUpload(MultipartFile file){
        String path = "F:/test" ;

        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        
        if(file.isEmpty()){
            return "false";
        }else{        
            File dest = new File(path + "/" + fileName);
            if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
                dest.getParentFile().mkdir();
            }
            try {
                file.transferTo(dest);
            }catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "false";
            } 
        }
        return "true";
    }
}
