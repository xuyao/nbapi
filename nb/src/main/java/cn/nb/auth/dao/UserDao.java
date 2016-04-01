package cn.nb.auth.dao;

import cn.nb.auth.model.User;
import cn.nb.base.annotation.MybatisMapper;

@MybatisMapper
public interface UserDao {
	
	public User exitUser(User user);
	
}
