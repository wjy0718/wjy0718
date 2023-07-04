package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Employee_1;
import com.atguigu.crud.service.HRManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// EmployeeController.java
@Controller
@RequestMapping("/employee")
public class EmployeeController_1 {
    @Autowired
    private HRManagementService employeeService;

    @PostMapping("/add")
    public String addEmployee(Employee_1 employee) {
        employeeService.addEmployee(employee);
        return "redirect:/attendance.jsp";
    }
    // 其他员工相关的请求处理方法
}