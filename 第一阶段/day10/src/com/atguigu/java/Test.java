package com.atguigu.java;

public class Test {

	public static void main(String[] args) {
		
		//创建一个Bank对象
		Bank bank = new Bank();
		//添加用户
		bank.addCustomer("小", "刚哥");
		bank.addCustomer("小", "宋宋");
		
		//给用户设置账户
		//1.创建账户
		Account account = new Account(1000);
		//2.将账户和用户绑定在一起
		Customer customer = bank.getCustomer(1);//获取指定用户
		customer.setAccount(account);
		
		
		//操作账户
		//向小宋宋的账户添加100
		
		bank.getCustomer(1).getAccount().deposit(100);
		//查看小宋宋的余额
		double balance = bank.getCustomer(1).getAccount().getBalance();
		System.out.println(balance);
		
		//方式二
		Customer b1 = bank.getCustomer(1); // 获取bank中的该用户
		Account a1 = b1.getAccount();	//获取该用户的账户信息
		a1.deposit(100);	// 该用户的账户 存入100
		a1.deposit(460);
		a1.withdraw(2000);
		
		
	}
}
