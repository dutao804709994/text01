package com.xunpoit.imp;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xunpoit.dao.UserManager;
import com.xunpoit.entity.User;

public class UserManagerImp extends HibernateDaoSupport implements UserManager {
	
	

	public boolean addUser(User user) {
		
		this.getHibernateTemplate().save(user);
		
		return true;
	}

	public boolean delUser(int id) {
		
		this.getHibernateTemplate().delete(findUser(id));
		return true;
	}

	public User findUser(int id) {
		
		User user = (User) this.getHibernateTemplate().get(User.class, id);
		
		return user;
	}

	public boolean updateUser(User user) {
		
		
		this.getHibernateTemplate().update(user);
		
		return true;
	}
	
	

}
