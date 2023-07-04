package com.atguigu.crud.dao;


import com.atguigu.crud.bean.LeaveApplication;
import java.util.List;

public interface LeaveApplicationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LeaveApplication record);

    int insertSelective(LeaveApplication record);

    LeaveApplication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LeaveApplication record);

    int updateByPrimaryKey(LeaveApplication record);

    List<LeaveApplication> getAllLeaveApplications();

    // 添加其他自定义的查询方法
}

