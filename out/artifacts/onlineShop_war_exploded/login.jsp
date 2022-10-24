<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/11/30
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
        .code
        {

            font-family:Arial;
            font-style:italic;
            color:Red;
            border:0;
            padding:2px 3px;
            letter-spacing:3px;
            font-weight:bolder;
        }
        .unchanged
        {
            border:0;
        }
    </style>
    <script type="text/javascript">
        function validate()
        {

            var Id=document.forms["myForm"]["Id"].value;
            var reg= /^[A-Za-z0-9]{6,12}$/;

            if(!Id.match(reg))
            {
                alert("登陆账号必须由六到十二英文字符或数字组成，以英文字母开头");
                return false;
            }
            var Pass=document.forms["myForm"]["Pass"].value;
            reg= /^[A-Za-z0-9]{8,20}$/;
            if(!Pass.match(reg))
            {
                alert("密码必须由八位以上英文字符或数字组成");
                return false;
            }

            var Xue=document.forms["myForm"]["Xue"].value;
            reg= /^[0-9]{8}$/;
            if(!Xue.match(reg))
            {
                alert("要求八位数字组成，前四位为“2018”开头");
                return false;
            }
            var E_mail=document.forms["myForm"]["E_mail"].value;
            reg=/^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$/g;
            if(!E_mail.match(reg))
            {
                alert("邮箱请输入正确格式");
                return false;
            }
        }

    </script>
</head>
<body >
<form name="myForm" action="${pageContext.request.contextPath}/LoginServlet" onsubmit="return validate()" method="post" >
    <label>登陆账号</label>
    <input  name="Id" type="text" value="" /><br>
    <label >登陆密码</label>
    <input type="Pass" name="Pass" ><br>
    <label >性别</label>
    <input name="Sex" type="radio" value="女">女  
    <input name="Sex" type="radio" value="男">男<br>
    <label >姓名</label>
    <input  name="Name" type="text" value="" /><br>
    <label >学号</label>
    <input  name="Xue" type="text" value="" /><br>
    <label >电子邮件</label>
    <input  name="E_mail" type="text" value="" /><br>
    <label >所在学院</label>
    <input  name="Yuan" type="text" value="" /><br>
    <label >所在系</label>
    <input  name="Xi" type="text" value="" /><br>
    <label >所在班级</label>
    <input  name="Ban" type="text" value="" /><br>
    <label >入学年份（届）</label>
    <select name="Nian">
        <%for(int i=1998;i<2020;i++){ %>
        <option value="<%=i%>"><%=i %></option>
        <%} %>
    </select><br>
    <label >生源地</label>
    <input  name="Di" type="textarea" value="" /><br>
    <label >备注</label>
    <textarea name="Bei" rows="20" cols="20"></textarea><br>
    <button type="submit">注册</button>
    <button type="reset" >重置</button>
</form>
</body>
</html>
