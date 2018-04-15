package com.study.service;

import java.util.List;

import com.study.model.Dictionary;
import com.study.util.bean.PageBean;

public interface DictionaryService extends IService<Dictionary> {
   public List<Dictionary> selectDictAll(Dictionary dic,PageBean bean);
}
