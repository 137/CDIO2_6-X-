package fjnu.edu.Study.TestOfSelectDao;

import java.util.List;

import fjnu.edu.Study.domain.TestOfSelect;

/**
 * ѡ����dao�ӿ�
 * @author Administrator
 */
public interface TestOfSelectDao {
	/**
	 * �����洢����ѡ������ļ���
	 */
	List<TestOfSelect> selectList();
	/**
	 * ��ѯ��ǰѡ����Ķ���
	 */
	List<TestOfSelect> Current_SelectList(int SelectNo);
	/**
	 * ��ѯĳ��ѡ�����������
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectQuestion(int SelectNo);
	/**
	 * ��ѯ��ǰ�����ѡ��
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectDecision(String SelectNo);
	/**
	 * ��ѯ��ǰ����Ĵ�
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectAnswer(String SelectNo);
	/**
	 * ��ѯ��ǰ����Ĵ������
	 * @param SelectNo
	 * @return
	 */
	boolean findCurrentSelectErrorTimes(String SelectNo);
	/**
	 * ��ѯ���е�ѡ������
	 * @param select
	 * @return
	 */
	boolean findAllSelectQuestion(TestOfSelect select);
	/**
	 * ��ӵ�ǰ����
	 * @param select
	 * @return
	 */
	boolean addSelectQuestion(TestOfSelect select);
	/**
	 * ɾ����ǰ����
	 * @param select
	 * @return
	 */
	boolean deleteCurrentSelectQuestion(int SelectNo);
	/**
	 * ���µ�ǰ����
	 * @param select
	 */
	boolean updateCurrentSelectQuestion(TestOfSelect select);
}
