package com.atguigu.demo;

public class CustomerList {

	/*
	 * Customer[] customers：用来保存客户对象的数组
		int total = 0                 ：记录已保存客户对象的数量

	 */
	private Customer[] customers; //用来保存客户对象的数组
	private int total; //记录已保存客户对象的数量
	
	/*
	 * 作用：初始化数组
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer]; //给数组设置长度 
	}
	
	/**
	 * 添加用户
	 * @param customer 需要添加的用户
	 * @return 如果添加成功返回true否则返回false
	 */
	public boolean addCustomer(Customer customer){
		//校验
		if(customer == null){
			return false;
		}
		//当数组填满时就不能再存放用户了
		if(total >= customers.length){
			return false;
		}
		customers[total++] = customer;
		return true;
	}

	/**
	 * 修改客户
	 * @param index 被修改客户的索引值
	 * @param cust 新的用户
	 * @return 修改成功返回true 修改失败返回false
	 */
	public boolean replaceCustomer(int index, Customer cust){
		//校验
		if(index < 0 || index >= total){
			return false;
		}
		
		if(cust == null){
			return false;
		}
		
		customers[index] = cust;
		return true;
		
	}
	
	/**
	 * 删除用户
	 * @param index 根据索引值删除用户
	 * @return
	 */
	public boolean deleteCustomer(int index){
		//校验 
		if(index < 0 || index >= total){
			return false;
		}
		
		for(int i = index; i < total - 1; i++){
			customers[i] = customers[i + 1];
		}
		
		/*
		//最后一个元素改成null
		customers[total - 1] = null;
		//总人数减去1
		total--;
		*/
		
		customers[--total] = null;
		return true;
	}
	
	/**
	 * 获取所有的用户
	 * @return 所有用户的数组
	 */
	public Customer[] getAllCustomers(){
		//创建一个数组，有多少个用户就创建多长
		Customer[] c = new Customer[total];
		for (int i = 0; i < total; i++) {
			c[i] = customers[i];
		}
		return c;
	} 
	
	/**
	 * 获取指定的用户
	 * @param index  根据index获取指定的用户 
	 * @return
	 */
	public Customer getCustomer(int index){
		//校验 
		if(index < 0 || index >= total){
			return null;
		}
		
		return customers[index];
	}

}
