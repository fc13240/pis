package ideaStreet.service.impl;

import java.util.List;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import ideaStreet.dao.UserDao;
import ideaStreet.domain.User;
import ideaStreet.service.UserService;
import ideaStreet.util.EmailUtils;



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

	@Override
	public String findPassword(User user) {
    	String toEmail=user.getEmail();
    	String statusType="";
    	if(toEmail.length() != 0){
    		String newPassword=EmailUtils.roundPassword(5);//得到随机密码
    		boolean success = resetPassword(user, newPassword);
    		
    		if(success){
    			EmailUtils.sendResetPasswordEmail(toEmail,newPassword);
    			statusType="1";//重置密码成功
    		}else{
    			
    			statusType="3";//修改密码失败
    		}
    		
    	}else{
    		statusType="6";//邮箱不存在
    		
    	}

		return statusType;
	}
	
	//随机密码
		@Transactional
		public boolean resetPassword(User user ,String newPassword){
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
				user.setVisiblePassword(newPassword);
				user.setPassword(encoder.encode(newPassword));
				userDao.updatePassword(user);
				return true;
		}

}
