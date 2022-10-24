<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/8
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        frame{
            height: 2000px;
        }
    </style>
</head>
<frameset frameborder="0" rows="60,*">
    <frame src="top.jsp" noresize="noresize" scrolling="no" />
    <frameset frameborder="0" cols="210,*">
        <frame src="${pageContext.request.contextPath}/StudentLeft.jsp" noresize="noresize" scrolling="no" />
        <frame noresize="noresize" scrolling="yes" name="main" />
        <!-- <frame noresize="noresize" scrolling="no" name="main"  src="首页.html"/> -->
    </frameset>
</frameset>
</html>
