package com.atguigu.lgl3;

import org.junit.experimental.theories.Theories;

//懒汉式的单例设计的 线程安全问题
public class SingletonTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new Thread(){
				@Override
				public void run() {
					System.out.println(Bank.getInstance());
				}
			}.start();
		}
	}
}


class Bank {
	private Bank(){}
	private static Bank bank;
	
	public static Bank getInstance(){
		if (bank == null) {
			synchronized (Bank.class) {
				if (bank == null) {
					bank = new Bank();
				}
			}
		}
		return bank;
		}
}