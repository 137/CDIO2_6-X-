package fjnu.edu.Study.UserDao;

import fjnu.edu.Study.domain.User;


public interface UserDao {
    /**
     * 登陆用户验证
     * @param page
     * @return
     */
  public boolean isLogin(User user);

	 /**
	  * 修改用户的密码
	  * @param page
	  * @return
	  */
	
	public int updateUserPassWord(User  user);
	/**
	 * 添加用户信息
	 */
	public void insertUserImfor(User user);
	/**
	 * 注册用户验证
	 */
	public boolean searchUser(User user);
}
