package com.atguigu.lgl3;

/*
 * +marry(boy:Boy) 
 * +compare(girl:Girl)
 */
public class Girl_Luo {

	private String name;
	private int age;
	
	public void compare(Girl_Luo girl){
		if (this.getAge() > girl.getAge()) {
			System.out.println(girl.getName() + "比" + this.getName() + "更重要！ ");
		} else if(this.getAge() == girl.getAge()){
			System.out.println(girl.getName() + "和" + this.getName() + "一样重要！ ");
		}else
			System.out.println(this.getName() + "比" + girl.getName() + "更重要！");
			
	}
	
	public void marry(Boy_Luo boy){
		if (boy.getAge() < 18) {
			System.out.println(this.name + ": 你太小了，不合适！");
		} else if(boy.getAge() < 25){
			System.out.println(this.name + ": 嗯,还行，我们先试着谈谈！");
		}else
			System.out.println(this.name + ": " + boy.getName() + ", 我要嫁给你！");
	}
	
	public Girl_Luo(String name, int age) {
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
