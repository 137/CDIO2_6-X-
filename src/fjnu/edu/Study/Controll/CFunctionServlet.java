package fjnu.edu.Study.Controll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fjnu.edu.CFunctionDao.CFunctionDao;
import fjnu.edu.CFunctionDao.CFunctionDaoImpl;
import fjnu.edu.Study.domain.CFuntion;

public class CFunctionServlet extends HttpServlet {

	
	private HttpSession session;

	/**
	 * Constructor of the object.
	 */
	public CFunctionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		session = request.getSession();
		request.setCharacterEncoding("utf-8");
		
		List<CFuntion> functionList = new ArrayList<CFuntion>();
		CFunctionDao functionDao = new CFunctionDaoImpl();
		String info = "";
		
		for(CFuntion c:functionDao.listFunction()){
			functionList.add(c);
		}
		
		info += "<table width=450 border=1px bordercolor=#000000 "
				+ "style=border-collapse:collapse style=font-size:18px style=color:black style=face:verdana>"
				+ "<thead><tr style=background:#6DC5F3><th>函数名</th><th>函数功能</th></tr></thead><tbody>";
		
		for(int i=0;i<functionList.size();i++){
//			info+=functionList.get(i).getFunctionName();
			info += "<tr style=background:#FFF8DC><td>" + functionList.get(i).getFunctionName()
					+ "</td><td>" + functionList.get(i).getFunctionRole()
					+ "</td></tr>";
		}
		info+="</tbody></table>";
		request.setAttribute("functionType", info);
		request.getRequestDispatcher("CFunction_Study.jsp").forward(request, response);
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

		doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
