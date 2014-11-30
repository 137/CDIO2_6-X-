package fjnu.edu.Study.Controll;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjnu.edu.Study.ExaminationDao.ExaminationDaoImpl;
import fjnu.edu.Study.TestOfJudgeDao.TestOfJudgeDaoimpl;
import fjnu.edu.Study.TestOfSelectDao.TestOfSelectDaoImpl;
import fjnu.edu.Study.domain.Examination;
import fjnu.edu.Study.domain.TestOfJudge;
import fjnu.edu.Study.domain.TestOfSelect;

public class ExaminationServelet extends HttpServlet {

	private HttpSession session;
	// 定义选择题的循环范围
	private int select_num_begin;
	private int judge_num_begin;
	private int select_num_end;
	private int judge_num_end;

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * 获取试卷标题内容
		 */
		session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String test_id = request.getParameter("test_paper_id");
		System.out.println("试卷id===========================" + test_id);
		/**
		 * 加载所有的判断题
		 */
		TestOfJudgeDaoimpl judgedata = new TestOfJudgeDaoimpl();
		List<TestOfJudge> list_judge = new ArrayList<TestOfJudge>();
		for (TestOfJudge j : judgedata.selectList()) {
			list_judge.add(j);
		}
		/**
		 * 将UserServelet传过来的值赋值给usrname并写入到jsp中
		 */
		// String username=request.getAttribute("username").toString();
		// request.setAttribute("current_user", username+"\t");
		/**
		 * 加载所有的选择题
		 */
		TestOfSelect select = new TestOfSelect();
		TestOfSelectDaoImpl dao = new TestOfSelectDaoImpl();
		List<TestOfSelect> select_list = new ArrayList<TestOfSelect>();
		for (TestOfSelect sel : dao.selectList()) {
			select_list.add(sel);
		}
		// 加载试卷
		if (test_id.equals("C_Basic_Test")) {
			select_num_begin = 0;
			judge_num_begin = 0;
			select_num_end = 10;
			judge_num_end = 5;
		} else if (test_id.equals("C_Basic_Test2")) {
			select_num_begin = 10;
			judge_num_begin = 5;
			select_num_end = 15;
			judge_num_end = 8;
		}
		/**
		 * 页面显示选择题
		 */
		int count=0;//用来对试卷的布局数目，因为在试卷的题号跟数据库的题号不一样
		String b = "";
		b += "<span style=color:green;font-weight:bold>一：单项选择题</span><br/>";
		b += "<span style=color:blue>每道题8分，您只需选择您觉得正确的答案即可。</span><br/>";
		for (int i = select_num_begin; i < select_num_end; i++) {
			b += "<div style=font-size:22>第" + (count + 1) + "题："
					+ select_list.get(i).getQuestion() + "</div>";
			b += "<br/><input type=radio name=q>" + "A."
					+ select_list.get(i).getA()
					+ "<style=margin-left:22px><br/><input type=radio name=q>"
					+ "B." + select_list.get(i).getB();
			b += "<br/><input type=radio name=q>" + "C."
					+ select_list.get(i).getC() + ""
					+ "<br/><input type=radio name=q>" + "D."
					+ select_list.get(i).getD() + "<br/><br/><br/>";
			count++;
		}
		/**
		 * 页面显示判断题
		 */
		b += "<span style=color:green;font-weight:bold>二：判断题</span><br/>";
		b += "<span style=color:blue>提示：您只需输入T或F即可，前者表示这种说法正确后者表示这种错误，请规范作答，否则不计分。每道题4分。</span><br/>";
		for (int i = judge_num_begin; i < judge_num_end; i++) {
			b += "<div style=font-size:22>第" + (count+ 1) + "题："
					+ list_judge.get(i).getJudgeQuestion()
					+ "<input name=JudgeAnswer></div>";
			b += "<br/><br/><br/>";
			count++;
		}
		System.out.println(b);
		request.setAttribute("a", b + "刷新题目ing");
		request.setAttribute("TestPaper", "C语言基础知识学习");
		request.getRequestDispatcher("PracticeByYourself.jsp").forward(request,
				response);

	}

	/**
	 * The doPost method of the servlet. <br>
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * 
	 */

}
