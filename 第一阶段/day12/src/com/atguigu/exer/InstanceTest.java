package com.atguigu.exer;

/*
 * 注意 ：	 A类的对象instanceof A和A的父类 全是true
 * 		 A类的对象 instanceof A类的子类全是false
 * 
 * 如果需要通过if-else if的形式判断对象的类型，那么小（子类）的放上面，大（父类）的放下面。
 */


class Person {
	protected String name="person";
	protected int age=50;
	public String getInfo() {
	          return "Name: "+ name + "\n" +"age: "+ age;
	}
}
class Student extends Person {
	protected String school="pku";
	@Override
	public String getInfo() {
  	          return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school;
	}	
}
class Graduate extends Student{
	public String major="IT";
	@Override
	public String getInfo()
	{
		return  "Name: "+ name + "\nage: "+ age 
	          + "\nschool: "+ school+"\nmajor:"+major;
	}
}

/*
 * 建立InstanceTest 类，在类中定义方法method(Person e);
在method中:
(1)根据e的类型调用相应类的getInfo()方法。


 */
public class InstanceTest {

	public static void main(String[] args) {
		
		InstanceTest test = new InstanceTest();
		
		Person p = new Person(); //本态
		Person s = new Student(); //多态
		
		
		test.method(p); //本态
		System.out.println("-----------------------------------------------");
		test.method(s); //多态
		System.out.println("-----------------------------------------------");
		test.method(new Graduate());
	}
	/*
	 * (2)根据e的类型执行：
如果e为Person类的对象，输出：
“a person”;
如果e为Student类的对象，输出：
“a student”
“a person ” 
如果e为Graduate类的对象，输出： 
“a graduated student”
“a student”
“a person” 
	 */
	
	/*
	 * 注意 ：   A类的对象instanceof A和A的父类 全是true
	 * 		 A类的对象 instanceof A类的子类全是false
	 */
	public void method(Person e){ //传的对象是谁（该对象必须是Person的子类或者是Person）调用的是就是谁的方法
		/*
		if(e instanceof Graduate){
			System.out.println("a graduated student");
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Student){
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Person){
			System.out.println("a person");
		} 
		*/
		
		if(e instanceof Person){
			System.out.println("a person");
		}
		
		if(e instanceof Student){
			System.out.println("a student");
		}
		
		if(e instanceof Graduate){
			System.out.println("a graduated student");
		}
	}
	/*
	public void method(Person e){ //传的对象是谁（该对象必须是Person的子类或者是Person）调用的是就是谁的方法
		System.out.println(e.getInfo());
	}
	*/
}






