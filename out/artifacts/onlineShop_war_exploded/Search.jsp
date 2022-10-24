<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/4
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/search.css">
</head>

<body>
<div class="container">
    <div class="search-content content clearfix">
        <div class="search-bar  clearfix ">
            <form action="${pageContext.request.contextPath}/SearchStudent.do" method="post">
            <div class="bar-content clearfix fl">
                <input type="text" value="" class="fr" name="num" />
            </div>
            <input type="submit" value="搜索" class="search-font fr" name="submit" />
            </form>
            <div class="word fl">建议搜索词汇</div>
            <div class="list fl ">
                <ul class="clearfix">
                    <li>学号</li>
                    <li>姓名</li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>

</html>
