package fjnu.edu.Study.UserDao;

import fjnu.edu.Study.domain.User;


public interface UserDao {
    /**
     * ��½�û���֤
     * @param page
     * @return
     */
  public boolean isLogin(User user);

	 /**
	  * �޸��û�������
	  * @param page
	  * @return
	  */
	
	public int updateUserPassWord(User  user);
	/**
	 * ����û���Ϣ
	 */
	public void insertUserImfor(User user);
	/**
	 * ע���û���֤
	 */
	public boolean searchUser(User user);
}
