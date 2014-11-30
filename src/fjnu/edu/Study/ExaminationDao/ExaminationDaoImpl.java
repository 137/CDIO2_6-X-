package fjnu.edu.Study.ExaminationDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fjnu.edu.Study.domain.Examination;
import fjnu.edu.Study.util.DbConn;

public class ExaminationDaoImpl implements ExaminationDao {

	/**
	 * �������ݿ�
	 */
	private Connection conn = DbConn.getConn();
	
	/**
	 * ������Ĳ��룬�������ֵΪtrue����ʾ��ӳɹ�
	 */
	@Override
	public boolean addExaminationPaper(Examination examin) {
		// TODO Auto-generated method stub
		boolean flag = true;
		String sql = "insert into testQuestion(ExaminationName,QuestionNo,QuestionContent,ErrorTimes) values(?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// ִ��sql���
			pstmt = conn.prepareStatement(sql);
			// ���ݿ�ֵ�����
			pstmt.setString(1, examin.getExaminationName());
			pstmt.setString(2, examin.getQuestionNo());
			pstmt.setString(3, examin.getQuestionContent());
			pstmt.setLong(4, examin.getErrorTimes());
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
	 * �������ɾ��
	 */
	@Override
	public boolean deleteExaminationPaper(Examination exam) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "delete from testQuestion where ExaminationName=? and QuestionNo=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, exam.getExaminationName());
			psmt.setString(2, exam.getQuestionNo());
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * ���Ծ��ɾ��
	 */
	@Override
	public boolean deleteWholePaper(Examination exam) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "delete from testQuestion where ExaminationName=?";
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, exam.getExaminationName());
			if (psmt.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
	@Override
	public boolean updateExaminationPaper(Examination examin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Examination findExaminationQuestion(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * �ж��Ƿ���ڵ�ǰ�Ծ�����
	 */
	@Override
	public Examination findWhoepaper(Examination exam) {
		// TODO Auto-generated method stub
		String sql = "select *from testQuestion where ExaminationName=?";
		try {
			System.out.println(exam.getExaminationName() + " "
					+ exam.getQuestionNo());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, exam.getExaminationName().toString());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				return exam;
			} else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} catch (NullPointerException nu) {
			System.out
					.println("��ָ���쳣:" + nu.getMessage() + " " + nu.getCause());
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return exam;
	}

	/**
	 *�ж��Ƿ���ڵ�ǰ�Ծ����ƺ�������
	 */
	@Override
	public Examination findExaminationQuestion(Examination exam) {
		// TODO Auto-generated method stub
		String sql = "select *from testQuestion where ExaminationName=? and QuestionNo=?";
		try {
			System.out.println(exam.getExaminationName() + " "
					+ exam.getQuestionNo());
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, exam.getExaminationName().toString());
			pmst.setString(2, exam.getQuestionNo().toString());
			ResultSet rs = pmst.executeQuery();
			if (rs.next()) {
				return exam;
			} else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage() + " " + e.getCause());
		} catch (NullPointerException nu) {
			System.out
					.println("��ָ���쳣:" + nu.getMessage() + " " + nu.getCause());
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return exam;
	}
	/**
	 * ��ѯ�����е�����
	 */

	@Override
	public List<Examination> examinationList() {
		// TODO Auto-generated method stub
		List<Examination> list=new ArrayList<Examination>();
		String sql="select * from testQuestion";
		Statement smt;
		try {
			smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()){
				Examination exam=new Examination();
				//�����ݿ���ȡֵ��������ֵ
				String Name=rs.getString("ExaminationName");
				String No=rs.getString("QuestionNo");
				String content=rs.getString("QuestionContent");
				long count=rs.getLong("ErrorTimes");
				//�Զ���ֵ
				exam.setExaminationName(Name);
				exam.setQuestionNo(No);
				exam.setQuestionContent(content);
				exam.setErrorTimes(count);
				list.add(exam);
				//��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * ��ѯָ���Ծ������
	 */
	@Override
	public List<Examination> examinationList(String name) {
		List<Examination> list=new ArrayList<Examination>();
		String sql="select * from testQuestion where ExaminationName=? ";

		try {
			PreparedStatement pmst=conn.prepareStatement(sql);
			pmst.setString(1, name);
//			Statement smt= conn.createStatement();
			ResultSet rs = pmst.executeQuery();
			while(rs.next()){
				Examination exam=new Examination();
				//�����ݿ���ȡֵ��������ֵ
				String Name=rs.getString("ExaminationName");
				String No=rs.getString("QuestionNo");
				String content=rs.getString("QuestionContent");
				long count=rs.getLong("ErrorTimes");
				//�Զ���ֵ
				exam.setExaminationName(Name);
				exam.setQuestionNo(No);
				exam.setQuestionContent(content);
				exam.setErrorTimes(count);
				list.add(exam);
				//��ӵ�����
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
