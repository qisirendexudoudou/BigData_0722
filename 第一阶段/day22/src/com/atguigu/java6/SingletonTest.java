package com.atguigu.java6;

/*
 	懒汉式（线程安全的）
 */
public class SingletonTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			new Thread(){
				public void run() {
					System.out.println(Bank.getInstance());
				}
			}.start();
		}
	}
}

class Bank{
	
	private Bank(){}
	
	private static Bank bank = null;
	
	public static Bank getInstance(){
		
		if(bank == null){ //可以提高效率
			synchronized (Bank.class) {
				if(bank == null){
					bank = new Bank();
				}
			}
		}	
		return bank;
	}
}
