package com.atguigu.exer2;

public class Girl {

	private String name;
	private int age;

	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * +marry(boy:Boy) +compare(girl:Girl)
	 * 
	 */
	public void marry(Boy boy) {
		if (boy.getAge() < 18) {
			System.out.println(this.name + ":小屁孩 一边去耍");
		} else if(boy.getAge() < 30) {
			System.out.println(this.name + ":" + boy.getName() + "我们还是先恋爱吧");
		}else{
			System.out.println(this.name + " :好的我今晚就嫁给你" + boy.getName());
			boy.marry(this);
		}
	}

	/**
	 * 比较的方法 ： 
	 * @param girl
	 */
	public void compare(Girl girl) {
		if (this.age < girl.getAge()) {
			System.out.println(this.name + "比" + girl.getName() + "漂亮");
		} else if(this.age  > girl.getAge()) {
			System.out.println(girl.getName() + "比" + this.getName() + "漂亮");
		}else{
			System.out.println(this.name + "和" + girl.name + "都漂亮我都想要");
		}
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
