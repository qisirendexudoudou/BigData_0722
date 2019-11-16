package com.atguigu.lgl;

/*
 		return 关键字 
 */
public class ReturnTest_Luo {
	public static void main(String[] args) {
		return1 num1 = new return1();
		num1.a= 1;
		num1.b =2;
		
		num1.info2();
		System.out.println(num1.add2());
		num1.info4();
	}
	

}

class return1{
	
	int a;
	int b;
	
	public void info2(){
		System.out.println("hello!");
	}
	
	public int add2(){
		return a+b;	
	}
		
	public void info4(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 4) {
				break;
//				return;
			}
		}
		System.out.println("--------------------");
	}
	
	}