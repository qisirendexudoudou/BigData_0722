package com.atguigu.exer;

/*
 * 编写一个Employee类，声明为抽象类，
包含如下三个属性：name，id，salary。
提供必要的构造器和抽象方法：work()。
对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
请使用继承的思想，设计CommonEmployee类和Manager类，要求类中提供必要的方法进行属性访问。

 */

class Manager extends Employee{

	double bonus;
	
	public Manager(String name, int id, double salary,double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println(id + ":" + name + "拿着" 
					+ salary+ "的工资和 " + bonus + "奖金吃着火锅唱着歌潇洒的工作");
	}
	
}
class CommonEmployee extends Employee{

	//给属性赋值
	public CommonEmployee(String name, int id, double salary) {
		super(name, id, salary);
	}

	@Override
	public void work() {
		System.out.println(id + ":" + name + "拿着" + salary + "的工资干着非人的工作");
	}
	
}
abstract class Employee{
	String name;
	int id;
	double salary;
	//构造器
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeTest et = new EmployeeTest();
		et.showInfo(new CommonEmployee("强哥", 1, 500));
		System.out.println("---------------------------------------");
		et.showInfo(new Manager("小龙哥", 2, 500000, 1000000));
	}
	
	public void showInfo(Employee employee){
		employee.work();
	}
}
