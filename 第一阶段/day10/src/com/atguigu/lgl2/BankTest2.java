package com.atguigu.lgl2;

public class BankTest2 {

	public static void main(String[] args) {
		
		//创建对象
		Bank bank = new Bank();
		
		//添加用户
//		bank.addCustomer("小", "许");
		bank.addCustomer("小", "罗");
		
		//创建账号
		Account account = new Account(1000);

		//用户和账号 关联起来
		Customer cu1 =  bank.getCustomer(0);
		cu1.setAccount(account);
		
		
		Account test1 = cu1.getAccount();
		test1.deposit(100);
		test1.deposit(230);
		test1.withdraw(2000);
		
	}
}
