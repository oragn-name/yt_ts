package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectConstruction;
import com.study.model.User;
import com.study.service.ProjectConstructionService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectConstructionController", description = "施工单位操作API")
@RestController
public class ProjectConstructionController {

  @Autowired
  private ProjectConstructionService projectConstructionService;

  @ApiOperation(value = "根据项目id获取施工单位所有数据", notes = "获取施工单位，返回grid")
  @RequestMapping(value = "/constructions/getData", method = { RequestMethod.GET })
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,
      @RequestParam(value = "proId", required = true) Integer proId) {
    ProjectConstruction construction = new ProjectConstruction();
    construction.setProid(proId);
    List<ProjectConstruction> pcs = projectConstructionService.selectByAll(
        construction, bean);
    PageInfo<ProjectConstruction> info = new PageInfo<ProjectConstruction>(pcs);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }

  @RequestMapping(value = "/constructions/add", method = { RequestMethod.POST })
  public String add(@ModelAttribute ProjectConstruction projectConstruction) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      Session session = SecurityUtils.getSubject().getSession();
      User user = (User) session.getAttribute("userSession");
      projectConstruction.setCreateUser(user.getId());
      projectConstruction.setCreateTime(sdf.format(new Date()));
      projectConstructionService.save(projectConstruction);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/constructions/edit", method = { RequestMethod.POST })
  public String edit(@ModelAttribute ProjectConstruction projectConstruction) {
    try {
      projectConstructionService.updateAll(projectConstruction);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/constructions/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          projectConstructionService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
}
