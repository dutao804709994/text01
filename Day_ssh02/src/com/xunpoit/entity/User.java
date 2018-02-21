package com.xunpoit.entity;
/**
 * @hibernate.class 
 * table="t_user"
 *
 */
public class User {
	
	/**
	 * @hibernate.id
	 *  generator-class="native"
	 */

	private int id;
	
	/**
	 * @hibernate.property
	 *  column="userName" length="20"
	 */

	private String userName;
	
	/**
	 * @hibernate.property
	 *   column="passWord" length="20"
	 */

	private String passWord;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
