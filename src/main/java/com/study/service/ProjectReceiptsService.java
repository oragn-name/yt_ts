package com.study.service;

import java.util.List;

import com.study.model.ProjectReceipts;
import com.study.util.bean.PageBean;

public interface ProjectReceiptsService  extends IService<ProjectReceipts>{
  public List<ProjectReceipts> selectReceiptsByAll(ProjectReceipts projectReceipts,PageBean bean);
}
