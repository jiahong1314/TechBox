<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/9
  Time: 17:16
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
            <span>当前位置>修改密码</span>
        </div>
        <form action="${pageContext.request.contextPath}/UpdatePassword.do" method="post">
        <div class="revise-content clearfix ">
            <div class="list fr"><label>新密码</label> : <input type="password" value="" name="password"/></div>
            <div class="list fr "><label>确认密码</label> : <input type="password" value="" name="password1"/></div>
        </div>
            <p align="center"><font color="red" style="text-align: center">${updatemsg}</font></p>
        <div class="list1 "> <input type="submit" value="提交" name="username"/></div>
        </form>
    </div>
</div>
</body>
</html>
