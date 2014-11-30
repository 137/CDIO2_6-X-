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
 * 选择题dao实现类
 * 
 * @author Administrator
 * 
 */
public class TestOfSelectDaoImpl implements TestOfSelectDao {
	/**
	 * 连接数据库
	 */
	private Connection conn = DbConn.getConn();

	/**
	 * 查询所有题目并以集合的形式返回
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
				// 从数据库里取值出来并赋值
				int selectNo = rs.getInt("no");
				String QuestionNo = rs.getString("question");
				String A = rs.getString("a");
				String B = rs.getString("b");
				String C = rs.getString("c");
				String D = rs.getString("d");
				String right_answer = rs.getString("right");
				long count = rs.getLong("wrong_num");
				// 对对象赋值
				select.setSelectNo(selectNo);
				select.setQuestion(QuestionNo);
				select.setA(A);
				select.setB(B);
				select.setC(C);
				select.setD(D);
				select.setRightAnswer(right_answer);
				select.setWrongTimes(count);
				list.add(select);
				// 添加到集合
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * 查询当前选择题的对象
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
				// 从数据库里取值出来并赋值
				int selectNo = rs.getInt("no");
				String QuestionNo = rs.getString("question");
				String A = rs.getString("a");
				String B = rs.getString("b");
				String C = rs.getString("c");
				String D = rs.getString("d");
				String right_answer = rs.getString("right");
				long count = rs.getLong("wrong_num");
				// 对对象赋值
				select.setSelectNo(selectNo);
				select.setQuestion(QuestionNo);
				select.setA(A);
				select.setB(B);
				select.setC(C);
				select.setD(D);
				select.setRightAnswer(right_answer);
				select.setWrongTimes(count);
				list.add(select);
				// 添加到集合
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * 判断是否存在这个编号
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
					.println("空指针异常:" + nu.getMessage() + " " + nu.getCause());
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
	 * 对选择题目的添加
	 */
	@Override
	public boolean addSelectQuestion(TestOfSelect select) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into t_choose(no,question,a,b,c,d,right,wrong_num) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			// 执行sql语句
			pstmt = conn.prepareStatement(sql);
			// 数据库值得添加
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
	 * 删除当前试题
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
				System.out.println("删除成功！");
			}
			else{
				flag=false;
				System.out.println("删除失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 * 修改所选试题
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
				System.out.println("更新成功!!!!!!!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

}
