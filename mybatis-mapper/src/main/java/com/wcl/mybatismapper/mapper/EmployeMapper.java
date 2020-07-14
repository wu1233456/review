package com.wcl.mybatismapper.mapper;

import com.wcl.mybatismapper.entity.Employee;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface EmployeMapper  extends Mapper<Employee> {

}
