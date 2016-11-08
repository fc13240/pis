package zhuanli.dao;

import zhuanli.domain.User;

public interface UserDao {
	
	
	User findByName(String username);
	
	void save(User user);
		
	User getById(int userId);
	
	User getByUsername(String username);
	
	void updatePassword(User user);

}
