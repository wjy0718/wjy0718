package com.atguigu.crud.dao;


import com.atguigu.crud.bean.Attendance;

public interface AttendanceMapper {

     int insert(Attendance record) throws Exception;



    Attendance selectByPrimaryKey(Integer id);
    int deleteByPrimaryKey(Integer id);
}
