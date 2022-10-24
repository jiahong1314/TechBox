<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2020/12/7
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/TeacherInfo.css"/>
</head>
<body>
<div class="container flgure">
    <div class="content">
        <ul class="clearfix info">
            <li class="active">社团简介</li>

        </ul>
        <div class="basic">
            <br>
            <p style="font-size: 20px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Techbox研发中心（曾用名: "网络中心" ，“信息技术中心”）是全校公认的第一技术社团，我们有自己的培训、技术、硬件、项目实战以及在校实习等全方位的优势。
                我们挂靠于河北大学信息技术中心,负责着全校的网络，有自己的专业培训室，自己的服务器和集群，以及大量的真正项目、本校实习机会。
                无论是技术本身还是资源的配备，我们都是一流的。中心还与其他社团有良好的联系与交流，更有优秀毕业学长学姐资源（小米、新浪、京东、乐视、58……）！
            </p>
            <p style="font-size: 20px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;研发中心分为4个组，前端组、Java组、.Net组、Ue4组，每个组有不同的侧重方向，大家可以先了解一下每个组的具体研发方向，
                pick你自己感兴趣的研发组。每个组都会有专业的学长学姐为你进行耐心的讲解，只要你肯学，我们就会将我们所掌握的东西毫无保留的教给你们！
            </p>
            <p style="font-size: 20px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们致力于向喜欢计算机技术的你提供技术支持。我们免费，我们公益，我们热情洋溢；这里，可以提高你未来工作的资本，
                提高你未来薪资的水平；我们不看基础、不看专业，更不缺空调，只缺一个专注技术的你！
            </p>
            <p style="font-size: 20px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;加入我们，我们会帮你发现自己的闪光点，让你发现技术并创造技术，让你的大学生活如理想般充实、快乐！
                加入我们，腰不酸了，腿不痛了，连恋爱的问题都解决了！
            </p>
            <p style="font-size: 20px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;只要你足够优秀，一切皆有可能！时代由我们引领，未来由我们创造！
            </p>
            <p align="center">
                <img src="images/会徽.png" />
            </p>

        </div>
    </div>

    <script src="js/jquery-1.9.1.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript">
        $('.info li').click(function() {
            $(this).addClass("active").siblings().removeClass("active");
            $('.basic .select').eq($("ul li").index(this)).addClass("active").siblings().removeClass("active")
        });
        $('.basicInfo ol').on('click','li',function(){
            $(this).addClass('active').siblings().removeClass('active');
        });
        $('.payInfo ol').on('click','li',function(){
            $(this).addClass('active').siblings().removeClass('active');
        });
    </script>
</body>
</html>

