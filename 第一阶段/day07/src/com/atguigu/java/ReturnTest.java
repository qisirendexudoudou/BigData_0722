package com.atguigu.java;

/*
 	return关键字
 	
 	使用范围 ：在方法中
 	
 	作用　：
 		1.在没有返回值的方法中，用来结束当前方法
 		2.在有返回值的方法中，用来返回数据。同时结束当前方法。
 */
public class ReturnTest {

	public static void main(String[] args) {
		
		ReturnTest rt = new ReturnTest();
		rt.test();
	}
	
	public void test(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 3){
//				break;
				return; //用来结束当前的方法
			}
		}
		System.out.println("程序结束");
	}
	
	public int getAge(){
		boolean boo = true;
		
		if(boo){
			return 10;
//			System.out.println("cccc");return后面不能再跟其它语句
		}else{
			return 20;
		}
		
		/*
		if(boo){
			return 10;
		}
		return 20;
		
		
		System.out.println("--------------------------------");
		
		if(boo){
			System.out.println("10");
		}else{
			System.out.println("20");
		}
		
		//和上面的写法完全不一样
		if(boo){
			System.out.println("10");
		}
		System.out.println("20");
		*/
		
	}
}
