package com.atguigu.lgl;

public class PhoneTest {
	public static void main(String[] args){
		
	PhoneTest pt = new PhoneTest();
	
	pt.test(new IPhone());
	pt.test(new AndroidPhone());
	
	System.out.println("-----------------------");
	
	Phone ap1 = new IPhone();
	Phone ap2 = new AndroidPhone();
	pt.test(ap1);
	pt.test(ap2);
	

	}
	
	public void test(Phone ap){
		ap.sendMessage();
		ap.call();	
}

}

//子类
class IPhone extends Phone{
	
	public void sendMessage(){
		System.out.println("苹果发消息");
	}
	
	public void call(){
		System.out.println("苹果打电话");
	}
}


//子类
class AndroidPhone extends Phone{
	
	public void sendMessage(){
		System.out.println("安卓发消息");
	}
	
	public void call(){
		System.out.println("安卓打电话");
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