package fjnu.edu.Study.TestOfJudgeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fjnu.edu.Study.domain.TestOfJudge;
import fjnu.edu.Study.util.DbConn;

/**
 * ʵ���ж���ӿڵ���
 * @author Administrator
 *
 */
public class TestOfJudgeDaoimpl implements TestOfJudgeDao {
	/**
	 * �������ݿ�
	 */
	private Connection conn = DbConn.getConn();
	/**
	 * ��ѯ�����ж��Ⲣ�Լ��ϵ���ʽ����
	 */
	public List<TestOfJudge> selectList() {
		// TODO Auto-generated method stub
		List<TestOfJudge> List = new ArrayList<TestOfJudge>();
		String sql = "select * from t_yesorno";
		Statement smt;
		try {
			//ִ��sql
			smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				TestOfJudge judge = new TestOfJudge();
				// �����ݿ���ȡֵ��������ֵ
				int JudgeNo = rs.getInt("no");
				String Question = rs.getString("question");
				String Answer = rs.getString("answer");
				long count = rs.getLong("wrong_num");//��������ļ���
				// �Զ���ֵ
				judge.setJudgeNo(JudgeNo);
				judge.setJudgeQuestion(Question);
				judge.setJudgeAnswer(Answer);
				judge.setWrongTimes(count);
				List.add(judge);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List;
	}

	/**
	 * ��ѯָ���ж�����ŵĶ����Լ��ϵ���ʽ����
	 */
	public List<TestOfJudge> Current_JudgeList(int JudgeNo) {
		// TODO Auto-generated method stub
		List<TestOfJudge> List = new ArrayList<TestOfJudge>();
		String sql = "select * from t_yesorno";
		try {
			PreparedStatement pmst=conn.prepareStatement(sql);
			pmst.setLong(1, JudgeNo);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				TestOfJudge select = new TestOfJudge();
				// �����ݿ���ȡֵ��������ֵ
				String Question = rs.getString("question");
				String Answer = rs.getString("answer");
				long count = rs.getLong("wrong_num");//��������ļ���
				// �Զ���ֵ
				select.setJudgeNo(JudgeNo);
				select.setJudgeQuestion(Question);
				select.setJudgeAnswer(Answer);
				select.setWrongTimes(count);
				List.add(select);
				// ��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List;
	}

	@Override
	public boolean isfindCurrentJudge(int JudgeNo) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * ���ж�����Ŀ�����
	 */
	@Override
	public boolean addJudgeQuestion(TestOfJudge Judge) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into t_yesorno(no,question,answer,wrong_num) values(?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// ִ��sql���
			pstmt = conn.prepareStatement(sql);
			// ���ݿ�ֵ�����
			pstmt.setLong(1, Judge.getJudgeNo());
			pstmt.setString(2, Judge.getJudgeQuestion());
			pstmt.setString(3, Judge.getJudgeAnswer());
			pstmt.setLong(4, Judge.getWrongTimes());
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
	 * ���ж��������ɾ��
	 */
	@Override
	public boolean deleteCurrentJudgeQuestion(int JudgeNo) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "delete from t_yesorno where no=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setLong(1, JudgeNo);
			if (psmt.executeUpdate() > 0) {
				flag = true;
				System.out.println("ɾ���ɹ�!!!!��");
			}
			else{
				flag=false;
				System.out.println("ɾ��ʧ��!!!!��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * �ж���ĸ���
	 */
	@Override
	public boolean updateCurrentJudgeQuestion(TestOfJudge judge) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "update t_yesorno set question=?,answer=?,wrong_num=? where no=? ";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, judge.getJudgeQuestion());
			psmt.setString(2, judge.getJudgeAnswer());
			psmt.setLong(3, judge.getWrongTimes());
			psmt.setLong(4, judge.getJudgeNo());

			int i = psmt.executeUpdate();
			if (i == 1) {
				flag = true;
				System.out.println("���³ɹ�!!!!!��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}

