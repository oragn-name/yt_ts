package com.study.controller.view;

import javax.servlet.http.HttpServletRequest;

import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.model.ProjectReceipts;
import com.study.service.ProjectReceiptsService;
import com.study.util.bean.MenuBean;

@Api(value="ProjectReceiptsViewController",description="财务收款页面跳转")
@Controller
public class ProjectReceiptsViewController {
  @Autowired
  private ProjectReceiptsService projectReceiptsService;
  @RequestMapping(value="receipts/add",method={RequestMethod.GET})
  public String add(HttpServletRequest request,@RequestParam(value="receiptsId",required=false) Integer receiptsId, @ModelAttribute MenuBean bean,@RequestParam(value="proId",required=false)Integer proId){
    request.setAttribute("menu", bean);
    if (receiptsId != null) {
      ProjectReceipts selectByKey = projectReceiptsService.selectByKey(receiptsId);
      request.setAttribute("receipts", selectByKey);
      return "receipts/receipts_edit";
    } else {
      request.setAttribute("proId", proId);
      return "receipts/receipts_add";
    }
    
  }
  
  
}
