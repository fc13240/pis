package zhuanli.dao.mapper;

import java.util.List;
import zhuanli.domain.User;

public interface UserMapper {
	
	User findByName(String username);
	
	void save(User user);
	
	User getById(int userId);
	
	User getByUsername(String username);
	
	List<User> getAllUser();


	

}
