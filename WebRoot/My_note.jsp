<%@ page language="java" contentType="text/html; charset=UTF-8" import="fjnu.edu.Study.Controll.*,java.net.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>C学软件</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<meta name="Morning Dew" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
	<form action="MainServelet" method="post">
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
						<a href="#"><span style="font-size: 44px">欢迎进入Cstudy-我的笔记整理</span></a>
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
							<h2>最近浏览</h2>
							<ul>
								<li><a href="#">c语言输入</a></li>
								<li><a href="#">c语言输出</a></li>
								<li><a href="#">MFC</a></li>
								<li><a href="#">指针的介绍</a></li>
								<li><a href="#">数组的介绍</a></li>
								<li><a href="#">数组的用法</a></li>
								<li><a href="#">数组的排序</a></li>
								<li><a href="#">数据结构</a></li>
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
							<ul>
								<li><a href="#">查询</a> (23)</li>
								<li><a href="#">循环语句</a> (31)</li>
								<li><a href="#">if/else</a> (31)</li>
								<li><a href="#">switch的用法</a> (30)</li>
								<li><a href="#">while循环</a> (31)</li>
							</ul>
						</li>
					</ul>
				</div>
				<!-- start content -->
				<div id="content">
				<div class="post">
					<h1 class="title">
						<a href="#">欢迎进入我的笔记整理界面</a>
					</h1>
					<p class="byline">
						2014年11月19号Fjnu_CDIO_6完成界面原型
					</p>
					<div class="entry">
						<p>
							   void InsertList(LinkList h,int pos,datatype x)<br>
							   {<br>
							     LinkList p=h,q; int i=0;<br>
							       {   <br>
							         p=p->next;   <br>
							         i++; <br>
							       }  <br>
							       if(!p||i>pos-1)print(“插入位置出错!!”); <br>
							       InitList(&q); <br>
							       q->next=NULL;<br>
							       q->data=x; <br>
							       }  <br>
							       void DeleteList(LinkList h,int pos)<br>
							       {<br>
							         LinkList p=h,q; int i=0;  <br>
							         { <br>
							             p=p->next;   <br>  
							             i++; <br>
							         }  <br>
							         if(!p||i>pos-1)<br>
							         {<br>
							         	cout<<”删除位置错误”;<br>
							         	return;<br>
							         } <br>
							         q=p->next;  <br>
							         p->next=q->next; <br>
							         free(q); <br>
							         }   <br>
							          -----------------------------------------------------------------------------------------------------------------<br>    
							          1、线性表中， 第一个元素没有直接前驱，最后一个元素没有直接后驱。  <br>
							          2、在一个单链表中，若p所指结点是q所指结点的前驱结点，则删除结点q的操作语句为 p->next=q->next;free(q);。  <br>
							          3、在长度为N的顺序表中，插入一个新元素平均需要移动表中n/2个元素，删除一个元素平均需要移动(n-1)/2个元素。<br>  
							          4、若线性表的主要操作是在最后一个元素之后插入一个元素或删除最后一个元素，则采用___带头结点的双循环链表__存储结构最节省运算时间。  <br>
							          5、已知顺序表中每个元素占用3个存储单元，第13个元素的存储地址未336，则顺序表的首地址为___300_____。  <br>
							          6、设有一带头结点单链表L，请编写该单链表的初始化，插入、输出和删除函数。（函数名自定义）   <br>
							          ----------------------------------------------------------------------------------------------------------------<br>  
						</p>
					</div>
				</div>
				<div class="post">
					<div class="entry">
					</div>
				</div>
				<div class="post">
					<h2 class="title">
					</h2>
					<div class="entry">
					</div>
				</div>
			</div>
				<!-- end content -->
				<!-- start sidebars -->
				<div id="sidebar2" class="sidebar">
					<ul>
						<li>
							<h2>标签</h2>
							<p class="tag">
								<a href="#">类</a> <a href="#">继承</a> <a href="#">多态</a> <a
									href="#">指针</a> <a href="#">io流</a> <a href="#">函数</a> <a
									href="#">变量</a> <a href="#">文件</a>
							</p>
						</li>
						<li>
							<h2>日期</h2>
							<div id="calendar_wrap">
								<table summary="Calendar">
									<caption>2014.11.20</caption>
									<thead>
										<tr>
											<th abbr="Monday" scope="col" title="Monday">M</th>
											<th abbr="Tuesday" scope="col" title="Tuesday">T</th>
											<th abbr="Wednesday" scope="col" title="Wednesday">W</th>
											<th abbr="Thursday" scope="col" title="Thursday">T</th>
											<th abbr="Friday" scope="col" title="Friday">F</th>
											<th abbr="Saturday" scope="col" title="Saturday">S</th>
											<th abbr="Sunday" scope="col" title="Sunday">S</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
											<td abbr="September" colspan="3" id="prev"><a href="#"
												title="View posts for September 2009">&laquo; Sep</a></td>
											<td class="pad">&nbsp;</td>
											<td colspan="3" id="next">&nbsp;</td>
										</tr>
									</tfoot>
									<tbody>
										<tr>
											<td>1</td>
											<td>2</td>
											<td>3</td>
											<td id="today">4</td>
											<td>5</td>
											<td>6</td>
											<td>7</td>
										</tr>
										<tr>
											<td>8</td>
											<td>9</td>
											<td>10</td>
											<td>11</td>
											<td>12</td>
											<td>13</td>
											<td>14</td>
										</tr>
										<tr>
											<td>15</td>
											<td>16</td>
											<td>17</td>
											<td>18</td>
											<td>19</td>
											<td>20</td>
											<td>21</td>
										</tr>
										<tr>
											<td>22</td>
											<td>23</td>
											<td>24</td>
											<td>25</td>
											<td>26</td>
											<td>27</td>
											<td>28</td>
										</tr>
										<tr>
											<td>29</td>
											<td>30</td>
											<td>31</td>
											<td class="pad" colspan="4">&nbsp;</td>
										</tr>
									</tbody>
								</table>
							</div>
						</li>
						<li>
							<h2>我的笔记大概浏览</h2>
							<ul>
								<li><a href="#">对“&”和“*”运算符的说明......</a></li>
								<li><a href="#">用数组名做函数参数...... </a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）1......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）2......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）3......</a></li>
								<li><a href="#">指针是啥玩意？......</a></li>
								<li><a href="#">地址和指针的概念...... </a></li>
								<li><a href="#">直接访问......</a></li>
								<li><a href="#">间接访问......</a></li>
								<li><a href="#">初识指针......</a></li>
								<li><a href="#">指针与指针变量...... </a></li>
								<li><a href="#">线性表......</a></li>
								<li><a href="#">指针变量的引用“&”......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）4......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）5......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）6......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）7......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）8......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）9......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）10......</a></li>
								<li><a href="#">指针作参数（仅修改reverse函数）11......</a></li>

							</ul>
						</li>
					</ul>
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
