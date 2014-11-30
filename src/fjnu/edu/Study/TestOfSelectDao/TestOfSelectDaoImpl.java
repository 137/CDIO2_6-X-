package fjnu.edu.Study.TestOfSelectDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fjnu.edu.Study.domain.TestOfSelect;
import fjnu.edu.Study.util.DbConn;

/**
 * ѡ����daoʵ����
 * 
 * @author Administrator
 * 
 */
public class TestOfSelectDaoImpl implements TestOfSelectDao {
	/**
	 * �������ݿ�
	 */
	private Connection conn = DbConn.getConn();

	/**
	 * ��ѯ������Ŀ���Լ��ϵ���ʽ����
	 */
	@Override
	public List<TestOfSelect> selectList() {
		// TODO Auto-generated method stub
		List<TestOfSelect> list = new ArrayList<TestOfSelect>();
		String sql = "select * from t_choose";
		Statement smt;
		try {
			smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				TestOfSelect select = new TestOfSelect();
				// �����ݿ���ȡֵ��������ֵ
				int selectNo = rs.getInt("no");
				String QuestionNo = rs.getString("question");
				String A = rs.getString("a");
				String B = rs.getString("b");
				String C = rs.getString("c");
				String D = rs.getString("d");
				String right_answer = rs.getString("right");
				long count = rs.getLong("wrong_num");
				// �Զ���ֵ
				select.setSelectNo(selectNo);
				select.setQuestion(QuestionNo);
				select.setA(A);
				select.setB(B);
				select.setC(C);
				select.setD(D);
				select.setRightAnswer(right_answer);
				select.setWrongTimes(count);
				list.add(select);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * ��ѯ��ǰѡ����Ķ���
	 */
	public List<TestOfSelect> Current_SelectList(int SelectNo) {
		// TODO Auto-generated method stub
		List<TestOfSelect> list = new ArrayList<TestOfSelect>();
		String sql = "select * from t_choose where no=?";
		try {
			PreparedStatement pmst=conn.prepareStatement(sql);
			pmst.setLong(1, SelectNo);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				TestOfSelect select = new TestOfSelect();
				// �����ݿ���ȡֵ��������ֵ
				int selectNo = rs.getInt("no");
				String QuestionNo = rs.getString("question");
				String A = rs.getString("a");
				String B = rs.getString("b");
				String C = rs.getString("c");
				String D = rs.getString("d");
				String right_answer = rs.getString("right");
				long count = rs.getLong("wrong_num");
				// �Զ���ֵ
				select.setSelectNo(selectNo);
				select.setQuestion(QuestionNo);
				select.setA(A);
				select.setB(B);
				select.setC(C);
				select.setD(D);
				select.setRightAnswer(right_answer);
				select.setWrongTimes(count);
				list.add(select);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * �ж��Ƿ����������
	 */
	public boolean findCurrentSelectQuestion(int SelectNo) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "select *from t_choose where NO=?";
		try {
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setLong(1, SelectNo);
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				flag = true;
			} else
				flag = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} catch (NullPointerException nu) {
			System.out
					.println("��ָ���쳣:" + nu.getMessage() + " " + nu.getCause());
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return flag;
	}

	@Override
	public boolean findCurrentSelectDecision(String SelectNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findCurrentSelectAnswer(String SelectNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findCurrentSelectErrorTimes(String SelectNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean findAllSelectQuestion(TestOfSelect select) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ��ѡ����Ŀ�����
	 */
	@Override
	public boolean addSelectQuestion(TestOfSelect select) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into t_choose(no,question,a,b,c,d,right,wrong_num) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// ִ��sql���
			pstmt = conn.prepareStatement(sql);
			// ���ݿ�ֵ�����
			pstmt.setLong(1, select.getSelectNo());
			pstmt.setString(2, select.getQuestion());
			pstmt.setString(3, select.getA());
			pstmt.setString(4, select.getB());
			pstmt.setString(5, select.getC());
			pstmt.setString(6, select.getD());
			pstmt.setString(7, select.getRightAnswer());
			pstmt.setLong(8, select.getWrongTimes());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				flag = true;
				System.out.println("�������ݳɹ�������");
			} else {
				flag = false;
				System.out.println("��������ʧ�ܣ�����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������Ԥ֪���쳣��");
		}
		return flag;
	}

	/**
	 * ɾ����ǰ����
	 */
	public boolean deleteCurrentSelectQuestion(int SelectNo) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "delete from t_choose where no=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setLong(1, SelectNo);
			if (psmt.executeUpdate() > 0) {
				flag = true;
				System.out.println("ɾ���ɹ���");
			}
			else{
				flag=false;
				System.out.println("ɾ��ʧ�ܣ�");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �޸���ѡ����
	 * @return 
	 */
	@Override
	public boolean updateCurrentSelectQuestion(TestOfSelect select) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "update t_choose set question=?,a=?,b=?,c=?,d=?,right=?,wrong_num=? where no=? ";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, select.getQuestion());
			psmt.setString(2, select.getA());
			psmt.setString(3, select.getB());
			psmt.setString(4, select.getC());
			psmt.setString(5, select.getD());
			psmt.setString(6, select.getRightAnswer());
			psmt.setFloat(7, select.getWrongTimes());
			psmt.setLong(8, select.getSelectNo());

			int i = psmt.executeUpdate();
			if (i == 1) {
				flag = true;
				System.out.println("���³ɹ�!!!!!!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
