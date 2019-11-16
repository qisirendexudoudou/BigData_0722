package com.atguigu.lgl3;

import javax.sound.midi.Soundbank;

//懒汉式单例的线程安全问题
public class SingletonTest2 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			new Thread(){
				@Override
				public void run() {
					System.out.println(Person.getInstance());
				}
			}.start();
		}
	}
}

class Person{
	private Person(){}
	private static Person person;
	public static Person getInstance(){
		
		if (person == null) {
			synchronized (Person.class) {
				if (person == null) {
					person = new Person(); 
				}
			}
		}
		return person;
	}
}
