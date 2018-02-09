package com.study.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.Api;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.study.model.ProjectRoadWorkDaily;
import com.study.model.User;
import com.study.service.ProjectRoadWorkDailyService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "ProjectRoadWorkDailyController", description = "每日工作量操作API")
@RestController
public class ProjectRoadWorkDailyController {

  @Autowired
  private ProjectRoadWorkDailyService roadWorkDailyService;

  @RequestMapping(value = "/workdailys/getData", method = { RequestMethod.GET })
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,
      @RequestParam(value = "proId", required = true) Integer proId) {
    ProjectRoadWorkDaily daily = new ProjectRoadWorkDaily();
    daily.setProId(proId);
    List<ProjectRoadWorkDaily> selectWorkDailyAll = roadWorkDailyService
        .selectWorkDailyAll(daily, bean);
    PageInfo<ProjectRoadWorkDaily> info = new PageInfo<ProjectRoadWorkDaily>(
        selectWorkDailyAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }

  @RequestMapping(value = "/workdailys/add", method = { RequestMethod.POST })
  public String add(@ModelAttribute ProjectRoadWorkDaily projectRoadWorkDaily) {
    try {
      
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       Session session = SecurityUtils.getSubject().getSession();
       User user =(User)session.getAttribute("userSession");
       projectRoadWorkDaily.setCreateUser(user.getId());
       projectRoadWorkDaily.setCreateTime(sdf.format(new Date()));
      roadWorkDailyService.save(projectRoadWorkDaily);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/workdailys/edit", method = { RequestMethod.POST })
  public String edit(@ModelAttribute ProjectRoadWorkDaily projectRoadWorkDaily) {
    try {
      roadWorkDailyService.updateNotNull(projectRoadWorkDaily);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/workdailys/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          roadWorkDailyService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

}
