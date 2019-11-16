package com.atguigu.java2;

/*
 	多态的使用场景 ： 1.经常会将方法的中的形参类型写成父类的类型。那么就可以传该类的子类的对象。
 */
public class PhoneTest {

	public static void main(String[] args) {
		/*
		IPhone ip = new IPhone();
		ip.sendMessage();
		ip.call();
		
		IPhone ip2 = new IPhone();
		ip2.sendMessage();
		ip2.call();
		
		IPhone ip3 = new IPhone();
		ip3.sendMessage();
		ip3.call();
		*/
		
		PhoneTest pt = new PhoneTest();
		
		pt.test(new IPhone());
		pt.test(new IPhone());
		pt.test(new IPhone());
		pt.test(new AndroidPhone());
		pt.test(new AndroidPhone());
		pt.test(new AndroidPhone());
		
	}
	
	
	public void test(Phone ap){//Phone ap = new AndroidPhone(); 多态
		ap.sendMessage();
		ap.call();
		//----------1000个方法
		
		//调用子类独有的方法
		if(ap instanceof AndroidPhone){
			AndroidPhone  ap2 = (AndroidPhone) ap;
			ap2.demo();
		}
	}
	
	/*
	public void androidTest(AndroidPhone ap){
		ap.sendMessage();
		ap.call();
		//----------1000个方法
	}
	
	public void iphoneTest(IPhone ap){
		ap.sendMessage();
		ap.call();
		//----------1000个方法
	}
	*/
}

//子类
class IPhone extends Phone{
	public void sendMessage(){
		System.out.println("苹果电话发信息了");
	}
	
	public void call(){
		System.out.println("苹果电话正在通话中");
	}
}

//子类
class AndroidPhone extends Phone{
	public void sendMessage(){
		System.out.println("android电话发信息了");
	}
	
	public void call(){
		System.out.println("android电话正在通话中");
	}
	
	public void demo(){
		System.out.println("androidphone demo");
	}
}

//父类
class Phone{
	
	public void sendMessage(){
		System.out.println("sendMessage");
	}
	
	public void call(){
		System.out.println("call");
	}
}
