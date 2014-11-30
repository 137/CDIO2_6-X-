<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Regist.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<LINK href="images/public.css" type=text/css rel=stylesheet>
<LINK href="images/login.css" type=text/css rel=stylesheet>
<STYLE type=text/css>
</STYLE>
<META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</head>

<BODY>
	<form action="UserRegiserServlet" method="post">
		<DIV id=div1>
			<TABLE id=login height="100%" cellSpacing=0 cellPadding=0 width=800
				align=center>
				<TBODY>
					<TR id=main>
						<TD>
							<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%">
								<TBODY>
									<TR>
										<TD colSpan=4>&nbsp;</TD>
									</TR>
									<TR height=30>
										<TD width=380>&nbsp;</TD>
										<TD>&nbsp;</TD>
										<TD>&nbsp;</TD>
									</TR>
									<TR height=40>
										<TD rowSpan=5>&nbsp;</TD>
										<TD style="width: 6px; ">用户名：</TD>
										<TD><INPUT class=textbox id=txtUserName name=username>
										</TD>
										<TD style="font-size: 14px;font-weight: bold; width: 175px"><font color="red">${user_error }</font></td>
									</TR>
									<TR height=40>
										<TD>密 码：</TD>
										<TD><INPUT class=textbox id=txtUserPassword type=password
											name=password></TD>
										<TD style="font-size: 14px;font-weight: bold"><font color="red">${password_error }</font></td>
									</TR>

									<TR height=40>
										<TD></TD>
										<TD align=left><INPUT id=btnLogin type=submit
											value=" 提交 " name=btnLogin style="width: 68px; "><input
											type="reset" value="清空" style="width: 66px; ">
										<td></td>
										<TD width=120>&nbsp;</TD>
									</TR>
									<TR height=110>
										<TD colSpan=4>&nbsp;</TD>
									</TR>
								</TBODY>
							</TABLE>
						</TD>
					</TR>
					<TR id=root height=104>
						<TD>&nbsp;</TD>
					</TR>
				</TBODY>
			</TABLE>
		</DIV>
		<DIV id=div2 style="DISPLAY: none"></DIV>
		</CONTENTTEMPLATE>
	</form>
</BODY>
</html>
