<%@ page language="java" contentType="text/html; charset=UTF-8" import="fjnu.edu.Study.Controll.*,java.net.*" pageEncoding="UTF-8"%>
<html>
  <head>
    
    <title>My JSP 'logins.jsp' starting page</title>
    
	</head>

<BODY style="margin:0" style="background-image:url(images/copyof2.jpg)">
	<form action="UserRegiserServlet" method="post" style="margin:0">
		<div  style="height:900px;margin:0;border:solid #FFFFFF 1px">
		
			
					<center><h1 style="50%;margin-top:10%">C 学软件登录界面</h1>
		
					<div  style="background-image:url(images/bg_login_panel.png);;margin-top:50px;width:481px;height:242px ;border:solid;border-color:transparent;border-width:1">
							<div >
							<div style="margin-top:60px">
								<span >用户名:</span> 
								<input class="textbox" id="txtUserName" name="username" style="width: 185px; "/>
							</div>
								<br/>
								<span>密 码:</span>
								<input class="textbox" id="txtUserPassword" type="passsword" name="password" style="margin-left:18px;width: 185px; "/>
								
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
					
					</center>
		</div>
		<DIV id=div2 style="DISPLAY: none"></DIV>
		</CONTENTTEMPLATE>
	</form>
</BODY>
</html>