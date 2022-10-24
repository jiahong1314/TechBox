<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/4
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/TeacherPersonalInfo.css">
</head>
<body>
<div class="container flgure">
    <div class="content">
        <ul class="clearfix info">
            <li class="active">基础信息</li>

        </ul>
        <form action="${pageContext.request.contextPath}/ChairmanUpdate.do" method="post">
            <div class="basic">
                <div class="select active">
                    <p>
                        <!-- <span>编辑</span>
                         <span style="margin-left: 20px">保存</span>-->
                        <input type="submit" value="保存" style="width:60px; height:40px;margin-right: 40px" />
                    </p>
                    <div class="left fl">
                        <div>
                            <label for="">姓名：</label>
                            <input type="text" value="${chairman.stuName}" name="username">
                        </div>
                        <div>
                            <label for="">年龄：</label>
                            <input type="text" value="${chairman.age}" name="age">
                        </div>
                        <div>
                            <label for="">学号：</label>
                            <input type="text" value="${chairman.stuNum}" name="num">
                        </div>
                        <div>
                            <label for="">年级：</label>
                            <input type="text" value="${chairman.grade}" name="grade">
                        </div>
                        <div>
                            <label for="">专业：</label>
                            <input type="text" value="${chairman.major}" name="major">
                        </div>

                    </div>
                    <div class="right fr">
                        <div>
                            <label for="">所在学院：</label>
                            <input type="text" value="${chairman.college}" name="college">
                        </div>
                        <div>
                            <label for="">任职日期：</label>
                            <input type="text" value="${chairman.date}" name="date">
                        </div>
                        <div class="label">
                            <label for="">手机号码：</label>
                            <input type="text" value="${chairman.phoneNum}" name="phoneNum">
                        </div>
                        <div>
                            <label for="">QQ号码：</label>
                            <input type="text" value="${chairman.qq}" name="qq">
                        </div>
                        <div>
                            <label for="">电子邮箱：</label>
                            <input type="email" value="${chairman.email}" name="email">
                        </div>
                    </div>

                </div>

                <!-- <input type="submit" value="保存" style="width:100px; height:40px;margin-left: 120px" />-->
            </div>
        </form>
    </div>
</div>
<script src="js/jquery-1.9.1.min.js"></script>
<script>
    $('.info li').click(function() {
        $(this).addClass("active").siblings().removeClass("active");
        $('.basic .select').eq($("ul li").index(this)).addClass("active").siblings().removeClass("active")
    })
</script>
</body>
</html>
