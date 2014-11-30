<%@ page language="java" import="java.util.*,fjnu.edu.Study.domain.User" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>

  <body>
  
   <%
    	User user = null;
    	user = (User)session.getAttribute("username");
    	if(null==user){//跳转到login.jsp
    	%>
    		<jsp:forward page="login.jsp"/>
    	<%
    	}else{//显示welcome信息,以及右上角的"个人信息|退出"超链接
    	%>
    	<h1>欢迎进入C学软件！</h1>
    	<hr/>
    	<%
    		out.print(user.getUsername()+",");
    	%>
    		欢迎来到首页！<br><br>
    		<a href="userinfo.jsp">个人信息</a><br/>
    		<a href="LogoutAction" onclick="alert('注销成功!');return confirm('返回首页...')">注销</a>
    	<%}%>

  </body>
</html>
