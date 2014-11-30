package fjnu.edu.Study.Controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjnu.edu.Study.UserDao.UserDaoImpl;
import fjnu.edu.Study.domain.User;
import fjnu.edu.Study.util.StringUtil;

public class UserRegiserServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session=req.getSession();

		String username=req.getParameter("username").trim();//获取username并去掉空格
		String password=req.getParameter("password").trim();//获取password并去掉空格
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		/**
		 * 输入的用户名为空的时候
		 */
	 	 if(StringUtil.isEmpty(username)){
	 		req.setAttribute("user_error", "用户名不能为空!");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 	req.getRequestDispatcher("Regist.jsp").forward(req, resp);
			return;
		 }
	 	 /**
	 	  * 输入的密码为空的时候
	 	  */
	 	 if(StringUtil.isEmpty(password)){
		 		req.setAttribute("password_error", "密码不能为空!"); 
		 		req.getRequestDispatcher("Regist.jsp").forward(req, resp);
				return;
	 	 }
	 	 /**
	 	  * 用户存在的时候
	 	  */
		UserDaoImpl usersdao=new UserDaoImpl();
		User user=new User(username,password);
		if(usersdao.searchUser(user)){
			req.setAttribute("user_error", "此用户已经存在!!");
			System.out.println("此用户已经存在!!");
			req.getRequestDispatcher("Regist.jsp").forward(req, resp);
		}
		else if(!usersdao.isLogin(user)){
			usersdao.insertUserImfor(user);
			req.setAttribute("password_error", "注册成功");
			req.setAttribute("right", "注册成功");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doGet(request, response);

	}

}
