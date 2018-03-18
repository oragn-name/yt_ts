package com.study.mapper;

import java.util.List;

import com.study.model.ProjectReceipts;
import com.study.util.MyMapper;

public interface ProjectReceiptsMapper extends MyMapper<ProjectReceipts> {
  
  public List<ProjectReceipts> selectReceiptsByAll(ProjectReceipts projectReceipts);
}