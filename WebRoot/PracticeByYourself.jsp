<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="fjnu.edu.Study.Controll.*,java.net.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>C学软件</title>
<meta name="keywords" content="" />
<meta name="Morning Dew" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
<!-- 调用times的js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/times.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/change_color.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/closeAndopen.js"></script>
<script>
	/**显示试卷*/
	function showExam(){
		document.getElementById("test").innerHTML='<%=request.getAttribute("a")%>';
		//alert(exam+"2");
	};
	/**获取试卷id*/
	function get_test_paper_id() {
		var test_id = document.getElementById("test_paper_id").value;
		if (test_id == "C_Basic_Test") {
			alert("获取的试卷id:" + test_id);
		}
	}
</script>
<style type="text/css">
#CurrentUser {
	margin-left: 1%;
	font-weight: bold;
	color: black;
}

<!--
按钮点击变色处理-->.over {
	color: #000000;
	background: #fcc546
}

.down {
	color: #000000;
	background: #fcc444;
	font-style: italic
}

a:link {
	color: #FF0000;
} /* 未被访问的链接 */
a:visited {
	color: #00FF00;
} /* 已被访问的链接 */
a:hover {
	color: #FF00FF;
} /* 鼠标指针移动到链接上 */
a:active {
	color: #0000FF;
} /* 正在被点击的链接 */
#CurrentUser {
	margin-left: 1%;
	font-weight: bold;
	color: black;
}

#time {
	color: red;
	font-weight: bold;
	font-size: 33px;
	font-family: times;
	margin-left: 51px;
}

#StartTime {
	border: 1px, solid;
}

.TestPaperList {
	font-size: 14px;
}
</style>
</head>
<body onload="startcurrentTime();">
	<form action="ExaminationServelet" method="post">
		<div id="wrapper">
			<div id="menu">
				<div id="CurrentUser">
					<span style="font-weight: bold;font-size: 13px;color: yellow;">当前用户：</span>
					<span id="current_user"
						style="font-weight: bold;font-size: 13px;color: yellow;">${current_user}</span>
					<span id="current_time"
						style="margin-left:11px; bold;font-size: 13px;color: yellow;"></span>
				</div>
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
						<a href="#"><span style="font-size: 44px">欢迎进入Cstudy习题练习</span></a>
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
							<h2 style="font-size: 18px">试题选择</h2>
							<ul class="TestPaperList">
								<li><a
									href="/CDIO_Cstudy/ExaminationServelet?test_paper_id=C_Basic_Test"
									value="C_Basic_Test">c语言基础测试1</a></li>
								<li><a
									href="/CDIO_Cstudy/ExaminationServelet?test_paper_id=C_Basic_Test2">c语言基础测试2</a></li>
								<li><a href="#" type="submit">指针的介绍</a></li>
								<li><a href="#" type="submit">数组的介绍</a></li>
								<li><a href="#" onclick="document.ge">数组的用法</a></li>


								<li><a href="#" type="submit">数组的排序</a></li>
								<li><a href="#" type="submit">数据结构</a></li>
								<li><a href="#">链表</a></li>
								<li><a href="#">线性表1</a></li>
								<li><a href="#">线性表2</a></li>
								<li><a href="#">线性表3</a></li>
								<li><a href="#">线性表4</a></li>
								<li><a href="#">线性表5</a></li>
								<li><a href="#">线性表6</a></li>
								<li><a href="#">线性表7</a></li>
								<li><a href="#">线性表8</a></li>
							</ul>
						</li>
						<li>
							<h2>基本语法预览</h2>
							<ul class="TestPaperList">
								<li><a href="#">查询</a> (23)</li>
								<li><a href="#">循环语句</a> (31)</li>
								<li><a href="#">if/else</a> (31)</li>
								<li><a href="#">switch的用法</a> (30)</li>
								<li><a href="#">while循环</a> (31)</li>
							</ul> <textarea rows="" cols="" style="width: 226px; height: 1766px"></textarea>
						</li>
					</ul>
				</div>
				<!-- start content -->
				<div id="content">
					<div class="post">
						<h1 class="title">
							<a href="#">欢迎进入练习题目阶段</a>
						</h1>
						<p class="byline"></p>
						<div class="entry"></div>
					</div>
					<div>
						<center>
							<span style="font-size:25px;font-weight: bolder;" id="TestPaper">第一套试题</span>
						</center>
					</div>
					<div>
						<center>
							<input type="button" onclick="showExam();" value="开始答题"
								style="width: 174px;color:maroon;font-weight: bolder;"></input>
						</center>
					</div>

					<div id="test" style="font-size: 18px;font-weight:lighter;">
					</div>
					<div>
						<input type="submit" value="提交答案"
							style="color:navy;font-weight: bolder; width: 174px"> <input
							type="submit" value="查看评分"
							style="color:navy;font-weight: bolder;float:right; width: 174px">
					</div>

				</div>
				<!-- end content -->
				<!-- start sidebars -->
				<div id="sidebar2" class="sidebar">
					<div id="StartTime" style="height:226px; width: 211px">
						<div style="margin-top: 60px; width: 303px">
							<span
								style="color:green;font-size: 32px;font-weight:bold;margin-left: 24px">考试倒计时</span>
							<span id="time"></span>
						</div>
					</div>
					<center>
						<span style="color: green;font-size: 26px;font-weight: bolder;">笔记输入框</span>
					</center>
					<br> <input type="button" id="kaiguan"
						onClick="hide_show(shuru);" value="关"
						style="color:maroon;font-size: 13px;font-weight:bolder; width: 228px; height: 28px" />
					<div id="shuru">
						<textarea rows="" cols="" style="width: 229px; height: 2489px"></textarea>
					</div>
					<div>
						<input type="submit" value="提交笔记"
							style="color: navy;font-weight: bolder; width: 228px">
					</div>
				</div>
				<!-- end sidebars -->
				<div style="clear: both;">&nbsp;</div>
			</div>
			<!-- end page -->
		</div>
		<div id="footer">
			<p class="copyright"></p>
		</div>
	</form>
</body>
</html>