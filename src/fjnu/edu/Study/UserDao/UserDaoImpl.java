package fjnu.edu.Study.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fjnu.edu.Study.domain.User;
import fjnu.edu.Study.util.DbConn;

/**
 * ���ݿ���ʲ�-����Ա��CRUD����
 * 
 * @author DY1101shaoyuxian
 * 
 */
public class UserDaoImpl implements UserDao {
	// ��������
	private Connection conn = DbConn.getConn();

	// ��½�û���֤
	public boolean isLogin(User user) {
		boolean flag = false;
		String sql = "select * from t_manager where username=? and password=?";
		try {
			System.out.println(user.getUsername() + " " + user.getPassword());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, user.getUsername().toString());// �Դ��������û�����������з�װ
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
			System.out.println("��ָ���쳣:"+nu.getMessage() + " " + nu.getCause());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return flag;
	}

	/**
	 * �޸��û�������
	 * 
	 * @param page
	 * @return
	 */

	public int updateUserPassWord(User user) {
		int a = 0;
		String sql = "update t_manager set password=? where username=?";
		try {
			// ��Ϊִ��sql���Ķ������к��������еģ�sql���Ǳ�д�õģ�Ҫִ�е�sql��䣻
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
	 * ����û�
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
			pstmt.executeUpdate();//ִ��
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ע����֤
	 */
	public boolean searchUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "select * from t_manager where username=?";
		try {
			System.out.println(user.getUsername() + " " + user.getPassword());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, user.getUsername().toString());// �Դ��������û�����������з�װ
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} 
		catch(NullPointerException nu){
			System.out.println("��ָ���쳣:"+nu.getMessage() + " " + nu.getCause());
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return flag;
	}
}













