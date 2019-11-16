package com.atguigu.lgl;

public class Account {

	private double balance;
	
	public void withdraw(double amount){// 取钱
		if (amount > balance) {
			System.out.println("余额不足");
		} else {
			balance -= amount;
			System.out.println("成功取出:" + amount);
		}
	}

	public void deposit(double amount) {// 存钱
		balance += amount;
		System.out.println("成功存入:" + amount);
	}
	
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
}
