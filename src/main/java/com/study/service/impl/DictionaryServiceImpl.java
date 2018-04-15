package com.study.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

import com.github.pagehelper.PageHelper;
import com.study.mapper.DictionaryMapper;
import com.study.model.Dictionary;
import com.study.service.DictionaryService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

@Service("dictionaryService")
public class DictionaryServiceImpl extends BaseService<Dictionary> implements DictionaryService {

  @Autowired
  private DictionaryMapper dictionaryMapper;
  @Override
  public List<Dictionary> selectDictAll(Dictionary dic, PageBean bean) {
    Example example=new Example(Dictionary.class);
    Criteria createCriteria = example.createCriteria();
    if(dic.getDictName()!=null&&!"".equals(dic.getDictName())){
      createCriteria.andLike("dictName", "%"+dic.getDictName()+"%");
    }
    if(dic.getDictCode()!=null&&!"".equals(dic.getDictCode())){
      createCriteria.andEqualTo("dictCode", dic.getDictCode());
    }
    if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
      PageHelper.startPage(bean.getPage(), bean.getRows());
    }
    List<Dictionary> selectByExample = dictionaryMapper.selectByExample(example);
    return selectByExample;
  }

}
