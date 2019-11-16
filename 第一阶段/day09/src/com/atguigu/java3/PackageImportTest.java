package com.atguigu.java3;





/*
 	关键字package : java为了方便对类进行统一管理和划分所以有了包的概念
 	
 	说明：
 		1.同一个包中的类名不能相同。
 		2.包名 ： com.atguigu.java - com(edu/org - 公司的类型) + 公司名 + 项目名 + 模块名
 		3.每"."一次代表一层目录
 		4.源文件中的package(package com.atguigu.java2)指明该文件中定义的类所在的包
 		5.package必须放在源文件的首行
 		
 	
 	关键字import:
 	
 	说明
		1. 在源文件中使用import显式的导入指定包下的类或接口
		2. 声明在包的声明和类的声明之间。
		3. 如果需要导入多个类或接口，那么就并列显式多个import语句即可
		4. 举例：可以使用java.util.*的方式，一次性导入util包下所有的类或接口。
		5. 如果导入的类或接口是java.lang包下的，或者是当前包下的，则可以省略此import语句。
		6. 如果在代码中使用不同包下的同名的类。那么就需要使用类的全类名的方式指明调用的是哪个类。
		7. 如果已经导入java.a包下的类。那么如果需要使用a包的子包下的类的话，仍然需要导入。
		8. import static组合的使用：调用指定类或接口下的静态的属性或方法

 */


import java.util.*;
import com.atguigu.java.*; //java目录下的类不需要导包
import com.atguigu.java.demo.DD; //java目录下的子目录中的类还是需要导包
import static java.lang.System.out; //几乎不这么做

public class PackageImportTest {

	public static void main(String[] args) {
		
		
		out.println("--------------------------");
		
		//全类名 ： 包括包名在内的类的全名称
		com.atguigu.java.AA aa = new com.atguigu.java.AA();
		com.atguigu.java2.AA aa2 = new com.atguigu.java2.AA();
		
		
		new Scanner(System.in);
		new Date();
		double pi = Math.PI;
		new String("ccc");
		new CC();
		
		new DD();
	}
}


