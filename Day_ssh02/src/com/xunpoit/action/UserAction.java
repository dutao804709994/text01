package com.xunpoit.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.xunpoit.dao.UserManager;
import com.xunpoit.entity.User;

public class UserAction extends ActionSupport {

	private UserManager userManager;

	private User user;

	private int id;

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String add() {

		return "add";

	}

	public String add1() {

		userManager.addUser(user);

		return "add_success";

	}

	public String del() {

		return "del";

	}

	public String del1() {

		userManager.delUser(id);

		return "del_success";

	}
	
	public String find() {
      return "find";
	}
	public String find1() {

		User user = userManager.findUser(id);

		Map<Object, Object> request = (Map<Object, Object>) ActionContext
				.getContext().get("request");

		request.put("user", user);

		return "find_success";
	}

	public String update() {

		return "update";
	}

	public String update1() {

		userManager.updateUser(user);

		return "update_success";
	}

}
