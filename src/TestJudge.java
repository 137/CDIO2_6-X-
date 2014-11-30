import fjnu.edu.Study.TestOfJudgeDao.TestOfJudgeDao;
import fjnu.edu.Study.TestOfJudgeDao.TestOfJudgeDaoimpl;
import fjnu.edu.Study.domain.TestOfJudge;

/**
 * �ж���Ĳ���
 * @author Administrator
 *
 */
public class TestJudge {
	public static void main(String[] args) {
		TestOfJudge judge=new TestOfJudge();
		TestOfJudgeDao dao=new TestOfJudgeDaoimpl();
		/**
		 * ��Ӳ���
		 */
		judge.setJudgeNo(0);
		judge.setJudgeQuestion("C������һ��������");
		judge.setJudgeAnswer("F");
		judge.setWrongTimes(2);
		dao.addJudgeQuestion(judge);
		/**
		 * ��ѯ����
		 */
		for(TestOfJudge j:dao.selectList()){
			System.out.println(j);
		}
		/**
		 * �޸Ĳ���
		 */
		dao.updateCurrentJudgeQuestion(judge);
		/**
		 * ɾ������
		 */
//		dao.deleteCurrentJudgeQuestion(4);
		
//		for(TestOfJudge j:dao.select()){
//			System.out.println(j);
//		}
	}
}
