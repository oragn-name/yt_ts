package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.study.mapper.RoleMapper;
import com.study.mapper.RoleResourcesMapper;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.study.model.Role;
import com.study.model.RoleResources;
import com.study.service.RoleService;
import com.study.util.PageBeanUtil;
import com.study.util.bean.PageBean;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
import tk.mybatis.mapper.util.StringUtil;

@Service("roleService")
public class RoleServiceImpl extends BaseService<Role> implements RoleService{

    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleResourcesMapper roleResourcesMapper;

    @Override
    public Role queryRoleListWithSelected(Integer uid) {
        return roleMapper.queryRoleListWithSelected(uid);
    }

    @Override
    public List<Role> selectByPage(Role role, PageBean bean) {
        Example example = new Example(Role.class);
        if(role!=null&&role.getRoledesc()!=null&&!"".equals(role.getRoledesc().trim())){
          Criteria createCriteria = example.createCriteria();
          createCriteria.andLike("roledesc", "%"+role.getRoledesc()+"%");
        }
        if(PageBeanUtil.pageBeanIsNotEmpty(bean)){
        //分页查询
          PageHelper.startPage(bean.getPage(), bean.getRows());
        }
        List<Role> rolesList = selectByExample(example);
        return rolesList;
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public void delRole(Integer roleid) {
        //删除角色
        mapper.deleteByPrimaryKey(roleid);
        //删除角色资源
        Example example = new Example(RoleResources.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("roleid",roleid);
        roleResourcesMapper.deleteByExample(example);

    }
}
