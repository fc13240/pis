package zhuanli.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import zhuanli.dao.UserDao;
import zhuanli.dao.mapper.UserMapper;
import zhuanli.domain.User;

public class UserMybatisDao extends SqlSessionDaoSupport implements UserDao {
	private UserMapper userMapper;
	

	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public User findByName(String username) {
		
		return userMapper.findByName(username);
	}

	@Override
	public void save(User user) {
		userMapper.save(user);
		
	}

	@Override
	public User getById(int userId) {
		return userMapper.getById(userId);
	}
	
	@Override
	public User getByUsername(String username) {
		return userMapper.getByUsername(username);
	}
	
	

}