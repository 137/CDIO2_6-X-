package fjnu.edu.Study.domain;

public class Examination {
	// 试卷名称
	private String ExaminationName;
	// 每个试题内容
	private String QuestionContent;
	// 试题编号
	private String QuestionNo;
	// 试题错误次数
	private long ErrorTimes;

	/**
	 * @return the examinationName
	 */
	public String getExaminationName() {
		return ExaminationName;
	}

	/**
	 * @param examinationName
	 *            the examinationName to set
	 */
	public void setExaminationName(String examinationName) {
		ExaminationName = examinationName;
	}

	/**
	 * @return the questionNo
	 */
	public String getQuestionNo() {
		return QuestionNo;
	}

	/**
	 * @param questionNo
	 *            the questionNo to set
	 */
	public void setQuestionNo(String questionNo) {
		QuestionNo = questionNo;
	}

	/**
	 * @return the questionContent
	 */
	public String getQuestionContent() {
		return QuestionContent;
	}

	/**
	 * @param questionContent
	 *            the questionContent to set
	 */
	public void setQuestionContent(String questionContent) {
		QuestionContent = questionContent;
	}

	/**
	 * @return the errorTimes
	 */
	public long getErrorTimes() {
		return ErrorTimes;
	}

	/**
	 * @param errorTimes
	 *            the errorTimes to set
	 */
	public void setErrorTimes(long errorTimes) {
		ErrorTimes = errorTimes;
	}

	/**
	 * @param examinationName
	 * @param questionNo
	 * @param questionContent
	 * @param errorTimes
	 */
	public Examination(String examinationName, String questionNo,
			String questionContent, long errorTimes) {
		ExaminationName = examinationName;
		QuestionNo = questionNo;
		QuestionContent = questionContent;
		ErrorTimes = errorTimes;
	}

	/**
	 * 
	 */
	public Examination() {
	}

	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "试卷名称:" + this.ExaminationName + "试题编号:" + this.QuestionNo
				+ "试题内容:" + this.QuestionContent + "试题错误次数:"+this.ErrorTimes;
	}

}
