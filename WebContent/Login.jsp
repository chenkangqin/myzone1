<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>欢迎扫码登录</title>
<link href="css/style1.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="http://code.jquery.com/jquery-latest.js"></script>
<meta name="keywords" content="App Loction Form,Login Forms,Sign up Forms,Registration Forms,News latter Forms,Elements"./>
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</script>

<!--webfonts-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<!--//webfonts-->

</head>
<body>
	<h1>我的博客</h1>
		<div class="app-location">
		<%if(request.getAttribute("notlove")==null){request.setAttribute("notlove",""); }%>
			<h2>游客访问,请扫码回答问题</h2><span style="color:#F00"><%=request.getAttribute("notlove") %></span>
			<div class="line"><span></span></div>
			<div class="location"><img src="images/LoginCode.png" class="img-responsive" alt="" /></div>
			<form action="loginservlet">
				<input type="text" class="text" value="你的答案" name="anser" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '你的答案';}" >
				<div class="submit"><input type="submit" id="submitbtn" value="访问" ></div>
				<div class="clear"></div>
			</form>
		</div>
	<!--start-copyright-->
   		
	<!--//end-copyright-->
</body>
</html>