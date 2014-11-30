/**
 * 
 */
package fjnu.edu.CFunctionDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import fjnu.edu.Study.domain.CFuntion;
import fjnu.edu.Study.domain.TestOfSelect;
import fjnu.edu.Study.util.DbConn;

/**
 * @author Administrator
 *
 */
public class CFunctionDaoImpl implements CFunctionDao {
	
	// ��������
		private Connection conn = DbConn.getConn();

	/* (non-Javadoc)
	 * @see fjnu.edu.Study.CFunctionDao.CFunctionDao#listFunction()
	 */

		
	//��ѯ���к������ͺ�������
	@Override
	public Set<CFuntion> listFunction() {
	
		TreeSet<CFuntion> list=new TreeSet<CFuntion>();
		String sql = "select * from t_cfunction";
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				CFuntion funtion = new CFuntion();
				// �����ݿ���ȡֵ��������ֵ
				String functionName = rs.getString("FUNCTION_NAME");
				String functionType = rs.getString("FUNCTION_TYPE");
				String functionPrototype = rs.getString("FUNCTION_PROTOTYPE");
				String functionUsage = rs.getString("FUNCTION_USAGE");
				String functionRole = rs.getString("FUNCTION_ROLE");
				String functionIntroduction = rs.getString("FUNCTION_INTRODUCTION");
				String functionExample = rs.getString("FUNCTION_EXAMPLE");
				// �Զ���ֵ
				funtion.setFunctionName(functionName);
				funtion.setFunctionType(functionType);
				funtion.setFunctionPrototype(functionPrototype);
				funtion.setFunctionUsage(functionUsage);
				funtion.setFunctionRole(functionRole);
				funtion.setFunctionIntroduction(functionIntroduction);
				funtion.setFunctionExameple(functionExample);
				list.add(funtion);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	//���ݺ�������ȡ�������ͺ�������
	@Override
	public Set<CFuntion> listSortFunctionByType(String type) {
		TreeSet<CFuntion> list=new TreeSet<CFuntion>();
		String sql = "select * from t_cfunction where FUNCTION_TYPE='"+type+"'";
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				CFuntion funtion = new CFuntion();
				// �����ݿ���ȡֵ��������ֵ
				String functionName = rs.getString("FUNCTION_NAME");
				String functionType = rs.getString("FUNCTION_TYPE");
				String functionPrototype = rs.getString("FUNCTION_PROTOTYPE");
				String functionUsage = rs.getString("FUNCTION_USAGE");
				String functionRole = rs.getString("FUNCTION_ROLE");
				String functionIntroduction = rs.getString("FUNCTION_INTRODUCTION");
				String functionExample = rs.getString("FUNCTION_EXAMPLE");
				// �Զ���ֵ
				funtion.setFunctionName(functionName);
				funtion.setFunctionType(functionType);
				funtion.setFunctionPrototype(functionPrototype);
				funtion.setFunctionUsage(functionUsage);
				funtion.setFunctionRole(functionRole);
				funtion.setFunctionIntroduction(functionIntroduction);
				funtion.setFunctionExameple(functionExample);
				list.add(funtion);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<CFuntion> listSortFunctionByName(String name) {
		
		List<CFuntion> list = new ArrayList<CFuntion>();
		
		String sql = "select * from t_cfunction where FUNCTION_NAME='"+name+"'";
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				CFuntion funtion = new CFuntion();
				// �����ݿ���ȡֵ��������ֵ
				String functionName = rs.getString("FUNCTION_NAME");
				String functionType = rs.getString("FUNCTION_TYPE");
				String functionPrototype = rs.getString("FUNCTION_PROTOTYPE");
				String functionUsage = rs.getString("FUNCTION_USAGE");
				String functionRole = rs.getString("FUNCTION_ROLE");
				String functionIntroduction = rs.getString("FUNCTION_INTRODUCTION");
				String functionExample = rs.getString("FUNCTION_EXAMPLE");
				// �Զ���ֵ
				funtion.setFunctionName(functionName);
				funtion.setFunctionType(functionType);
				funtion.setFunctionPrototype(functionPrototype);
				funtion.setFunctionUsage(functionUsage);
				funtion.setFunctionRole(functionRole);
				funtion.setFunctionIntroduction(functionIntroduction);
				funtion.setFunctionExameple(functionExample);
				list.add(funtion);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}	

}
