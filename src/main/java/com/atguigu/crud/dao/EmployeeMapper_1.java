package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Employee_1;

public interface EmployeeMapper_1 {
    void addEmployee(Employee_1 employee);
    // 其他员工相关的查询方法
    int insert(Employee_1 record);
    Employee_1 selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Employee_1 record);
    int deleteByPrimaryKey(Integer id);
}