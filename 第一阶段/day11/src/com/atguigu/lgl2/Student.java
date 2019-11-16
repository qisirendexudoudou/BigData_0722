package com.atguigu.lgl2;

public class Student extends Person {
	
	long number;
	int math;
	int english;
	int computer;
	
	public Student(){
		
	}
	
	public Student(long number, int math, int english, int computer) {
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	
	public double aver(){
		return (this.math+ this.english+ this.computer)/3;
	}
	
	public int max(){
		int maxNumber = (this.math > this.english)?this.math:this.english;
		return (maxNumber > this.computer)?maxNumber:this.computer;
	}
	
	public int min(){
		int minNumber = (this.math < this.english)?this.math:this.english;
		return (minNumber < this.computer)?minNumber:this.computer;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", math=" + math + ", english=" + english + ", computer=" + computer + "]";
	}
	
	
}
