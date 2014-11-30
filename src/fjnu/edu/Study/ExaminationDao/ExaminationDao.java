package fjnu.edu.Study.ExaminationDao;


import java.util.List;

import fjnu.edu.Study.domain.Examination;

public interface ExaminationDao {
	/**
	 * 获取指定的试题
	 */
	public Examination findExaminationQuestion(int id);
		

	/**
	 * 添加试题
	 */
	public boolean addExaminationPaper(Examination examin);

	/**
	 * 删除试题
	 */

	public boolean deleteExaminationPaper(Examination exam);
	/**
	 * 试卷的删除
	 */
	public boolean deleteWholePaper(Examination exam);
	/**
	 * 修改试题内容
	 */
	public boolean updateExaminationPaper(Examination examin);

	/**
	 * 判断是否存在当前试卷名称
	 * @param exam
	 * @return
	 */
	public Examination findExaminationQuestion(Examination exam);
	/**
	 * 判断是否存在当前试卷名称和试题编号
	 */
	public Examination findWhoepaper(Examination exam);
	/**
	 * 查询出所有的题目
	 */
	public List<Examination>examinationList();
	/**
	 * 查询出某套试卷的题目
	 */
	public List<Examination>examinationList(String name);

}























