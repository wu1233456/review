package com.wcl.mapper;

import com.wcl.bean.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserDao  extends Mapper<User> {


}
