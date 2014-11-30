<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsppage1.jsp' starting page</title>
    
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
    This is MyJspPage1. <br>
    
    <form action="Page1JumpToPage2" method="post">
			<div class=univercity>福建师大</div>
			<div>
				<span>请输入您的信息并提交：</span>
			</div>
			<div >
				<span>学校:</span>
				<input value="福建师范大学" readonly name="daxue_name"/>
			</div>
			<div>
				<span>姓名:</span>
				<input style="text" id="name1" name="stu_name"/>
			</div>
			<div>
				<span>年龄:</span>
				<input style="text" id="age" name="stu_age"/>
			</div>
			<div>
				<span>性别:</span>
				<input type="radio" value="m" name="sex"/>男
				<input type="radio" value="n" name="sex"/>女			
			</div>
			<div>
				<span>选择照片:</span>
				<input type="file" name="stuphoto" size=60/>
			</div>
			<div>
				<span>爱好:</span>
				
				<input type="checkbox" name="pashan" value="hobby"/>爬山
				<input type="checkbox" name="youyong" value="hobby"/>游泳
				<input type="checkbox" name="paobu" value="hobby"/>跑步				
			</div>
			<div>
				<span>请选择籍贯:</span>
				<select>
					<option value="fz">福州</option>	
					<option value="xm">厦门</option>	
					<option value="qz">泉州</option>	
					<option value="ly">龙岩</option>	
				</select>
			</div>
			
			
			<div>
				<span>请输入自我简介：</span>
				
				<textarea name="stumemo"rows="8" cols="70"></textarea>
			</div>
		
			<div> <input type="submit" value="保存信息"/></div>
			
			</form>
    
  </body>
</html>
