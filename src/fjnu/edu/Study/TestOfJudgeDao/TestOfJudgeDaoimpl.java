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
 * 实现判断题接口的类
 * @author Administrator
 *
 */
public class TestOfJudgeDaoimpl implements TestOfJudgeDao {
	/**
	 * 连接数据库
	 */
	private Connection conn = DbConn.getConn();
	/**
	 * 查询所有判断题并以集合的形式返回
	 */
	public List<TestOfJudge> selectList() {
		// TODO Auto-generated method stub
		List<TestOfJudge> List = new ArrayList<TestOfJudge>();
		String sql = "select * from t_yesorno";
		Statement smt;
		try {
			//执行sql
			smt = conn.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				TestOfJudge judge = new TestOfJudge();
				// 从数据库里取值出来并赋值
				int JudgeNo = rs.getInt("no");
				String Question = rs.getString("question");
				String Answer = rs.getString("answer");
				long count = rs.getLong("wrong_num");//错误次数的计算
				// 对对象赋值
				judge.setJudgeNo(JudgeNo);
				judge.setJudgeQuestion(Question);
				judge.setJudgeAnswer(Answer);
				judge.setWrongTimes(count);
				List.add(judge);
				// 添加到集合
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return List;
	}

	/**
	 * 查询指定判断题题号的对象并以集合的形式返回
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
				// 从数据库里取值出来并赋值
				String Question = rs.getString("question");
				String Answer = rs.getString("answer");
				long count = rs.getLong("wrong_num");//错误次数的计算
				// 对对象赋值
				select.setJudgeNo(JudgeNo);
				select.setJudgeQuestion(Question);
				select.setJudgeAnswer(Answer);
				select.setWrongTimes(count);
				List.add(select);
				// 添加到集合
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
	 * 对判断题题目的添加
	 */
	@Override
	public boolean addJudgeQuestion(TestOfJudge Judge) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into t_yesorno(no,question,answer,wrong_num) values(?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// 执行sql语句
			pstmt = conn.prepareStatement(sql);
			// 数据库值得添加
			pstmt.setLong(1, Judge.getJudgeNo());
			pstmt.setString(2, Judge.getJudgeQuestion());
			pstmt.setString(3, Judge.getJudgeAnswer());
			pstmt.setLong(4, Judge.getWrongTimes());
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
	 * 对判断题试题的删除
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
				System.out.println("删除成功!!!!！");
			}
			else{
				flag=false;
				System.out.println("删除失败!!!!！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 判断题的更新
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
				System.out.println("更新成功!!!!!！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}

