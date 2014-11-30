package fjnu.edu.Study.domain;

/**
 * 判断题得类
 * 
 * @author Administrator
 * 
 */
public class TestOfJudge {
	private int JudgeNo;
	private String JudgeQuestion;
	private String JudgeAnswer;
	private long WrongTimes;

	/**
	 * @return the judgeNo
	 */
	public int getJudgeNo() {
		return JudgeNo;
	}

	/**
	 * @param judgeNo
	 *            the judgeNo to set
	 */
	public void setJudgeNo(int judgeNo) {
		JudgeNo = judgeNo;
	}

	/**
	 * @return the judgeQuestion
	 */
	public String getJudgeQuestion() {
		return JudgeQuestion;
	}

	/**
	 * @param judgeQuestion
	 *            the judgeQuestion to set
	 */
	public void setJudgeQuestion(String judgeQuestion) {
		JudgeQuestion = judgeQuestion;
	}

	/**
	 * @return the judgeAnswer
	 */
	public String getJudgeAnswer() {
		return JudgeAnswer;
	}

	/**
	 * @param judgeAnswer
	 *            the judgeAnswer to set
	 */
	public void setJudgeAnswer(String judgeAnswer) {
		JudgeAnswer = judgeAnswer;
	}

	/**
	 * @return the wrongTimes
	 */
	public long getWrongTimes() {
		return WrongTimes;
	}

	/**
	 * @param wrongTimes
	 *            the wrongTimes to set
	 */
	public void setWrongTimes(long wrongTimes) {
		WrongTimes = wrongTimes;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n试题编号：" + this.JudgeNo + "\n试题题目：" + this.JudgeQuestion + "\n试题答案："
				+ this.JudgeAnswer+"\n错误次数："+this.WrongTimes;
	}
}
