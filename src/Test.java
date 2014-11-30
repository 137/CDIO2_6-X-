import java.util.Scanner;

import javax.ejb.FinderException;

import fjnu.edu.Study.ExaminationDao.ExaminationDao;
import fjnu.edu.Study.ExaminationDao.ExaminationDaoImpl;
import fjnu.edu.Study.domain.Examination;

/**
 * 测试类，测试Examination的数据库操作类
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		ExaminationDao dao=new ExaminationDaoImpl();
		Examination exam=new Examination();
		//查询所有试题
		for(Examination exams:dao.examinationList("期末试卷1")){
			System.out.println(exams);
		}
//		dao.examinationList(exam);
//		for(Examination exams:dao.examinationList(exam)){
//			System.out.println(exams);
//		}
//		System.out.println("请输入试卷名称和编号：");
//		Scanner scan=new Scanner(System.in);
//		String Name=scan.next();
//		String No=scan.next();
//		Examination exam=new Examination();
//		exam.setExaminationName(Name);
//		exam.setQuestionNo(No);
		
		
//		exam.setQuestionContent("C?");
//		exam.setErrorTimes(1);
//		ExaminationDao dao=new ExaminationDaoImpl();
//		System.out.println("1");
//		if(dao.addExaminationPaper(exam)){
//			System.out.println(dao.findExaminationQuestion(exam));
//		}
//		System.out.println(dao.findExaminationQuestion(exam));
//		
//		System.out.println("请输入要删除的试卷：");
//		String Name2=scan.next();
//		Examination exam2=new Examination();
//		exam2.setExaminationName(Name2);
//		if(dao.deleteWholePaper(exam2)){
//			System.out.println(dao.findExaminationQuestion(exam));
//			System.out.println("删除成功");
//		}
//		scan.close();
	}
}
