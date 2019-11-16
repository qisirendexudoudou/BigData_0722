package com.atguigu.lgl;

public class Bank {

	private Customer[] customers;
	private int NumberOfCustomer;
	
	public Bank(){
		customers = new Customer[2];
	}
	
	public void addCustomer(String f,String l){
		//校验：1.当前用户的数量是否已满
		if (this.NumberOfCustomer < customers.length) {
			//创建对象
			Customer customer = new Customer(f, l);
			
			//将对象放到数组
			customers[NumberOfCustomer] = customer;
			NumberOfCustomer++;
		}else
			System.out.println("用户已满，添加失败");

	}
	
	//getNumOfCustomers 方法返回 numberofCustomers 属性值
	//获取用户的数量
	public int getNumOfCustomers(){
		return this.NumberOfCustomer;
	}
	
	//getCustomer方法返回与给出的index参数相关的客户
	public Customer getCustomer(int index){
		//校验索引值是否是在合理的范围之内 ： 合理范围 （ 0 ~ 用户的数量 - 1）
		if (index < 0 || index > NumberOfCustomer -1) {
			return null;
		} else {
			return customers[index];
		}

	}
	
	
	
}
