package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Attendance;
import com.atguigu.crud.bean.Employee;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.HRManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

// AttendanceController.java

//@RequestMapping(value = "/attendance/add",method=RequestMethod.POST)

@Controller
public class AttendanceController {
    @Autowired
    private HRManagementService attendanceService;

//    @RequestMapping(value="/emp",method=RequestMethod.POST)
//    @ResponseBody
//    public Msg saveEmp(@Valid Employee employee, BindingResult result){

    @RequestMapping(value="/attendance/add",method=RequestMethod.POST)
    @ResponseBody
    public String addAttendance(@Valid Attendance attendance, BindingResult result ) {
        //System.out.println("in AttendanceController");
//        Attendance attendance1 = new Attendance();
//        int employeeId=attendance.getEmployeeId();
//        String date=attendance.getDate();
//        Date signInTime=attendance.getSignInTime();
//        Date signOutTime=attendance.getSignOutTime();
//        attendance1.setEmployeeId(employeeId);
//        attendance1.setDate(date);
//        attendance1.setSignInTime(signInTime);
//        attendance1.setSignOutTime(signOutTime);

        System.out.println("ok");
        System.out.println(attendance);
        attendanceService.addAttendance(attendance);
        return "redirect:/attendance11";
    }


    // 其他与考勤相关的请求处理方法
}