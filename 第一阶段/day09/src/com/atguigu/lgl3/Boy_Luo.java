package com.atguigu.lgl3;


/*
 * +marry(girl:Girl)
	+shout():void
 */
public class Boy_Luo {

	private String name;
	private int age;
	
	
	public void marry(Girl_Luo girl){
		System.out.println(this.getName() + " : " + girl.getName() +", 好啊好啊！");
	}
	
	public Boy_Luo(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
}
