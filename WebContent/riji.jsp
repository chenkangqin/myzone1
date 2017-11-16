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
           <form action="rijiservlet">
           	事件<input type="text" id="rijitext" name="rijitext" value=""/>
                                         时间<input type="text" id="rijiend" name="rijiend" value=""/>
           <input type="submit" value="保存" />
           </form>
           </div>
         <%List<Map<String,String>> shuoList=(List<Map<String,String>>)session.getAttribute("rijilist");
          if(shuoList.size()>0){
        	  for(int i=0;i<shuoList.size();i++){
          %>
          <ul class="say_box">
                     <div class="sy">
                         <p><%=shuoList.get(i).get("rijitext") %></p>
                     </div>
                  <span class="dateview"><%=shuoList.get(i).get("time") %></span>
          </ul>
          <%}} %>
          
          
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