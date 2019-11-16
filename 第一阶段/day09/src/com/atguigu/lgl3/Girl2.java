package com.atguigu.lgl3;

public class Girl2 {

	
	private String name;
	private int age;
	
	public void marry(Boy2 boy){
		if (boy.getAge() < 18) {
			System.out.println(this.name + ": " +boy.getName()+" ,你太小了，不合适！");
		} else if(boy.getAge() < 30){
			System.out.println(this.name + ": " +boy.getName()+" ,我觉得你刚刚好！");
		}else
			System.out.println("好啊好啊");		
	}
	
	public void compare(Girl2 girl){
		if (this.age < girl.getAge()) {
			System.out.println(this.name+  "好！");
		} else if(this.age > girl.getAge()){
			System.out.println(girl.getName()+  "好！");
		}else
			System.out.println(this.name + " 和 "+ girl.getName() + "一样好！" );
	}
	
	
	public Girl2(String name, int age) {
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
