package com.wcl.mybatismapper.service;


import com.wcl.mybatismapper.entity.Employee;
import com.wcl.mybatismapper.mapper.EmployeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeMapper employeMapper;
    public String getEmpName(){
        List<Employee> employees = employeMapper.selectAll();
        System.out.println(employees);
        return "hello";
    }


}
