package com.atguigu.exer3;

public class Test {

	public static void main(String[] args) {
		
		/*
	（1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

		 */
		//创建一个账户
		Account account = new Account(1000, 2000, 0.0123);
		//创建一个用户
		Customer customer = new Customer("Jane", "Smith");
		//将用户和账户进行关联
		customer.setAccount(account);
		
		/*
		//对Jane Smith操作。存入 100 元
		customer.getAccount().deposit(100);
		//再取出960元
		customer.getAccount().withdraw(960);
		//再取出2000
		customer.getAccount().withdraw(2000);
		*/
		//1.先获取JaneSmith的账户
		Account at = customer.getAccount();
		at.deposit(100);
		at.withdraw(960);
		at.withdraw(2000);
		
		System.out.println("---------------------");
		//Customer [Smith, Jane] has a account: id is 1000, 
		//annualInterestRate is 1.23％, balance is 1140.0
		System.out.println("Customer [" + customer.getFirstName() +", " + customer.getLastName() +"] "
				+ "has a account: id is " + customer.getAccount().getId() +", "
						+ "annualInterestRate is " + 
				customer.getAccount().getAnnualInterestRate() * 100+"％, "
						+ "balance is " + customer.getAccount().getBalance());
	}
}
