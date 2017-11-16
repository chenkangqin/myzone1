<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>碎言碎语-个人博客</title>
<meta name="keywords" content="个人博客" />
<meta name="description" content="" />
<link rel="stylesheet" href="css/index.css"/>
<link rel="stylesheet" href="css/style.css"/>
<script type="text/javascript" src="js/jquery1.42.min.js"></script>
<script type="text/javascript" src="js/jquery.SuperSlide.2.1.1.js"></script>
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script type="text/javascript">
$(document).ready(function(){  
});
function updateshuoshuo(){
	var shuotext=$('#shuotext').val();
	$.get("shuoservlet?shuotext="+shuotext,reflesh());
	$('#shuotext').val("");
}
function reflesh(){
	
	$("#say").load();
	
}
</script>
</head>

<body>
    <!--header start-->
    <div id="header" onload="alert('load')">
     <h1>陈康钦</h1>
      <p>欲穷千里目，更上一层楼。</p>   
      <div id="nav">
         <ul>
         <li><a href="index.jsp">首页</a></li>
         <li><a href="about.html">关于我</a></li>
         <li><a href="shuo.jsp">碎言碎语</a></li>
         <li><a href="riji.jsp">备忘录</a></li>
         <li><a href="mail.jsp">代发邮箱</a></li>
         <li><a href="learn.html">学无止境</a></li>
         <li><a href="guestbook.html">留言板</a></li>
         <div class="clear"></div>
        </ul>
      </div>
    </div>
    <!--header end-->
    <!--content start-->
    <div id="say" onload="">
     <div class="weizi">
           <div class="wz_text">当前位置：<a href="#">首页</a>><h1>碎言碎语</h1></div>
           </div>
           <div>
           <form action="">
           <input type="text" id="shuotext" name="shuoname" value=""/>
           <input type="button" value="发表说说" onclick="updateshuoshuo()"/>
           </form>
           </div>
          <%List<Map<String,String>> shuoList=(List<Map<String,String>>)session.getAttribute("shuolist");
          if(shuoList.size()>0){
        	  for(int i=0;i<shuoList.size();i++){
          %>
          <ul class="say_box">
                     <div class="sy">
                         <p><%=shuoList.get(i).get("shuotext") %></p>
                     </div>
                  <span class="dateview"><%=shuoList.get(i).get("time") %></span>
          </ul>
          <%}} %>
     </div>
    <!--content end-->
    <!--footer-->
    <div id="footer">
     <p>Design by:陈康钦2017-11-01</p>
    </div>
    <!--footer end-->
    <script type="text/javascript">jQuery(".lanmubox").slide({easing:"easeOutBounce",delayTime:400});</script>
    <script  type="text/javascript" src="js/nav.js"></script>
</body>
</html>