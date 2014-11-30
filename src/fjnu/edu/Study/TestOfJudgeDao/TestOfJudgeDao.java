package fjnu.edu.Study.TestOfJudgeDao;

import java.util.List;

import fjnu.edu.Study.domain.TestOfJudge;
/**
 * 判断题dao接口
 * @author Administrator
 *
 */
public interface TestOfJudgeDao {
	/**
	 * 用来存储所有判断题的集合并查询出来
	 */
	List<TestOfJudge> selectList();
	/**
	 * 查询当前判断题的对象
	 */
	List<TestOfJudge> Current_JudgeList(int JudgeNo);
	/**
	 * 对某道判断题是否存在的验证
	 * @param SelectNo
	 * @return
	 */
	boolean isfindCurrentJudge(int JudgeNo);
	/**
	 * 添加当前试题
	 * @param select
	 * @return
	 */
	boolean addJudgeQuestion(TestOfJudge Judge);
	/**
	 * 删除当前试题
	 * @param select
	 * @return
	 */
	boolean deleteCurrentJudgeQuestion(int JudgeNo);
	/**
	 * 更新当前试题
	 * @param select
	 */
	boolean updateCurrentJudgeQuestion(TestOfJudge select);
}
