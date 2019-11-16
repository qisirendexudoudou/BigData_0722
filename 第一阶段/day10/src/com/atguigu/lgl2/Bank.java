package com.atguigu.lgl2;

public class Bank {

	private Customer[] customers;
	/**
	 * 1.记录用户的数量
	 * 2.用来表示数组的索引值
	 */
	private int NumberOfCustomer;
	
	//构造器
	public Bank() {
		customers = new Customer[1];
	}
	
	public void addCustomer(String f,String l){
		//校验当前用户是否已满
		if (NumberOfCustomer < customers.length) {
			//创建对象
			Customer customer = new Customer(f, l);
			//对象放置数组中
			customers[NumberOfCustomer] = customer;
			NumberOfCustomer++;		
		} else {
			System.out.println("用户已满，添加失败");
	}
	}
	
		//getNumOfCustomers 方法返回 numberofCustomers 属性值
		public int getNumOfCustomers(){
			return this.NumberOfCustomer;
		}
		
		//getCustomer方法返回与给出的index参数相关的客户。
		public Customer getCustomer(int index){
			return customers[index];
		}
		
		
}

