package com.atguigu.lgl;


/*
	说明：
		1.父类中被重写的方法没有throws,那么子类重写的方法也不能throws
		2.子类重写的方法抛出的异常不大于父类被重写方法抛出的异常
*/
public class ThrowsTest2 {

}


class SuperClass{
	public void demo() throws Exception{
		
	}
}

class SubClass extends SuperClass{
	public void demo() throws MyException{
		
	}
}