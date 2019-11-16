package com.atguigu.java;

public class Bank {

	private Customer[] customers; //用来存放客户
	/*
	 * 1.用来统计当前用户的数量
	 * 2.向数组中添加数据的索引位置
	 */
	private int nummberOfCustomer; 
	
	
	
	
	/**
	 * 1.初始化数组
	 */
	public Bank(){
		customers = new Customer[2];
	}
	
	/**
	 * 添加用户
	 * @param firstName （形参）  姓
	 * @param lastName  名
	 */
	public void addCustomer(String firstName,String lastName){
		
		//校验：1.当前用户的数量是否已满
		if(this.nummberOfCustomer < customers.length){
		
			//1.创建对象
			Customer customer = new Customer(firstName, lastName);
			//2.将对象放到数组中
			/*
			customers[nummberOfCustomer] = customer;
			nummberOfCustomer++;
			*/
			customers[this.nummberOfCustomer++] = customer;
		}else{
			System.out.println("用户已满添加失败");
		}
	}
	
	/**
	 * 获取用户的数量
	 * @return （返回值） int
	 */
	public int getNumOfCustomers(){
		return this.nummberOfCustomer;
	}
	
	/**
	 * 根据索引值获取对应的用户
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index){
		//校验索引值是否是在合理的范围之内 ： 合理范围 （ 0 ~ 用户的数量 - 1）
		if(index >= 0 && index < this.nummberOfCustomer){
			return customers[index];
		}else{
			//不在合理范围之内 ： 1.返回null  2.抛异常   .....
			return null;
		}
	}
}

















