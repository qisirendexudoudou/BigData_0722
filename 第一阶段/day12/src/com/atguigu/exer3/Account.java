package com.atguigu.exer3;

public class Account {

	private int id;// 账号
	private double balance; // 余额
	private double annualInterestRate; // 年利率

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	/**
	 * 月利率
	 * @return
	 */
	public double getMonthlyInterest() {
		return this.annualInterestRate / 12;
	}

	/**
	 * 取钱
	 * @param amount
	 */
	public void withdraw(double amount) {
		if(amount <= this.balance){
//			this.balance -= amount; //对的

			this.setBalance(this.balance - amount);//对的
			
//			this.getBalance() = this.getBalance() - amount; 不对的
		}else{
			System.out.println("取款失败，余额不足");
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
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
