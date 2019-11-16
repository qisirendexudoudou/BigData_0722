package com.atguigu.lgl1;

/*写一个名为Account的类模拟账户。
该类的属性和方法如下图所示。
该类包括的属性：账号id，余额balance，年利率annualInterestRate；
包含的方法：
	访问器方法（getter和setter方法），
	取款方法withdraw()，
	存款方法deposit()。
提示：在提款方法withdraw中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。*/

public class Account {

	private int id;//账户Id
	private double balance;//余额
	private double annualInterestRate;//利率
	
	//取钱
	public void withdraw(double amount){
		if (amount > balance) {
			System.out.println("余额不足,余额为  " + balance);
			
		} else {
			balance -= amount;
			System.out.println("成功取出：" + amount);
		}	
		
	}
	
	//存钱
	public void deposit(double amount){
		balance += amount;
		System.out.println("成功存入：" + amount);
	}
	

	
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
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


