package com.cn.service.Impl;

import com.cn.mapper.URoleMapper;
import com.cn.po.URole;
import com.cn.service.IRoleService;
import com.cn.util.DatabaseContextHolder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    URoleMapper uRoleMapper;

    @Override
    public URole getRoleById(int userId) {
        DatabaseContextHolder.setCustomerType(DatabaseContextHolder.DATA_SOURCE_B);
        URole uRole = uRoleMapper.selectByPrimaryKey((long) userId);
        return uRole;
    }
}
