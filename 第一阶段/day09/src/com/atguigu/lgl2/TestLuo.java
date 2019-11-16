package com.atguigu.lgl2;

/*
（1）	创建一个Customer ，名字叫 Jane Smith, 
	他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
	存入 100 元，再取出960元。再取出2000元。
	打印出Jane Smith 的基本信息

 */

public class TestLuo {

	public static void main(String[] args) {
		
		//创建用户
		CustomerLuo customerLuo = new CustomerLuo("Jane", "Smith");
		
		//创建账户
		AccountLuo account = new AccountLuo(1000, 2000, 0.0123);
		
		//用户和账号关联
		customerLuo.setAccount(account);
		
		//找到这个用户的账号
		AccountLuo ac1 = customerLuo.getAccount();
		ac1.deposit(100);
		ac1.withdraw(960);
		ac1.withdraw(2000);
		
		System.out.println("Customer ["+customerLuo.getLastName()+", "+customerLuo.getFirstName()+"] has a account: "
				+ "id is "+account.getId()+", annualInterestRate is "+account.getAnnualInterestRate()*100 +"％, "
						+ "balance is "+ account.getBalance());
		
		
	}
}
