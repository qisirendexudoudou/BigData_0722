package com.atguigu.lgl5;

public class Account {

	protected int id;
	protected double balance;
	protected double annualInterestRate;
	
	public Account(){
		
	}

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	
	public void deposit(double amount){
		balance += amount;
		System.out.print("存款成功：存款金额为：" + amount);
		System.out.print(" 存款后余额为：" + balance);
		System.out.println(" 利率为 ：" + annualInterestRate * 100 + "%");
	}
	
	public void withdraw(double amount){//取款
		if (amount > balance) {
			System.out.print("余额不足，取款失败");
			System.out.println(" 您的账户余额为 ： " + balance);
		} else {
			balance -= amount;
			System.out.print("取款成功：取款金额为：" + amount);
			System.out.print(" 取款后余额为：" + balance);
			System.out.println(" 利率为 ：" + annualInterestRate * 100 + "%");
		}
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
}