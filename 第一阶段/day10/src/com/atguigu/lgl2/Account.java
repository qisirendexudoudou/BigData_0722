package com.atguigu.lgl2;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount){
		balance += amount;
		System.out.println("存款成功：存款金额为：" + balance);
	}
	
	public void withdraw(double amount){//取款
		if (amount > balance) {
			System.out.println("余额不足，取款失败");
		} else {
			balance -= amount;
			System.out.println("取款成功：取款金额为：" + balance);
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
