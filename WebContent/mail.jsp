<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>个人博客</title>
<meta name="keywords" content="个人博客" />
<meta name="description" content="" />
<link rel="stylesheet" href="css/index.css"/>
<link rel="stylesheet" href="css/style.css"/>
<link rel="stylesheet" href="css/animate.css"/>
<script type="text/javascript" src="js/jquery1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
</head>

<body>
      <!--header start-->
    <div id="header">
      <h1>个人博客</h1>
      <p>欲穷千里目，更上一层楼。</p>    
    </div>
     <!--header end-->
    <!--nav-->
     <div id="nav">
        <ul>
         <li><a href="index.jsp">首页</a></li>
         <li><a href="about.html">关于我</a></li>
         <li><a href="shuo.jsp">碎言碎语</a></li>
         <li><a href="riji.jsp">备忘录</a></li>
         <li><a href="mail.jsp">代发邮件</a></li>
         <li><a href="learn.html">学无止境</a></li>
         <li><a href="guestbook.html">留言板</a></li>
         <div class="clear"></div>
        </ul>
      </div>
       <!--nav end-->
    <!--content start-->
    <div id="say">
     <div class="weizi">
           <div class="wz_text">当前位置：<h1>备忘录</h1></div>
           </div>
           <div>
           <form action="mailservlet">
           	<table>
           	<tr>
           	收件人：<input type="text" style="width: 500px" name="targetmail" /> 验证码<input type="password" name="password"/>
           	</tr>
           	<tr>
           	标题：<input type="text" style="width:500px" name="title"/>
           	</tr>
           	<tr>
           	<textarea style="width: 800px;height: 500px" name="maintext">from:chenkangqin</textarea>
           	</tr>
           	<tr><input type="submit" name="发送"/></tr>
           	</table>
           </form>
           </div>
         
          
          
     </div>
    <!--content end-->
    <!--footer-->
    <div id="footer">
     <p>Design by:陈康钦 2017-11-01</p>
    </div>
    <!--footer end-->
    <script type="text/javascript">jQuery(".lanmubox").slide({easing:"easeOutBounce",delayTime:400});</script>
    <script  type="text/javascript" src="js/nav.js"></script>
</body>
</html>