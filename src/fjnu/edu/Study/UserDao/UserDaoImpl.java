package fjnu.edu.Study.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fjnu.edu.Study.domain.User;
import fjnu.edu.Study.util.DbConn;

/**
 * 数据库访问层-管理员的CRUD操作
 * 
 * @author DY1101shaoyuxian
 * 
 */
public class UserDaoImpl implements UserDao {
	// 创建连接
	private Connection conn = DbConn.getConn();

	// 登陆用户验证
	public boolean isLogin(User user) {
		boolean flag = false;
		String sql = "select * from t_manager where username=? and password=?";
		try {
			System.out.println(user.getUsername() + " " + user.getPassword());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, user.getUsername().toString());// 对传过来的用户名和密码进行封装
			pmst.setString(2, user.getPassword().toString());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} 
		catch(NullPointerException nu){
			System.out.println("空指针异常:"+nu.getMessage() + " " + nu.getCause());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return flag;
	}

	/**
	 * 修改用户的密码
	 * 
	 * @param page
	 * @return
	 */

	public int updateUserPassWord(User user) {
		int a = 0;
		String sql = "update t_manager set password=? where username=?";
		try {
			// 作为执行sql语句的对象，其中后面括号中的（sql）是编写好的，要执行的sql语句；
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getUsername());
			a = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	/**
	 * 添加用户
	 */
	@Override
	public void insertUserImfor(User user) {
		// TODO Auto-generated method stub
		String sql = "insert into t_manager(username,password) values(?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.executeUpdate();//执行
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 注册验证
	 */
	public boolean searchUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "select * from t_manager where username=?";
		try {
			System.out.println(user.getUsername() + " " + user.getPassword());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, user.getUsername().toString());// 对传过来的用户名和密码进行封装
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} 
		catch(NullPointerException nu){
			System.out.println("空指针异常:"+nu.getMessage() + " " + nu.getCause());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return flag;
	}
}













