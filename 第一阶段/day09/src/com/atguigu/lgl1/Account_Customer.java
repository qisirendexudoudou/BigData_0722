package com.atguigu.lgl1;


/*
3.写一个测试程序。
（1）创建一个Customer ，名字叫 Jane Smith, 
他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

成功存入 ：100.0
成功取出：960.0
余额不足，取款失败
Customer [Smith, Jane] has a account: id is 1000, 
annualInterestRate is 1.23％, balance is 1140.0
*/

public class Account_Customer {

	public static void main(String[] args) {
		
		//创建账户信息
		Account account = new Account(1000,2000,0.0123);
		
		//创建用户信息
		Customer customer = new Customer("Jane", "Smith");
	
		//用户和账户关联	
		customer.setAccount(account);

		//操作		
		Account ac1 = customer.getAccount();
		
		ac1.deposit(100);
		ac1.withdraw(960);
		ac1.withdraw(2000);
		
		System.out.println("Customer ["+ customer.getFirstName() +", "+ customer.getLastName()+"] has a account: "
				+ "id is "+ account.getId() +", annualInterestRate is "+account.getAnnualInterestRate()* 100 +"％, "
						+ "balance is "+ account.getBalance());
		
	}

}

