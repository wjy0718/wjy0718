package com.atguigu.crud.controller;

import com.atguigu.crud.bean.LeaveApplication;
import com.atguigu.crud.service.HRManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// LeaveApplicationController.java
@Controller
@RequestMapping("/leave")
public class LeaveApplicationController {
    @Autowired
    private HRManagementService leaveApplicationService;

    @PostMapping("/add")
    public String addLeaveApplication(LeaveApplication leaveApplication) {
        leaveApplicationService.addLeaveApplication(leaveApplication);
        return "redirect:/attendance.jsp";
    }
    // 其他与请假申请和审批相关的请求处理方法
}