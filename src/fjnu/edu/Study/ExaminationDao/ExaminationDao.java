package fjnu.edu.Study.ExaminationDao;


import java.util.List;

import fjnu.edu.Study.domain.Examination;

public interface ExaminationDao {
	/**
	 * ��ȡָ��������
	 */
	public Examination findExaminationQuestion(int id);
		

	/**
	 * �������
	 */
	public boolean addExaminationPaper(Examination examin);

	/**
	 * ɾ������
	 */

	public boolean deleteExaminationPaper(Examination exam);
	/**
	 * �Ծ��ɾ��
	 */
	public boolean deleteWholePaper(Examination exam);
	/**
	 * �޸���������
	 */
	public boolean updateExaminationPaper(Examination examin);

	/**
	 * �ж��Ƿ���ڵ�ǰ�Ծ�����
	 * @param exam
	 * @return
	 */
	public Examination findExaminationQuestion(Examination exam);
	/**
	 * �ж��Ƿ���ڵ�ǰ�Ծ����ƺ�������
	 */
	public Examination findWhoepaper(Examination exam);
	/**
	 * ��ѯ�����е���Ŀ
	 */
	public List<Examination>examinationList();
	/**
	 * ��ѯ��ĳ���Ծ����Ŀ
	 */
	public List<Examination>examinationList(String name);

}























