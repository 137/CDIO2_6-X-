

package fjnu.edu.Study.Controll;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjnu.edu.Study.UserDao.UserDaoImpl;
import fjnu.edu.Study.domain.User;
import fjnu.edu.Study.util.StringUtil;

public class UserServlet extends HttpServlet {

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
		String remember=req.getParameter("remember");
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		//传值给ExaminationServelet
//		Cookie users;
//		users = new Cookie("user",URLEncoder.encode(username,"UTF-8"));
//		users.setMaxAge(1*60*60*24*7);
//		resp.addCookie(users);
//		resp.sendRedirect("ExaminationServelet");
//		req.getRequestDispatcher("ExaminationServelet").forward(req, resp);
		
		/**
		 * 对用户登录的规范
		 */
	 	 if(StringUtil.isEmpty(username)||StringUtil.isEmpty(password)){
	 	 	req.setAttribute("error", "用户名或密码不能为空,请输入用户名或密码...");
		 	req.getRequestDispatcher("login.jsp").forward(req, resp);
			return;
		 }
		UserDaoImpl usersdao=new UserDaoImpl();
		User user=new User(username,password);
		System.out.println("当前用户名："+username);
		session.setAttribute("username", username);	
		System.out.println("当前密码："+password);
		if(usersdao.isLogin(user)){
			System.out.println("1");
			if("remember-me".equals(remember)){
				rememberMe(username,password,resp);
			}
			System.out.println("2");
			//登录到主界面
			req.getRequestDispatcher("mains.jsp").forward(req, resp);
		}
		else{
			req.setAttribute("error", "用户名或密码错误!!请重新输入...");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
//			RequestDispatcher requestdispatcher=req.getRequestDispatcher("mains.jsp");
//			requestdispatcher.forward(req, resp);
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
	
	//记住密码
	private void rememberMe(String userName,String password,HttpServletResponse response){
		Cookie user;
		try {
			user = new Cookie("user",URLEncoder.encode(userName,"UTF-8")+"-"+URLEncoder.encode(password,"UTF-8"));
			user.setMaxAge(1*60*60*24*7);
			response.addCookie(user);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}