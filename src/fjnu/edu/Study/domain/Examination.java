package fjnu.edu.Study.domain;

public class Examination {
	// �Ծ�����
	private String ExaminationName;
	// ÿ����������
	private String QuestionContent;
	// ������
	private String QuestionNo;
	// ����������
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
	 * ��дtoString����
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�Ծ�����:" + this.ExaminationName + "������:" + this.QuestionNo
				+ "��������:" + this.QuestionContent + "����������:"+this.ErrorTimes;
	}

}
