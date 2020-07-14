package com.wcl.mybatismapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//也可以通过这种方式命名别名
@Alias(value = "Employee")

@Table(name = "tabple_emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column
    private String empName;
    @Column
    private Double empSalary;
    //不需要关联使用下面注解
    @Transient
    private Integer userId;

}
