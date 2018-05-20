package com.study.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.study.mapper.ProjectReceiptsMapper;
import com.study.model.ProjectReceipts;
import com.study.model.vo.ReceiptsOrder;
import com.study.service.ProjectReceiptsService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service(value="projectReceiptsService")
public class ProjectReceiptsServiceImpl extends BaseService<ProjectReceipts> implements ProjectReceiptsService {

  @Autowired
  private ProjectReceiptsMapper projectReceiptsMapper;

  @Override
  public List<ProjectReceipts> selectReceiptsByAll(
      ProjectReceipts projectReceipts, PageBean bean) {
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<ProjectReceipts> selectReceiptsByAll = projectReceiptsMapper.selectReceiptsByAll(projectReceipts);
    return selectReceiptsByAll;
  }

  @Override
  public List<ReceiptsOrder> getOrderDay(Map<String, Object> map) {
    return projectReceiptsMapper.getOrderDay(map);
  }
}
