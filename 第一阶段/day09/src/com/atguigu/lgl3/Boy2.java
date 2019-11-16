package com.atguigu.lgl3;

/* 
 	boy:
	 	+marry(girl:Girl)
		+shout():void
		
	girl:
		+marry(boy:Boy) 
		+compare(girl:Girl)
	 
 */
public class Boy2 {

	private String name;
	private int age;
	
	public void marry(Girl2 girl){
		System.out.println(this.name+ ": " + girl.getName()+ " ,我也觉得可以，咱们结婚吧！");
	}
	
	
	public Boy2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
