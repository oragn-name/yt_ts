package com.study.service;

import java.util.List;




import com.study.model.ProjectSatety;
import com.study.util.bean.PageBean;

public interface ProjectSatetyService extends IService<ProjectSatety> {

  public List<ProjectSatety> selectSafetyByAll(ProjectSatety projectSatety,PageBean bean);  
}
