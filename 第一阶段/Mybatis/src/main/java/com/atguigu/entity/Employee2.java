package com.atguigu.entity;

public class Employee2 {
	
	private Integer id;
	private String name;
	private String sex;
	private String emailAddress;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Employee2() {
		
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", sex=" + sex + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
	

}
