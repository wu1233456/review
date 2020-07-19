package com.wcl.service;

import com.wcl.dao.SysRoleMapper;
import com.wcl.entity.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
    public SysRole selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}

