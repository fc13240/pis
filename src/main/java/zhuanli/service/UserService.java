package zhuanli.service;


import zhuanli.domain.User;



public interface UserService {
	
	/*
	 * 注册
	 */
	boolean register(User user);
	/*
	 * 修改密码
	 */
	User findByName(String username);	
	
	String findPassword(User user);
	
}
