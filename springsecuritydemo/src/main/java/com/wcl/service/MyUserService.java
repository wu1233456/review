package com.wcl.service;

import com.wcl.bean.User;
import com.wcl.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class MyUserService implements UserDetailsService {
    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        String encode = new BCryptPasswordEncoder().encode("123456");
//        System.out.println(encode);
        //从数据库根据用户名获取用户信息
        System.out.println(s);
        User user = new User();

        user.setUsername(s);
        User userByName = userDao.selectOne(user);
        /*创建一个新的UserDetails对象，最后验证登录的需要*/
        UserDetails userDetails=null;
        if (userByName!=null){
            /*创建一个集合来存放权限*/
            List<GrantedAuthority> authorities=getAuthorities(userByName);

            /*实例化UserDetails对象*/
            userDetails=new org.springframework.security.core.userdetails.User(s,userByName.getPassword(),authorities);

        }
        return userDetails;
    }
    private List<GrantedAuthority> getAuthorities(User user){
        List<GrantedAuthority> authList = new ArrayList<>();
        authList.add(new SimpleGrantedAuthority("ROLE_"+user.getRole()));
        return authList;
    }

}
