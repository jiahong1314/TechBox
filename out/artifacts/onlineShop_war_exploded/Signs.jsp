<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/13
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/punishment.css">
</head>
<body>
<div class="container">
    <div class="content">
        <div class="header clearfix">
            <div class="top fl">当前位置>发布公告</div>
            <div class="bottom fr">
                <a id="emit" href="javascript:;">编辑</a>
                <a id="keep" href="javascript:;">保存</a>
            </div>
        </div>
        <div class="main">
            <!--基础信息-->
            <div class="BasicInformation">
                <div class="title">公告信息</div>
            </div>
            <div>
            <c:forEach items="${signList}" var="sign">
                <li><a href="${pageContext.request.contextPath}/sign.do?id=${sign.id}" style="color: #2f2f2f">${sign.sign_name}
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        ${sign.sign_date}</a></li>

            </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>
