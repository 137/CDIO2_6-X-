package fjnu.edu.Study.TestOfJudgeDao;

import java.util.List;

import fjnu.edu.Study.domain.TestOfJudge;
/**
 * �ж���dao�ӿ�
 * @author Administrator
 *
 */
public interface TestOfJudgeDao {
	/**
	 * �����洢�����ж���ļ��ϲ���ѯ����
	 */
	List<TestOfJudge> selectList();
	/**
	 * ��ѯ��ǰ�ж���Ķ���
	 */
	List<TestOfJudge> Current_JudgeList(int JudgeNo);
	/**
	 * ��ĳ���ж����Ƿ���ڵ���֤
	 * @param SelectNo
	 * @return
	 */
	boolean isfindCurrentJudge(int JudgeNo);
	/**
	 * ��ӵ�ǰ����
	 * @param select
	 * @return
	 */
	boolean addJudgeQuestion(TestOfJudge Judge);
	/**
	 * ɾ����ǰ����
	 * @param select
	 * @return
	 */
	boolean deleteCurrentJudgeQuestion(int JudgeNo);
	/**
	 * ���µ�ǰ����
	 * @param select
	 */
	boolean updateCurrentJudgeQuestion(TestOfJudge select);
}
