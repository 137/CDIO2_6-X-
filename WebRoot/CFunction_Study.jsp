<%@ page language="java" contentType="text/html; charset=UTF-8" import="fjnu.edu.Study.Controll.*,java.net.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Morning Dew
Description: A three-column, fixed-width blog design.
Version    : 1.0
Released   : 20091014

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>CStudy学习软件</title>
<meta name="keywords" content="" />
<meta name="Morning Dew" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/closeAndopen.js"></script>
<script>
	function showExam(){
		alert("开始调用显示函数功能");
		document.getElementById("totalTable").style.display = "none";
		document.getElementById("functionInfoByType").innerHTML+='<%=request.getAttribute("functionType")%>';
		//alert(exam+"2");
	}
	
</script>
</head>
<body>
<form method="post" action="CFunctionServlet">
	<div id="wrapper">
		<div id="menu">
			<ul id="main">
				<li class="current_page_item"><a href="mains.jsp">基础知识学习</a></li>
					<li><a href="CFunction_Study.jsp">函数查询</a></li>
					<li><a href="PracticeByYourself.jsp">题目练习和评分</a></li>
					<li><a href="My_note.jsp">我的笔记整理</a></li>
					<li><a href="My_Error_Title.jsp">我的错题整理</a></li>
			</ul>
		</div>
		<!-- start header -->
		<div id="header">
			<div id="logo">
				<h1>
					<a><span style="font-size: 44px">欢迎进入Cstudy函数功能查询界面</span></a>
				</h1>
				<p>设计人员：Fjnu_CDIO_6</p>
			</div>
		</div>
		<!-- end header -->
		<!-- start page -->
		<div id="page">
			<div id="sidebar1" class="sidebar">
				<ul>
					<li>
						<h2><span style="font-size: 20px">所有函数说明列表</span></h2>
						<ul style="font-size:20px">
							<li><a href="/CDIO_Cstudy/CFunctionServlet" onclick="showExam()">函数总目录</a></li>
							<li><a href="#">字符函数</a></li>
							<li><a href="#">数学函数</a></li>
							<li><a href="#">输入/输出函数</a></li>
							<li><a href="#">标准库函数</a></li>
							<li><a href="#">字符串函数</a></li>
							<li><a href="#">系统库函数</a></li>
							<li><a href="#">动态内存分配函数</a></li>
						</ul>
						</ul>
					</li>
					
				</ul>
			</div>
			<!-- start content -->
			<div id="content">
				<div class="post">
				<input type="button" value="显示" onclick="showExam();"/>
					<h1 style="color:#6DC5F3" style="font-size:40px"
						style="padding: 30px 0 4px 0px" style="face:verdana">欢迎进入函数查询界面</h1>
					<div id="totalTable">
						<table width="450" border="1px" bordercolor="#000000"
							style="border-collapse:collapse" style="font-size:20px"
							style="color:black">
							<thead>
								<tr>
									<th>函数类型</th>
									<th>描述</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>函数总目录</td>
									<td>C语言中所有函数的总目录</td>
								</tr>
								<tr>
									<td>字符函数</td>
									<td>C语言所有字符函的数总目录</td>
								</tr>
								<tr>
									<td>数学函数</td>
									<td>C语言所有数学函数的总目录</td>
								</tr>
								<tr>
									<td>输入/输出函数</td>
									<td>C语言所有输入/输出函数的总目录</td>
								</tr>
								<tr>
									<td>标准库函数</td>
									<td>C语言所有标准库函数的总目录</td>
								</tr>
								<tr>
									<td>字符串函数</td>
									<td>C语言所有字符串函数的总目录</td>
								</tr>
								<tr>
									<td><a a href='#'>系统库函数</a></td>
									<td>C语言所有系统库函数的总目录</td>
								</tr>
								<tr>
									<td>动态内存分配函数</td>
									<td>C语言所有动态内存分配函数函数的总目录</td>
								</tr>
							</tbody>

						</table>
					</div>
					<div id="functionInfoByType"></div>
				</div>
				
			</div>
			<!-- end content -->
			<!-- start sidebars -->
			<div id="sidebar2" class="sidebar">
				<ul>
					<li>
						<form id="searchform" method="get" action="#">
							<div>
								<h2>搜索</h2>
								<input type="text" name="s" id="s" size="15" value="" />
							</div>
						</form>
					</li>
					<li>
						<h2>标签</h2>
						<p class="tag">
							<a href="#">类</a> <a href="#">继承</a> <a href="#">多态</a>
							<a href="#">指针</a> <a href="#">io流</a> <a href="#">函数</a>
							<a href="#">变量</a> <a href="#">文件</a>
						</p>
					</li>
					<div class="post">
					<h2 class="title">
						<a ><span style="font-size: 20px">笔记输入框</span></a>
					</h2>
					
					<div class="entry">
						<h3>当前输入笔记：</h3>
						<div>
							<textarea rows="12" cols="30"></textarea>
						</div>
						<h3>笔记列表:</h3>
						<ul>
							<li>笔记记录1：（...）</li>
							<li>笔记记录2：（...）</li>
							<li>笔记记录3：（...）</li>
						</ul>
						<p class="links">
							<a href="#" class="more">查看更多吗？</a>
						</p>
					</div>
				</div>
			</div>
			<!-- end sidebars -->
			<div style="clear: both;">&nbsp;</div>
		</div>
		<!-- end page -->
	</div>
	<div id="footer">
		<p class="copyright">
		</p>
	</div>
	</form>
</body>
</html>
