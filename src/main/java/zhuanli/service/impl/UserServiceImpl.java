package zhuanli.service.impl;

import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import zhuanli.dao.UserDao;
import zhuanli.domain.User;
import zhuanli.service.UserService;



public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	
	//注册
	@Override
	@Transactional
	public boolean register(User user) {
		//注册前检查用户名是否存在
		User has_user=userDao.findByName(user.getUsername());
		if(has_user!=null){
			return false;
		}
		//添加处理
		user.setVisiblePassword(user.getPassword());
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
		user.setVisiblePassword(user.getPassword());
		user.setPassword(encode.encode(user.getPassword()));
		userDao.save(user);
		return true;
		
	}
	
	@Override
	public User findByName(String username) {
		return userDao.findByName(username);
	}

	

}
