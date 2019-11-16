package com.atguigu.lgl;

/**
 * 编写一个Employee类，声明为抽象类，包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。

 */

public class EmployeeTest {
	public static void main(String[] args) {
		Employee c1 = new CommonEmployee("小许", 1, 5000);
		c1.work();
		System.out.println("-------------");
		
		Employee c2 = new Manager("小罗", 2, 10000, 20000);
		c2.work();
	}
		
}

abstract class Employee {
	String name;
	int id;
	double salary;
	
	public Employee(){
	}
	
	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	abstract public void work();
	
}

class Manager extends Employee{
	
	double bonus;
	public Manager(String name, int id, double salary,double bonus) {
		super(name,id,salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("id = " +id + " name = " + name + "salary = " + salary + " bonus = " + bonus);
	}
		
}

class CommonEmployee extends Employee{
	
	public CommonEmployee(String name, int id, double salary){
		super(name,id,salary);
	}
	@Override
	public void work() {
		System.out.println("id = " +id + " name = " + name + " salary = " + salary);
	}
	
}