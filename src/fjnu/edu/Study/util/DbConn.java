package fjnu.edu.Study.util;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DbConn {

	/**
	 * ���ݿ�������
	 * @author DY1101shaoyuxian
	 */
//	private static FileInputStream input=null;
	private static String username=null;
	private static String password=null;
	private static  String driver=null;
	private static String url=null;
	static{
		Properties ps=new Properties();
		try {
//			input=new FileInputStream("META-INF/db.properties");
//			ps.load(input);
			ps.load(DbConn.class.getResourceAsStream("/db.properties"));
			driver=ps.getProperty("driver");
			url=ps.getProperty("url");
			username=ps.getProperty("username");
			password=ps.getProperty("password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() {
		Connection con = null;
		try {
		    Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public void closeCon(Connection con) {
		// TODO Auto-generated method stub
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			DbConn.getConn();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
