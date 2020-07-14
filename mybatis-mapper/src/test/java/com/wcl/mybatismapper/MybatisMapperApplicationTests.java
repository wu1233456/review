package com.wcl.mybatismapper;

import com.wcl.mybatismapper.entity.Employee;
import com.wcl.mybatismapper.mapper.EmployeMapper;
import com.wcl.mybatismapper.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisMapperApplicationTests {
  @Autowired
  EmployeeService employeeService;
  @Autowired
  EmployeMapper employeMapper;

    @Test
    void contextLoads() {
      /*通过某个字段来查询*/
      Employee employee = new Employee();
      employee.setEmpId(1);
      Employee employee1 = employeMapper.selectOne(employee);
      System.out.println(employee1);
    }

}
