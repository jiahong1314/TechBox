<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/11/30
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>TechBox研发中心</title>
  <link rel="stylesheet" type="text/css" href="css/login.css"/>
  <script src="js/jquery-1.9.1.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div class="login">
  <div class="content clearfix">
    <div class="content-left">
      <div class="logo">
        <img src="images/TechBox_logo.png" alt=""/>
        <p>TechBox研发中心社团管理系统</p>
      </div>
    </div>
    <div class="shu"></div>
    <div class="content-right">
      <div class="login-form">
        <h2>用户登录/LOGIN</h2>
        <form action="${pageContext.request.contextPath}/login.do" method="post">
          <div class="identifire">
            <span>身　份：</span>
            <select name="selectName">
              <option value="2" selected="selected">组员</option>
              <option value="1">组长</option>
              <option value="0">会长</option>
            </select>
          </div>
          <div class="account clearfix">
            <span>账　号：</span>
            <input type="text" value="" name="username" />
          </div>
          <div class="password clearfix">
            <span>密　码：</span>
            <input type="password" value="" name="password"/>
          </div>
          <%--<div class="code clearfix">
            <span>验证码：</span>
            <input type="text" value="" name="verify" />
            <em></em>
          </div>--%>
          <div class="btn">
            <input type="submit" value="登录"/>
            <p>${msg}</p>
            <%--<span class="forget"><a href="">忘记密码</a></span>--%>
          </div>
        </form>
      </div>
    </div>
  </div>
</div>
</body>
</html>

