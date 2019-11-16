package com.atguigu.exer3;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * 写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、
		 * 年利率4.5%的Account对象。使用withdraw方法提款30000元，并打印余额。
再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。

		 */
		Account account = new Account(1122, 20000, 0.045);
		account.withdraw(30000);
		System.out.println("账户余额:" + account.getBalance()); //获取余额
		
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("账户余额:" + account.getBalance());//获取余额
		System.out.println("月利率:" + account.getMonthlyInterest());//获取月利率
		
		System.out.println("---------------------------------------------------------");
		
		/*
		 * 写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、
		 * 年利率4.5%，可透支限额为5000元的CheckAccount对象。
			使用withdraw方法提款5000元，并打印账户余额和可透支额。
			再使用withdraw方法提款18000元，并打印账户余额和可透支额。
			再使用withdraw方法提款3000元，并打印账户余额和可透支额。

		 */
		CheckAccount ck = new CheckAccount(1122, 20000, 0.045, 5000);
		ck.withdraw(5000);
		System.out.println("账户余额:" + ck.getBalance() + "   可透支额度:" + ck.getOverdraft());
		ck.withdraw(18000);
		System.out.println("账户余额:" + ck.getBalance() + "   可透支额度:" + ck.getOverdraft());
		ck.withdraw(3000);
		System.out.println("账户余额:" + ck.getBalance() + "   可透支额度:" + ck.getOverdraft());
	}
}




















