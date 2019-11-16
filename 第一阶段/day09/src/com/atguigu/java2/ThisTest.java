package com.atguigu.java2;

/**
	
	this关键字 ： 表示当前对象
	
	this可以调用属性，方法，构造器。
	
	this调用属性和方法：
		在方法中和构造器中。当我们调用当前对象的属性和方法时，往往我们都会省略掉"this."。
		但是如果局部变量名和属性名相同时，“this.”不能省略。因为需要使用"this."来区分局部变量和属性。
		我们会通过使用“this.”来表明调用的是当前对象的属性。
	
	this调用构造器：（详见ThisTest3.java）
		格式 ：this(形参列表)
		作用 ：用来调用本类中的其它构造器
		说明：
			1.this(形参列表)只能放在构造器的首行
			2.this(形参列表)在同一个构造器中只能有一个。
			3.一个类如果有N个构造器，那么最多只能有N-1个this(形参列表)
		
 */
class Teacher{
	String name;
	int age;
	char gender = '女';
	
	//构造器
	public Teacher(){
		
	}
	
	//构造器
	public Teacher(String name,int age,char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	/**
	 * 给属性赋值
	 * @param a
	 */
	public void setAge(int age){
		this.age = age;//局部变量 ：就近原则（属性名和局部变量名相同时默认调用的是局部变量）
		System.out.println("===========" + age);
	}
	
	/**
		当局部变量和属性名相同时，必须使用"this."来区分局部变量和属性。
		如果局部变量名和属性名不相同时，属性前可以加"this."也可以不加"this."
			因为属性前默认就有"this."
	 */
	public void setName(String n){
		name = n;
	}
	
	/**
	 * this调用方法
	 * 
	 */
	public void test(){
		System.out.println("test");
		this.demo(); //可以加"this."也可以不加（不加的话默认也会自动添加上"this."）
	}
	
	public void demo(){
		System.out.println("demo");
	}

	
	/**
	 * 显示所有的属性的内容
	 */
	public void show(){
		int s = 20;
		System.out.println(name + " " + age + " " + gender);
	}
	
}
public class ThisTest {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setAge(20);
		t.setName("小泽老师");
		t.show();
		System.out.println("------------------------");
		t.test();
	}
}




