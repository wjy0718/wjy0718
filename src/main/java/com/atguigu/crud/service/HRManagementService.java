package com.atguigu.crud.service;



import com.atguigu.crud.dao.AttendanceMapper;
import com.atguigu.crud.dao.LeaveApplicationMapper;
import com.atguigu.crud.dao.EmployeeMapper_1;
import com.atguigu.crud.bean.Attendance;
import com.atguigu.crud.bean.LeaveApplication;
import com.atguigu.crud.bean.Employee_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HRManagementService {

    private AttendanceMapper attendanceMapper;
    private LeaveApplicationMapper leaveApplicationMapper;
    private EmployeeMapper_1 employeeMapper;

    @Autowired
    public HRManagementService(AttendanceMapper attendanceMapper, LeaveApplicationMapper leaveApplicationMapper, EmployeeMapper_1 employeeMapper) {
        this.attendanceMapper = attendanceMapper;
        this.leaveApplicationMapper = leaveApplicationMapper;
        this.employeeMapper = employeeMapper;
    }

    // 考勤管理

    public void addAttendance(Attendance attendance) {
        try {
            attendanceMapper.insert(attendance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 计算出勤率等方法

    // 请假管理

    public void addLeaveApplication(LeaveApplication leaveApplication) {
        leaveApplicationMapper.insert(leaveApplication);
    }

    public List<LeaveApplication> getAllLeaveApplications() {
        return leaveApplicationMapper.getAllLeaveApplications();
    }

    // 员工管理

    public void addEmployee(Employee_1 employee) {
        employeeMapper.insert(employee);
    }


    // 其他自定义的方法

}
