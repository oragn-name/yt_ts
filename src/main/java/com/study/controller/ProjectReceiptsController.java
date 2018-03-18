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
import com.study.model.ProjectReceipts;
import com.study.model.User;
import com.study.service.ProjectReceiptsService;
import com.study.util.ResultUtil;
import com.study.util.bean.DataGridResultInfo;
import com.study.util.bean.PageBean;

@Api(value = "projectReceiptsController", description = "财务收款操作API")
@RestController
public class ProjectReceiptsController {
  @Autowired
  private ProjectReceiptsService projectReceiptsService;

  @RequestMapping(value = "/receipts/getData", method = { RequestMethod.GET })
  public DataGridResultInfo getData(@ModelAttribute PageBean bean,
      @RequestParam(value = "proId", required = true) Integer proId) {
    ProjectReceipts projectReceipts = new ProjectReceipts();
    projectReceipts.setProId(proId);
    List<ProjectReceipts> selectReceiptsByAll = projectReceiptsService
        .selectReceiptsByAll(projectReceipts, bean);
    PageInfo<ProjectReceipts> info = new PageInfo<ProjectReceipts>(
        selectReceiptsByAll);
    return ResultUtil.createDataGridResult(info.getTotal(), info.getList());
  }

  @RequestMapping(value = "/receipts/add", method = { RequestMethod.POST })
  public String add(@ModelAttribute ProjectReceipts projectReceipts) {
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      Session session = SecurityUtils.getSubject().getSession();
      User user = (User) session.getAttribute("userSession");
      projectReceipts.setReceiptsCreateUser(user.getId());
      projectReceipts.setReceiptsCreateTime(sdf.format(new Date()));
      projectReceiptsService.save(projectReceipts);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/receipts/edit", method = { RequestMethod.POST })
  public String edit(@ModelAttribute ProjectReceipts projectReceipts) {
    try {
      projectReceiptsService.updateNotNull(projectReceipts);
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }

  @RequestMapping(value = "/receipts/delete", method = { RequestMethod.DELETE })
  public String delete(@RequestParam(value = "ids", required = true) String ids) {
    try {
      if (ids != null) {
        String[] id = ids.split(",");
        for (String string : id) {
          projectReceiptsService.delete(Integer.parseInt(string));
        }
      }
      return "success";
    } catch (Exception e) {
      e.printStackTrace();
      return "fail";
    }
  }
}
