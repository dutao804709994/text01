package com.xunpoit.dao;

import com.xunpoit.entity.User;

public interface UserManager {
	
	public boolean addUser(User user);
	
	public boolean delUser(int id);
	
	public User findUser(int id);
	
	public boolean updateUser(User user);

}
