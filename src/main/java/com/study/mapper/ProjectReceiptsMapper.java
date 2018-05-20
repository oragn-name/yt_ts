package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.ProjectReceipts;
import com.study.model.vo.ReceiptsOrder;
import com.study.util.MyMapper;

public interface ProjectReceiptsMapper extends MyMapper<ProjectReceipts> {
  
  public List<ProjectReceipts> selectReceiptsByAll(ProjectReceipts projectReceipts);
  
  
  public List<ReceiptsOrder> getOrderDay(Map<String, Object> map);
}