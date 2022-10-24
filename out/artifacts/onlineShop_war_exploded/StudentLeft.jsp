<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/8
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/StudentLeft.css">
    <script src="js/jquery-1.9.1.min.js"></script>
</head>
<body>
<div class="nav">
    <div class="nav-list">
        <div class="nav-tit" id="personal">
            <a href="${pageContext.request.contextPath}/StudentInfo.do" target="main">
                <img src="images/personal-msg.png" style="height: 30px" alt="">
                <span>个人信息</span>
            </a>
        </div>
       <%-- <div class="personal-list" id="personal-child">
            <ul>
                <li><a href="FamilyInformation.html" target="main">家庭信息</a></li>
                <li><a href="StudentScInformation.html" target="main">学校信息</a></li>
                <li><a href="school-msg.html" target="main">学籍信息</a></li>
                <li><a href="punishment.html" target="main">处分信息</a></li>
            </ul>
        </div>--%>
       <%-- <div class="nav-tit">
            <a href="StudentInformation.html" target="main">
                <img src="images/archives-msg.png" alt="">
                <span>公告信息</span>
            </a>
        </div>--%>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/techboxInfo.jsp" target="main">
                <img src="images/job-msg.png" alt="">
                <span>社团信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/getSignInfo.do" target="main">
                <img src="images/job-change.png" alt="">
                <span>进行签到</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/password.jsp" target="main">
                <img src="images/modify-password.png" alt="">
                <span>修改密码</span>
            </a>
        </div>
    </div>
</div>

<script>
    $(document).ready(function(){
        $('#personal').on('click',function(){
            $('#personal-child').fadeToggle(300);
        });
        let aLi = $('#personal-child li');
        aLi.on('click',function(){
            $(this).addClass('active').siblings('li').removeClass('active');
        })
    });
</script>
</body>
</html>

