package fjnu.edu.Study.domain;

/**
 * 选择题得类
 * 
 * @author Administrator
 * 
 */
public class TestOfSelect {
	private int SelectNo;
	private String question;
	private String A;
	private String B;
	private String C;
	private String D;
	private String RightAnswer;
	private long WrongTimes;

	/**
	 * @return the selectNo
	 */
	public int getSelectNo() {
		return SelectNo;
	}

	/**
	 * @param selectNo
	 *            the selectNo to set
	 */
	public void setSelectNo(int selectNo) {
		SelectNo = selectNo;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the a
	 */
	public String getA() {
		return A;
	}

	/**
	 * @param a
	 *            the a to set
	 */
	public void setA(String a) {
		A = a;
	}

	/**
	 * @return the b
	 */
	public String getB() {
		return B;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(String b) {
		B = b;
	}

	/**
	 * @return the c
	 */
	public String getC() {
		return C;
	}

	/**
	 * @param c
	 *            the c to set
	 */
	public void setC(String c) {
		C = c;
	}

	/**
	 * @return the d
	 */
	public String getD() {
		return D;
	}

	/**
	 * @param d
	 *            the d to set
	 */
	public void setD(String d) {
		D = d;
	}

	/**
	 * @return the rightAnswer
	 */
	public String getRightAnswer() {
		return RightAnswer;
	}

	/**
	 * @param rightAnswer
	 *            the rightAnswer to set
	 */
	public void setRightAnswer(String rightAnswer) {
		RightAnswer = rightAnswer;
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
		return "选择题编号：" + this.SelectNo + "\n选择题题目：" + this.question+ "\n选项A:"
				+ this.A + "\n选项B:" + this.B + "\n选项C:" + this.C + "\n选项D:" + this.D
				+ "\n正确答案：" + this.RightAnswer + "\n错误次数：" + this.WrongTimes;
	}
}
