package com.atguigu.lgl5;

/*
写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
使用withdraw方法提款5000元，并打印账户余额和可透支额。
再使用withdraw方法提款18000元，并打印账户余额和可透支额。
再使用withdraw方法提款3000元，并打印账户余额和可透支额。
*/

public class CheckAccount extends Account{
	
	public static void main(String[] args) {
//		CheckAccount checkAccount = new CheckAccount(5000, 1122, 20000, 0.045);	
//		checkAccount.withdraw(5000);
//		checkAccount.withdraw(18000);
//		checkAccount.withdraw(3000);
		
//		checkAccount.withdraw(1100);
//		checkAccount.withdraw(900);
//		checkAccount.withdraw(18000);
//		checkAccount.withdraw(4000);
//		checkAccount.withdraw(1000);
//		checkAccount.withdraw(100);
		
		

		CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);
		System.out.println(checkAccount.getId());
		System.out.println(checkAccount.getBalance());
//		checkAccount.withdraw(5000);
//		checkAccount.withdraw(18000);
//		checkAccount.withdraw(3000);
		
		checkAccount.withdraw(1100);
		checkAccount.withdraw(900);
		checkAccount.withdraw(18000);
		checkAccount.withdraw(4000);
		checkAccount.withdraw(1000);
		checkAccount.withdraw(100);
	}

	private double overdraft;//可透支金额
	
//	public CheckAccount(double overdraft,int id,double balance,double annualInterestRate) {
//		this.overdraft = overdraft;
//		this.id = id;
//		this.balance = balance;
//		this.annualInterestRate = annualInterestRate;
//	}
	
	
	public CheckAccount(int id, double balance, double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}



	//重写取款方法
	public void withdraw(double amount){//取款
		if (amount <= balance) {	
			balance -= amount;
			System.out.println("您的账户余额为：" + balance);
			System.out.println("您的可透支额为:" + overdraft);
		}else{
				if (amount <= balance + overdraft ) {
					overdraft =  balance + overdraft -amount;
					balance = 0;
					System.out.println(" 您的账户余额为：" + balance);
					System.out.println(" 您的可透支额为：" + overdraft);
				}else{
					System.out.println("超过可透支金额");
					System.out.println(" 您的账户余额为：" + balance);
					System.out.println(" 您的可透支额为：" + overdraft);
			} 
		}
		System.out.println();
	}
}
