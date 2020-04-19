package com.Model;

public class User {
	public User(String name, String id, String sex, String home, String password) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.home = home;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String id;
	private String sex;
	private String home;
	private String password;
	private int type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return name+home;
	}
}
