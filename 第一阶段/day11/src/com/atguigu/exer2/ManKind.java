package com.atguigu.exer2;

public class ManKind {

	/*
	 *  2. (1)定义一个ManKind类，包括
成员变量int sex和int salary；
方法void manOrWoman()：根据sex的值显示“man”(sex==1)或者“woman”(sex==0)；
方法void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。

	 */
	int sex;
	int salary;
	
	public void manOrWoman(){
		if(sex == 0){
			System.out.println("woman");
		}else if(sex == 1){
			System.out.println("man");
		}
	}
	
	public void employeed(){
		if (salary == 0) {
			System.out.println("no job");
		} else {
			System.out.println("job");
		}
	}
}
