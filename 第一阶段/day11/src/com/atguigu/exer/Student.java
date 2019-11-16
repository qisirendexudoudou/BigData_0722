package com.atguigu.exer;

/*
 * number:long
int:math
int:english
int:computer

 */
public class Student extends Person{

	private long number;
	private int math;
	private int english;
	private int computer;
	
	
	public Student() {
		
	}


	public Student(long number, int math, int english, int computer) {
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	
	/*
	+aver():double
	+max():int
	+min():int
	+toString():String
	*/
	
	public double aver(){
		return (this.math + this.computer + this.english) / 3;
	}
	
	public int max(){
		int maxNumber = (this.math > this.computer) ? this.math : this.computer;
		return (maxNumber > this.english)? maxNumber : this.english;
	}
	
	public int min(){
		int maxNumber = (this.math < this.computer) ? this.math : this.computer;
		return (maxNumber < this.english)? maxNumber : this.english;
	}

	/*
		子类和父类中的方法相同时
	 */
	public String toString(){
		return this.name +" " + this.age + " " + this.computer + " " + this.english + " " + this.math;
	}
	
}
