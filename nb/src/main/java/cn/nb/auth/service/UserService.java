package cn.nb.auth.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.nb.auth.dao.UserDao;
import cn.nb.auth.model.User;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User exitUser(User user){
		return userDao.exitUser(user);
	}
	
}
