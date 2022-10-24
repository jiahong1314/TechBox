<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/11
  Time: 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/StudentRevise.css">
</head>
<body>
<div class="container information-content">
    <div class="content">
        <div class="information-title">
            <span>当前位置>添加组长</span>
        </div>
        <form action="${pageContext.request.contextPath}/addLeader.do" method="post">
        <div class="revise-content clearfix ">

            <div class="list fr"><label>学号</label> : <input type="text" value="" name="stu_num"/></div>
            <div class="list fr "><label>组别</label> : <input type="text" value="" name="group"/></div>
        </div>
        <div class="list1 "> <input type="submit" value="提交"/></div>
        </form>
    </div>
</div>
</body>
</html>
