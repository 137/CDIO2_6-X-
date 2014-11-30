<%@ page language="java" contentType="text/html; charset=UTF-8" import="fjnu.edu.Study.Controll.*,java.net.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	if(request.getAttribute("user")==null){
		String username=null;
		String password=null;
		
		Cookie[] cookies=request.getCookies();
		for(int i=0;cookies!=null && i<cookies.length;i++){
			if(cookies[i].getName().equals("user")){
				username=URLDecoder.decode(cookies[i].getValue().split("-")[0],"UTF-8");
				password=URLDecoder.decode(cookies[i].getValue().split("-")[1],"UTF-8");
		 }
		if(username==null){
			username="";
		}
		
		if(password==null){
			password="";
		}
		
		pageContext.setAttribute("username", username);
		pageContext.setAttribute("password", password);
	}
	}
%>

<title>登录页</title>
       <script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-1.5.1.js"></script>
       <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
       <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet">
       <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
       <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
       <script type="text/javascript">
         function loadImage(){
	     document.getElementById("randImage").src = "${pageContext.request.contextPath}/image.jsp?"+Math.random(); //Math.random()方法非常重要，它使每次的请求都不同以便重新发送。如果每次的请求都一样，那么不会重新生成页面
         }
      </script>
<style type="text/css">

h1 {
	color: #fff;
	background: #06b;
	padding: 10px;
	font-size: 400%;
	text-align: center;
}
body,div,dl,dt,dd,ul,ol,li,h1,h2,h3,h4,h5,h6,pre,form,fieldset,input,p,blockquote,th,td
	{
	margin: 0;
	padding: 0;
}
h2{
	color:blue;
}
</style>
</head>
<body style="margin:0" style="background-image:url(images/copyof2.jpg)" onload="registerOrNo()" >
	<form action="UserServlet" method="post" style="margin:0">
		<div  style="height:900px;margin:0;border:solid #FFFFFF 1px">
					<center><h1 style="50%;margin-top:5%">C 学软件登录界面</h1>
					<div  style="background-image:url(images/bg_login_panel.png);margin-top:90px;width:481px;height:242px ;border:solid;border-color:transparent;border-width:1">
							<div >
							<div style="margin-top:60px">
								<span style="color: white;font-weight: bold;font-size: 18px;">用户名:</span> 
								<input class="textbox" id="txtUserName" name="username" style="width: 185px;margin-left:12px; "/>
							</div>
								<br/>
								 <span style="color: white;font-weight: bold;font-size: 18px">密 码:</span>
								<input class="textbox" id="txtUserPassword" type="password" name="password" style="margin-left:18px;width: 185px; "/>
								<br/>
								<label class="checkbox">
								<input id="remember" name="remember" type="checkbox" value="remember-me" />记住我一周
								</label>
								<br/>
								<input id="btnLogin" type="submit" value=" 登录 " name="login" align="center" 
								style="width: 270px; height: 33px;font-weight:bold;font-size:16px;color:green"/>
								<br/>
								<div style="margin-right:50px;float:right">
								<a href="Regist.jsp" >注册用户</a>
								</div>
					</div>
				</div>	
				<div style="font-size: 18px;font-weight: bold"><font color="red">${error}</font></div>
			</center>
		</div>
		<DIV id=div2 style="DISPLAY: none"></DIV>
		</CONTENTTEMPLATE>
	</form>
</body>
</html>