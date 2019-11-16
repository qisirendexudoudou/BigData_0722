package com.atguigu.exer2;

/*
 
 	快捷键 ：alt + shift + s 生成set/get方法
 	
 */
public class Boy {

	private String name;
	private int age;


	public Boy() {

	}
	
	
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * +marry(girl:Girl)
		+shout():void
	 */
	public void marry(Girl girl){
		System.out.println(this.name + ":" + girl.getName() + "好啊好啊我好开心哦");
		this.shout();
	}
	
	public void shout(){
		System.out.println("今晚你要嫁给我");
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
