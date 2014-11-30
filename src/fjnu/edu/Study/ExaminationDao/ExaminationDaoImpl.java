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
	 * 连接数据库
	 */
	private Connection conn = DbConn.getConn();
	
	/**
	 * 对试题的插入，如果返回值为true则提示添加成功
	 */
	@Override
	public boolean addExaminationPaper(Examination examin) {
		// TODO Auto-generated method stub
		boolean flag = true;
		String sql = "insert into testQuestion(ExaminationName,QuestionNo,QuestionContent,ErrorTimes) values(?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// 执行sql语句
			pstmt = conn.prepareStatement(sql);
			// 数据库值得添加
			pstmt.setString(1, examin.getExaminationName());
			pstmt.setString(2, examin.getQuestionNo());
			pstmt.setString(3, examin.getQuestionContent());
			pstmt.setLong(4, examin.getErrorTimes());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				flag = true;
				System.out.println("插入数据成功！！！");
			} else {
				flag = false;
				System.out.println("插入数据失败！！！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("发生不可预知的异常！");
		}
		return flag;
	}

	/**
	 * 对试题的删除
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
	 * 对试卷的删除
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
	 * 判断是否存在当前试卷名称
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
					.println("空指针异常:" + nu.getMessage() + " " + nu.getCause());
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return exam;
	}

	/**
	 *判断是否存在当前试卷名称和试题编号
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
					.println("空指针异常:" + nu.getMessage() + " " + nu.getCause());
		} catch (Exception ex) {
			System.out.println(ex.getMessage() + " " + ex.getCause());
		}
		return exam;
	}
	/**
	 * 查询出所有的试题
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
				//从数据库里取值出来并赋值
				String Name=rs.getString("ExaminationName");
				String No=rs.getString("QuestionNo");
				String content=rs.getString("QuestionContent");
				long count=rs.getLong("ErrorTimes");
				//对对象赋值
				exam.setExaminationName(Name);
				exam.setQuestionNo(No);
				exam.setQuestionContent(content);
				exam.setErrorTimes(count);
				list.add(exam);
				//添加到集合
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 查询指定试卷的内容
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
				//从数据库里取值出来并赋值
				String Name=rs.getString("ExaminationName");
				String No=rs.getString("QuestionNo");
				String content=rs.getString("QuestionContent");
				long count=rs.getLong("ErrorTimes");
				//对对象赋值
				exam.setExaminationName(Name);
				exam.setQuestionNo(No);
				exam.setQuestionContent(content);
				exam.setErrorTimes(count);
				list.add(exam);
				//添加到集合
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
