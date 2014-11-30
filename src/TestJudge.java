import fjnu.edu.Study.TestOfJudgeDao.TestOfJudgeDao;
import fjnu.edu.Study.TestOfJudgeDao.TestOfJudgeDaoimpl;
import fjnu.edu.Study.domain.TestOfJudge;

/**
 * ÅĞ¶ÏÌâµÄ²âÊÔ
 * @author Administrator
 *
 */
public class TestJudge {
	public static void main(String[] args) {
		TestOfJudge judge=new TestOfJudge();
		TestOfJudgeDao dao=new TestOfJudgeDaoimpl();
		/**
		 * Ìí¼Ó²âÊÔ
		 */
		judge.setJudgeNo(0);
		judge.setJudgeQuestion("CÓïÑÔÊÇÒ»ÃÅÓïÑÔÂğ£¿");
		judge.setJudgeAnswer("F");
		judge.setWrongTimes(2);
		dao.addJudgeQuestion(judge);
		/**
		 * ²éÑ¯²âÊÔ
		 */
		for(TestOfJudge j:dao.selectList()){
			System.out.println(j);
		}
		/**
		 * ĞŞ¸Ä²âÊÔ
		 */
		dao.updateCurrentJudgeQuestion(judge);
		/**
		 * É¾³ı²âÊÔ
		 */
//		dao.deleteCurrentJudgeQuestion(4);
		
//		for(TestOfJudge j:dao.select()){
//			System.out.println(j);
//		}
	}
}
