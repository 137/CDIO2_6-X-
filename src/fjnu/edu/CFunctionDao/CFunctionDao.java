package fjnu.edu.CFunctionDao;

import java.util.List;
import java.util.Set;

import fjnu.edu.Study.domain.CFuntion;

public interface CFunctionDao {

	/**
	 * ��ѯ���к������ͺ�������
	 * @return
	 */
	Set<CFuntion> listFunction();
	
	/**
	 * ���ݺ������Ͳ�ѯ��Ӧ�������ͺ�������
	 * @return
	 */
	Set<CFuntion> listSortFunctionByType(String type);
	
	/**
	 * ���ݺ�������ѯ��Ӧ������Ϣ
	 * @param name
	 * @return
	 */
	List<CFuntion> listSortFunctionByName(String name);
}
