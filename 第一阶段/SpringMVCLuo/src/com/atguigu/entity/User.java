package com.atguigu.entity;

public class User {
	
	// 字面量
	private Integer id;
	private String username;
	private String password;
	
	// 自定义的引用数据类型
	private Phone phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public User(Integer id, String username, String password, Phone phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
	}
	
	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return " [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone + "]";
	}
	
	
	


}
