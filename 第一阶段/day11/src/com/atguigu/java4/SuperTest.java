package com.atguigu.java4;

/**
 	//敲一遍
	关键字 ：super
	
	super可以调用父类中的属性，方法，构造器
	
	super调用父类中的属性和方法：
		当子类继承父类以后。我们可以在子类中直接调用父类中的属性和方法（加上或者不加"super."都可以）。
		如果子类和父类中的属性名相同或者子类重写了父类中的方法时。
		那么再调用父类和子类相同名字的的属性或者父类被重写的方法时就必须使用"super."
		
	super调用父类中的构造器：
		格式 ：super(形参列表)
		说明：
			1.super(形参列表)只能放在构造器的首行。
			2.super(形参列表)和this(形参列表)在同一个构造器中只能有其中的一个。
			3.在子类的构造器中如果没有显示的定义this(形参列表)或super(形参列表)，那么默认调用super()
			
	常见的错误：Implicit super constructor SuperClass() is undefined. 
			Must explicitly invoke another constructor
	解决方式 ： 第一种给父类创建一个空参的构造器
			 第二种显示的调用父类中的其它构造器
			 
	总结 ：创建子类对象必调父类构造器（所以大家自定义类时都添加一个空参的构造器）
	
 */
class SuperClass{
	
	String name ="superName";
	int age;
	
	//构造器
	public SuperClass(){
		System.out.println("SuperClass()");
	}
	
	//构造器
	public SuperClass(int a){
		System.out.println("SuperClass(int a)");
	}
	
	public void show(){
		System.out.println("superclass");
	}
}

class SubClass extends SuperClass{
	//属性不能重写
	String name = "subName";
	
	//构造器
	public SubClass(){
		//注意：只能放在构造器的首行
		super(10); //调用的是父类的空参构造器
		System.out.println("SubClass()");
	}
	
	//构造器 - 在子类的构造器中如果没有显示的定义this(形参列表)或super(形参列表)，那么默认调用super()
	public SubClass(int a){
//		super(10);
		System.out.println("SubClass(int a)");
	}
	
	public void demo(){
		/*
		 * 当子类中的属性名和父类中的属性名相同时，如果要调用父类中的该属性。必须加"super."
		 */
		//思考 :name前面省略的是"this."还是"super."? 
		/*
		 * this. : 先从本类找如果找不到再去父类找。
		 * super. : 直接去父类中查找，如果找不到就报错。
		 */
		System.out.println(this.name);
		/*
		 * 当子类重写了父类中的方法时，如果想要调用父类中被重写的方法。那么必须加"super."
		 */
		show();
	}
	
	
	public void test(){
		System.out.println(super.name); //父类中的属性
		System.out.println(name);//本类中的属性
	}
	
	@Override
	public void show(){
//		super.show();//调用父类中的show方法
		System.out.println("subClass");
	}
}




public class SuperTest {

	public static void main(String[] args) {
		
//		SubClass sc = new SubClass();
//		sc.show();
//		sc.test();
//		sc.demo();
		
		System.out.println("---------通过子类有参构造器创建对象---------------------");
		SubClass sc = new SubClass(10);
		
	}
}
