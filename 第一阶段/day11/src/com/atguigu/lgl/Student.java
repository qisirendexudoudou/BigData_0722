package com.atguigu.lgl;

public class Student extends Person{

	long number;
	int math;
	int english;
	int computer;
	
	public Student(){
		
	}
	
	public Student(long number, int math, int english, int computer) {
		super();
		this.number = number;
		this.math = math;
		this.english = english;
		this.computer = computer;
	}
	
	public double aver(){
		return (this.math + this.english + this.computer) / 3;
	}
	
	public double max(){
		double maxNum = (this.english > this.math)?this.english:this.math;
		return (maxNum > this.computer)? maxNum:this.computer;
	}
	
	public double min(){
		double minNum = (this.english < this.math)?this.english:this.math;
		return (minNum < this.computer)? minNum:this.computer;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getComputer() {
		return computer;
	}

	public void setComputer(int computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", math=" + math + ", english=" + english + ", computer=" + computer + "]";
	}

	
}
