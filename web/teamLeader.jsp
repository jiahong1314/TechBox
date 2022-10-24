<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/10
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/StudentInfo.css"/>
</head>
<body>
<div class="container flgure">
    <div class="content">
        <ul class="clearfix info">
            <li class="active">组长信息</li>

        </ul>
        <div class="basic">
            <div class="basicInfo select active">
                <table border="0" cellspacing="0" cellpadding="0">
                    <thead>
                    <tr>
                        <th>姓名</th>
                        <th>学号</th>
                        <th>组别</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${stuList}" var="stu">
                        <form action="${pageContext.request.contextPath}/ChairmanDelLeader.do" method="post">
                            <tr>
                                <td align="center"><input type="text" value="${stu.stuName}"name="stu_name" style="width: 100px;border:0px;background-color: #e7f2f9;text-align: center"/></td>
                                <td align="center"><input type="text" value="${stu.stuNum}" name="stu_num" style="width: 100px;border:0px;background-color: #e7f2f9;text-align: center"/></td>
                                <td align="center"><input type="text" value="${stu.groupName}" name="stu_group" style="width: 100px;border:0px;background-color: #e7f2f9;text-align: center"/></td>
                                <td align="center"><input type="submit" value="删除" style="border:0px;background-color: #e7f2f9;" /></td>
                            </tr>
                        </form>
                    </c:forEach>
                    </tbody>
                </table>
                <a href="${pageContext.request.contextPath}/addLeader.jsp" style="margin-left: 350px;">添加组长</a>
            </div>
        </div>
    </div>
</div>


</body>
</html>

