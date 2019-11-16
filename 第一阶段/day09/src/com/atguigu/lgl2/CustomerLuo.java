package com.atguigu.lgl2;

public class CustomerLuo {
	
	//属性
	private String firstName;
	private String lastName;
	private AccountLuo account;
	
	//构造器
	public CustomerLuo(String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public AccountLuo getAccount(){
		return account;
	}
	public void setAccount(AccountLuo account){
		this.account = account;
	}
	
}
