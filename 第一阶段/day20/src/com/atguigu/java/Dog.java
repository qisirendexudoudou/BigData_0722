package com.atguigu.java;

public class Dog implements Comparable {

	String name;
	int age;
	
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	




	@Override
	public String toString() {
		return "(" + name + " " + age + ")";
	}


	@Override
	public int compareTo(Object o) {

		if(o instanceof Dog){
			Dog d = (Dog) o;
			
//			需求 ：安照年纪排序
//			return this.age - d.age; 从小到大
//			return -(this.age - d.age); //从大到小
			
			//需求：安照名字排序（中文不能排序）
//			return  -this.name.compareTo(d.name);

			//需求：如果名字相同则安照年纪排序
			int cName = this.name.compareTo(d.name);
			
			if(cName == 0){//名字相同
				return this.age - d.age;//安年纪排序
			}else{//名字不相同
				return cName;
			}
		}
		
		return 0;//返回值是0说明两个元素是相同的。
	}
}
