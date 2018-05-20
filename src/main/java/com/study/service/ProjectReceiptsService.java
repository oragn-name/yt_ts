package com.study.service;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectReceipts;
import com.study.model.vo.ReceiptsOrder;
import com.study.util.bean.PageBean;

public interface ProjectReceiptsService  extends IService<ProjectReceipts>{
  public List<ProjectReceipts> selectReceiptsByAll(ProjectReceipts projectReceipts,PageBean bean);
  public List<ReceiptsOrder> getOrderDay(Map<String, Object> map);
}
