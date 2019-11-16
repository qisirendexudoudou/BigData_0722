package com.atguigu.lgl;

public class BankTest {

	public static void main(String[] args) {
		
		//创建一个Bank的对象
		Bank bank = new Bank();
		bank.addCustomer("小", "许");
		bank.addCustomer("小", "罗");
		
		//给用户设置账户
		//1 创建账户
		Account account = new Account(1000);
		
		//2关联起来
		//获取用户
		Customer customer = bank.getCustomer(1);
		customer.setAccount(account);
		
		//账户操作
		//存100
		Account account2 = customer.getAccount();
		account2.deposit(100);
		account2.deposit(230);
		account2.withdraw(2000);
		
		
	}
}
