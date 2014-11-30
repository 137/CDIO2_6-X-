import fjnu.edu.Study.TestOfSelectDao.TestOfSelectDaoImpl;
import fjnu.edu.Study.domain.TestOfSelect;

/**
 * 测试选择题dao
 * @author Administrator
 *
 */
public class TestSelect {
	public static void main(String[] args) {
		TestOfSelect select=new TestOfSelect();
		select.setSelectNo(4);
		select.setQuestion("C语言是什么？");
		select.setA("计算机语言");
		select.setB("编程语言sss");
		select.setC("外国语言111");
		select.setD("人类语言");
		select.setRightAnswer("编程语言");
		select.setWrongTimes(0);
		TestOfSelectDaoImpl dao=new TestOfSelectDaoImpl();
		/**删除测试*/
//		dao.deleteCurrentSelectQuestion(1);
		/**修改测试*/
		dao.updateCurrentSelectQuestion(select);
//		if(	dao.addSelectQuestion(select)==true){
//			System.out.println("插入数据成功");
//		}
/*		else{
			System.out.println("插入数据失败");
		}*/
		for(TestOfSelect s:dao.selectList()){
			System.out.println(s);
			System.out.println();
		}
	}
}
