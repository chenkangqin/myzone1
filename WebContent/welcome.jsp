<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv='refresh' content='3;url=index.jsp'>
<script type='text/javascript'>  
var i=3;  
function getTime(){  
document.getElementById('num').innerHTML="<font color='red'>"+i+"</font>";  
i-=1;  
var x=setTimeout('getTime()',1000)//1000毫秒=1秒  
if(i<=0){  
clearTimeout(x);  
}  
}  
window.onload=getTime;//开始执行倒计时  
</script>
<title>欢迎登陆我的空间</title>
</head>
<body>
	<div align="center">
	<h1>我是陈康钦，欢迎来到我的博客，如有交流请留言！！</h1>
	<h2>  
     ${message}<br>  
            注意!!页面将在<span id='num' style='display=inline;'>3</span>秒后跳转至主页  
        </h2>
	</div>
</body>
</html>