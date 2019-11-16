package com.atguigu.exer;

/*
 * 有2个账户分别向同一个卡上取钱（10000），每次都取1000
 */

class Account{

	private double balance = 10000;
	
	
	public synchronized boolean withdraw(double amt){
	
		if(amt <= balance){
			balance -= amt;
			System.out.println("余额 ： " + this.balance);
			return true;
		}else{
			System.out.println("余额不足");
			return false;
		}
	}
	
}


public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Thread user1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(account.withdraw(1000)){
					System.out.println(Thread.currentThread().getName() + "取款成功：1000" );
				}
			}
		});
		
		Thread user2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(account.withdraw(1000)){
					System.out.println(Thread.currentThread().getName() + "取款成功：1000" );
				}
			}
		});
		
		user1.start();
		user2.start();
	}
}
