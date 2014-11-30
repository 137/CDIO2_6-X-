package fjnu.edu.Study.TestOfSelectDao;

import java.util.List;

import fjnu.edu.Study.domain.TestOfSelect;

/**
 * 选择题dao接口
 * @author Administrator
 */
public interface TestOfSelectDao {
	/**
	 * 用来存储所有选择试题的集合
	 */
	List<TestOfSelect> selectList();
	/**
	 * 查询当前选择题的对象
	 */
	List<TestOfSelect> Current_SelectList(int SelectNo);
	/**
	 * 查询某道选择试题的问题
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectQuestion(int SelectNo);
	/**
	 * 查询当前试题的选项
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectDecision(String SelectNo);
	/**
	 * 查询当前试题的答案
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectAnswer(String SelectNo);
	/**
	 * 查询当前试题的错误次数
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectErrorTimes(String SelectNo);
	/**
	 * 查询所有的选择试题
	 * @param select
	 * @return
	 */
	boolean findAllSelectQuestion(TestOfSelect select);
	/**
	 * 添加当前试题
	 * @param select
	 * @return
	 */
	boolean addSelectQuestion(TestOfSelect select);
	/**
	 * 删除当前试题
	 * @param select
	 * @return
	 */
	boolean deleteCurrentSelectQuestion(int SelectNo);
	/**
	 * 更新当前试题
	 * @param select
	 */
	boolean updateCurrentSelectQuestion(TestOfSelect select);
}
