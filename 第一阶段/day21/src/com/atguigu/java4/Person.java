package com.atguigu.java4;

import java.io.Serializable;

/**
	实现序列化的步骤
	1.需要被序列化对象所在的类必须实现Serializable
	2.提供一个serialVersionUID,也可以使用系统默认提供的（但是不建议）
	3.需要被序列化对象所在的类中的属性（引用数据类型）必须也实现Serializable接口
	
	
	注意： transient和static 修饰的属性不能序列化
 */
public class Person implements Serializable{

	/**
	 * 可不不提供，系统会默认给一个serialVersionUID
	 * 
	 * 注意：当我们使用的是系统提供的serialVersionUID进行序列化后，一旦类中发生了改变（多个属性等一些操作）。
	 * 再反序列化的时候就会失败（原因是因为类一旦发生改变系统提供的serialVersionUID就会发生改变）。
	 * 如果使用的是显示提供的serialVersionUID即使类发生了改变反序列化也会成功（因为serialVersionUID是一致的）。
	 */
	private static final long serialVersionUID = 2236347106593252509L;
	
	
	String name;
//	transient int age; //transient和static 修饰的属性不能序列化
	int age; 
//	int score;
	Address address;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}



	
}

class Address implements Serializable{
	int id;
	String street;
	String nation;
	
	
	public Address(int id, String street, String nation) {
		super();
		this.id = id;
		this.street = street;
		this.nation = nation;
	}


	@Override
	public String toString() {
		return "[id=" + id + ", street=" + street + ", nation=" + nation + "]";
	}
	
	
	
	
}
