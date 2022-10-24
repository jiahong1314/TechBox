<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/4
  Time: 17:27
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
        .bx{
            height: 60px;
            width: 100%;
            background: #177ec1;
        }
        .bx .container{
            margin: 0 60px;
            overflow: hidden;
        }
        .bx .container .left{
            width: 201px;
            height: 43px;
            padding-top: 19px;
            color: #FFFFFF;
            font-size: 24px;
            float: left;
        }
        .bx .container .right{
            overflow: hidden;
            width: 124px;
            padding-top: 19px;
            float: right;
        }
        .bx .container .right span{
            font-size: 16px;
            color: #fff;
        }
        .bx .container .right .l{
            float: left;
        }
        .bx .container .right .r{
            float: right;
        }
    </style>
</head>
<body>
<div class="bx">
    <div class="container">
        <h2 class="left">TechBox研发中心</h2>
        <div class="right">
            <a class="l" href="${pageContext.request.contextPath}/index.jsp" target="_blank">注销</a>
            <a class="r" href="${pageContext.request.contextPath}/loginout.jsp" target="_blank">退出登录</a>
        </div>
    </div>
</div>
</body>
</html>

