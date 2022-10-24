<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/13
  Time: 20:57
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
        <form action="${pageContext.request.contextPath}/doSign.do" method="post">
            <div class="header clearfix">
                <div class="top fl">当前位置>发布公告</div>
                <%--<div class="bottom fr">
                    <input type="submit" value="签到" style="border:0px;background-color: white;font-size: 12pt;color: #646464;margin-left: 10px;" />
                </div>--%>
            </div>

            <div class="main">
                <!--基础信息-->

                <div class="BasicInformation">
                    <div class="title">签到信息</div>
                </div>

                <div class="content clearfix">
                    <div class="left fl">
                        <div>
                            <label for="">签到名称：</label>
                            <input type="text" value="${sign.sign_name}" name="sign_name" disabled>
                        </div>
                        <div>
                            <label for="">签到日期：</label>
                            <input type="date" value="${sign.sign_date}" name="sign_date" disabled>
                        </div>
                    </div>
                    <div class="right fr">
                        <div>
                            <label for="">签到内容：</label>
                            <input type="text" value="${sign.sign_content}" name="sign_content"disabled>
                        </div>
                        <div>
                            <label for="">发布人姓名：</label>
                            <input type="text" value="${sign.admin}" name="admin"disabled>
                        </div>
                    </div>
                    <div class="reason fl">
                        <p>签到要求：</p>
                        <div>
                            <textarea name="sign_rule"  disabled>${sign.sign_rule}</textarea>
                        </div>
                        <input type="submit" value="签到" style="height: 40px;margin-left: 250px;"/>

                    </div>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
</html>
