<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/4
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/StudentLeft.css">
</head>
<body>
<div class="nav">
    <div class="nav-list">
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/ChairManInfo.do" target="main">
                <img src="images/archives-msg.png" alt="">
                <span>个人信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/techboxInfo.jsp" target="main">
                <img src="images/job-msg.png" alt="">
                <span>社团信息</span>
            </a>
        </div>
        <div class="nav-tit" id="personal">
            <a  target="main">
                <img src="images/PubMed-msg.png" alt="">
                <span>社团成员</span>
            </a>
        </div>
        <div class="personal-list" id="personal_child">
            <ul>
                <li><a href="${pageContext.request.contextPath}/SearchGroupJava.do?groupName=java组" target="main">java组</a></li>
                <li><a href="${pageContext.request.contextPath}/SearchGroupJava.do?groupName=python组" target="main">python组</a></li>
                <li><a href="${pageContext.request.contextPath}/SearchGroupJava.do?groupName=.net组" target="main">.net组</a></li>
                <li><a href="${pageContext.request.contextPath}/SearchGroupJava.do?groupName=前端组" target="main">前端组</a></li>
                <!--<li><a href="TeacherPubMed.html" target="main">ue4组</a></li>-->
            </ul>
        </div>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/GroupLeader.do" target="main">
                <img src="images/personal-msg.png" alt="">
                <span>组长信息</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="${pageContext.request.contextPath}/password.jsp" target="main">
                <img src="images/modify-password.png" alt="">
                <span>修改密码</span>
            </a>
        </div>
        <div class="nav-tit">
            <a href="Search.jsp" target="main">
                <img src="images/soso-white.png" alt="">
                <span>搜索</span>
            </a>
        </div>
    </div>
</div>

<script src="js/jquery-1.9.1.min.js" type="text/javascript" charset="utf-8"></script>
<script>
    $(document).ready(function(){
        $('#personal').on('click',function(){
            $('#personal_child').fadeToggle(300);
        });
        let aLi = $('#personal_child li');
        aLi.on('click',function(){
            $(this).addClass('active').siblings('li').removeClass('active');
        })
    });
</script>
</body>
</html>
