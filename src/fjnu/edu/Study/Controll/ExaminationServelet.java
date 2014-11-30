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
	// ����ѡ�����ѭ����Χ
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
		 * ��ȡ�Ծ��������
		 */
		session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String test_id = request.getParameter("test_paper_id");
		System.out.println("�Ծ�id===========================" + test_id);
		/**
		 * �������е��ж���
		 */
		TestOfJudgeDaoimpl judgedata = new TestOfJudgeDaoimpl();
		List<TestOfJudge> list_judge = new ArrayList<TestOfJudge>();
		for (TestOfJudge j : judgedata.selectList()) {
			list_judge.add(j);
		}
		/**
		 * ��UserServelet��������ֵ��ֵ��usrname��д�뵽jsp��
		 */
		// String username=request.getAttribute("username").toString();
		// request.setAttribute("current_user", username+"\t");
		/**
		 * �������е�ѡ����
		 */
		TestOfSelect select = new TestOfSelect();
		TestOfSelectDaoImpl dao = new TestOfSelectDaoImpl();
		List<TestOfSelect> select_list = new ArrayList<TestOfSelect>();
		for (TestOfSelect sel : dao.selectList()) {
			select_list.add(sel);
		}
		// �����Ծ�
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
		 * ҳ����ʾѡ����
		 */
		int count=0;//�������Ծ�Ĳ�����Ŀ����Ϊ���Ծ����Ÿ����ݿ����Ų�һ��
		String b = "";
		b += "<span style=color:green;font-weight:bold>һ������ѡ����</span><br/>";
		b += "<span style=color:blue>ÿ����8�֣���ֻ��ѡ����������ȷ�Ĵ𰸼��ɡ�</span><br/>";
		for (int i = select_num_begin; i < select_num_end; i++) {
			b += "<div style=font-size:22>��" + (count + 1) + "�⣺"
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
		 * ҳ����ʾ�ж���
		 */
		b += "<span style=color:green;font-weight:bold>�����ж���</span><br/>";
		b += "<span style=color:blue>��ʾ����ֻ������T��F���ɣ�ǰ�߱�ʾ����˵����ȷ���߱�ʾ���ִ�����淶���𣬷��򲻼Ʒ֡�ÿ����4�֡�</span><br/>";
		for (int i = judge_num_begin; i < judge_num_end; i++) {
			b += "<div style=font-size:22>��" + (count+ 1) + "�⣺"
					+ list_judge.get(i).getJudgeQuestion()
					+ "<input name=JudgeAnswer></div>";
			b += "<br/><br/><br/>";
			count++;
		}
		System.out.println(b);
		request.setAttribute("a", b + "ˢ����Ŀing");
		request.setAttribute("TestPaper", "C���Ի���֪ʶѧϰ");
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
