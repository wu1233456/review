package com.wcl.service;

import com.wcl.bean.User;
import com.wcl.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //从数据库根据用户名获取用户信息
        User user = new User();
        user.setUsername(s);
        userDao.selectOne(user);
        return null;
    }

}
