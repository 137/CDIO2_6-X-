import fjnu.edu.Study.TestOfSelectDao.TestOfSelectDaoImpl;
import fjnu.edu.Study.domain.TestOfSelect;

/**
 * ����ѡ����dao
 * @author Administrator
 *
 */
public class TestSelect {
	public static void main(String[] args) {
		TestOfSelect select=new TestOfSelect();
		select.setSelectNo(4);
		select.setQuestion("C������ʲô��");
		select.setA("���������");
		select.setB("�������sss");
		select.setC("�������111");
		select.setD("��������");
		select.setRightAnswer("�������");
		select.setWrongTimes(0);
		TestOfSelectDaoImpl dao=new TestOfSelectDaoImpl();
		/**ɾ������*/
//		dao.deleteCurrentSelectQuestion(1);
		/**�޸Ĳ���*/
		dao.updateCurrentSelectQuestion(select);
//		if(	dao.addSelectQuestion(select)==true){
//			System.out.println("�������ݳɹ�");
//		}
/*		else{
			System.out.println("��������ʧ��");
		}*/
		for(TestOfSelect s:dao.selectList()){
			System.out.println(s);
			System.out.println();
		}
	}
}
