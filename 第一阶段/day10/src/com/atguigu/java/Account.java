package com.atguigu.java;

/*
 * 快捷键 ： ctrl + d :删除一整行
 */

public class Account {

	private double balance;// 余额

	public Account(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) {// 取钱
		if(amount > balance){
			System.out.println("余额不足");
		}else{
			balance -= amount;
			System.out.println("成功取出:" + amount);
		}
	}

	public void deposit(double amount) {// 存钱
		balance += amount;
		System.out.println("成功存入:" + amount);
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
