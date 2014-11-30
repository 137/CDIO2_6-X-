package fjnu.edu.CFunctionDao;

import java.util.List;
import java.util.Set;

import fjnu.edu.Study.domain.CFuntion;

public interface CFunctionDao {

	/**
	 * 查询所有函数名和函数功能
	 * @return
	 */
	Set<CFuntion> listFunction();
	
	/**
	 * 根据函数类型查询对应函数名和函数功能
	 * @return
	 */
	Set<CFuntion> listSortFunctionByType(String type);
	
	/**
	 * 根据函数名查询对应函数信息
	 * @param name
	 * @return
	 */
	List<CFuntion> listSortFunctionByName(String name);
}
