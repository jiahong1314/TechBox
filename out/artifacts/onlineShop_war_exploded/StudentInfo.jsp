<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/8
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/student.css">
    <script src="js/jquery-1.9.1.min.js"></script>
</head>
<body>
<div class="container">
    <form action="${pageContext.request.contextPath}/StudentUpdate.do" method="post">
    <div class="content">
        <div class="header clearfix">
            <div class="top fl">当前位置>个人信息</div>
            <div class="bottom fr">
                <a id="emit" href="javascript:;">编辑</a>
                <!--<a id="keep" href="javascript:;">保存</a>-->
                <input type="submit" value="保存" style="border:0px;background-color: white;font-size: 12pt;color: #646464;margin-left: 10px;" />
            </div>
        </div>
        <div class="main">
            <!--基础信息-->
            <div class="BasicInformation">
                <div class="title">
                    基础信息
                </div>
            </div>
            <div class="content clearfix">
                <div class="left fl">
                    <div>
                        <label for="">姓名：</label>
                        <input name="stu_name" type="text" value="${student.stu_name}" disabled />
                    </div>
                    <div>
                        <label for="">性别：</label>
                        <input name="stu_sex" type="text" value="${student.stu_sex}" disabled />
                    </div>
                    <div>
                        <label for="">专业：</label>
                        <input name="stu_major" type="text" value="${student.stu_major}" disabled>
                    </div>
                    <div>
                        <label for="">学院：</label>
                        <input name="stu_college" type="text" value="${student.stu_college}" disabled>
                    </div>
                </div>
                <div class="right fr">
                    <div>
                        <label for="">学号：</label>
                        <input name="stu_num" type="text" value="${student.stu_num}" disabled>
                    </div>
                    <div>
                        <label for="">年龄：</label>
                        <input name="stu_age" type="text" value="${student.stu_age}" disabled>
                    </div>
                    <div>
                        <label for="">组别：</label>
                        <input name="stu_group" type="text" value="${student.stu_group}" disabled>
                    </div>
                    <div>
                        <label for="">年级：</label>
                        <input name ="stu_grade" type="text" value="${student.stu_grade}" disabled>
                    </div>

                </div>
            </div>
            <!--联系方式-->
            <div class="BasicInformation">
                <div class="title">联系方式</div>
            </div>
            <div class="content clearfix">
                <div class="left fl">
                    <div>
                        <label for="">手机号码：</label>
                        <input name="stu_phone" type="text" value="${student.stu_phone}" disabled>
                    </div>
                    <div>
                        <label for="">QQ号码：</label>
                        <input name="stu_qq" type="text" value="${student.stu_qq}" disabled>
                    </div>
                </div>
                <div class="right fr">
                    <div>
                        <label for="">电子邮箱：</label>
                        <input name="stu_email" type="text" value="${student.stu_email}" class="mailbox" disabled>
                    </div>
                </div>
            </div>
            <!--辅导员信息-->
            <div class="BasicInformation">
                <div class="title">
                    成绩
                </div>
            </div>
            <div class="content clearfix">
                <div class="left fl">
                    <div>
                        <label for="">签到次数：</label>
                        <label for="">${student.sign_num}</label>
                    </div>

                </div>
                <div class="right fr">
                    <div>
                        <label for="">成绩：</label>
                        <label for="">${student.stu_score}</label>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form>
</div>
<script>
    $('#politics i').on('click', function() {
        $(this).siblings('ul').show();
    });
    $('#politics ul li').on('click', function() {
        var selTxt = $(this).text();
        $('#politics a').text(selTxt);
        $('#politics ul').hide();
    });
    $('#child i').on('click', function() {
        $(this).siblings('ul').show();
    });
    $('#child ul li').on('click', function() {
        var selTxt = $(this).text();
        $('#child a').text(selTxt);
        $('#child ul').hide();
    });
    $('#emit').on('click',function(){
        $('input').removeAttr('disabled');
    });
    $('#keep').on('click',function(){
        $('input').attr('disabled','disabled');
    });
    $(document).ready(function(){
        $.ajax({
            url: "http://101.201.154.205:9090/bm/bmList",
            type: 'post',
            data: {
                t: Math.random()
            },
            dataType: 'jsonp',
            'jsonp': 'callback'
        }).then(function(res){
            console.log(res)
            //      		var stu_name = $('#stu_name').val();
            for (var i=0; i<res.length; i++) {
                $('#stu_name').attr('value',res[i].stu_name);
                $('#sex').attr('value',res[i].sex);
                $('#xstu_id').attr('value',res[i].xstu_id);
                $('#idNumber').attr('value',res[i].idNumber);
                $('#birthday').attr('value',res[i].birthday);
                $('#national_name').attr('value',res[i].national_name);
                $('#qq').attr('value',res[i].qq);
                $('#phone').attr('value',res[i].phone);
                $('#e_mail').attr('value',res[i].e_mail);
                $('#pl_name').text(res[i].pl_name);
            }
        },function(){
            console.log('error');
        });
    });
</script>

</body>
</html>
