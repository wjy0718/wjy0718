<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>考勤管理</title>
</head>
<body>
<h1>考勤管理</h1>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
        src="${APP_PATH }/static/js/jquery-1.12.4.min.js">
</script>
<link
        href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
        rel="stylesheet">
<script
        src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js">
</script>


<h2>添加考勤记录</h2>

    <label for="employeeId">员工ID:</label>
    <input type="text" id="id"><br>

    <label for="date">日期:</label>
    <input type="date" id="date"><br>

    <label for="signInTime">签到时间:</label>
    <input type="text" id="signInTime"><br>

    <label for="signOutTime">签退时间:</label>
    <input type="text" id="signOutTime"><br>

    <button type="submit" onclick="submitAttendanceForm()">提交</button>


<h2>计算出勤率</h2>
<form action="${APP_PATH}/attendance/calculateAttendanceRate" method="POST">
    <input type="submit" value="计算">
</form>

<h2>迟到早退记录</h2>
<table>
    <thead>
    <tr>
        <th>员工ID</th>
        <th>日期</th>
        <th>迟到次数</th>
        <th>早退次数</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="attendance" items="${attendanceRecords}">
        <tr>
            <td>${attendance.employeeId}</td>
            <td>${attendance.date}</td>
            <td>${attendance.lateCount}</td>
            <td>${attendance.earlyLeaveCount}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h2>请假申请</h2>
<form action="${APP_PATH}/leaveApplication/apply" method="POST">
    <label for="employeeId">员工ID:</label>
    <input type="text" id="employeeId" name="employeeId"><br>

    <label for="startDate">开始日期:</label>
    <input type="date" id="startDate" name="startDate"><br>

    <label for="endDate">结束日期:</label>
    <input type="date" id="endDate" name="endDate"><br>

    <label for="leaveType">请假类型:</label>
    <input type="text" id="leaveType" name="leaveType"><br>

    <input type="submit" value="提交">
</form>
<script>
    function submitAttendanceForm() {
        // 获取表单数据
        var employeeId = $("#id").val();
        var date = $("#date").val();
        var signInTime = $("#signInTime").val();
        var signOutTime = $("#signOutTime").val();

        // 创建一个对象保存表单数据
        var data = {
            employeeId: employeeId,
            date: date,
            signInTime: signInTime,
            signOutTime: signOutTime
        };

        // 使用AJAX方式提交表单数据
        $.ajax({
            url: "${APP_PATH}/attendance/add",
            type: "POST",
            contentType: "application/json",
            data: data,
            success: function(response) {
                // 处理成功响应
                // alert("考勤记录添加成功");
                // alert(data)
                // 刷新页面或进行其他操作
            },
            error: function(xhr, status, error) {
                // 处理错误响应
                alert("添加考勤记录失败: " + error);
                alert(data)
            }
        });
    }
</script>

</body>
</html>
