package com.atguigu.java;

/**
 * 1.用来保存数据。
 * 2.对数组中的数据进行  增，删，改，查等操作。
 * @author Administrator
 *
 */
public class CustomerList {

	private Customer[] customers;//用来保存数据
	/*
	 * 1.用来存放数据的索引值
	 * 2.当前用户的数量
	 */
	private int total = 0; //用来记录当前用户的数量
	
	/**
	 * 构造器 ： 初始化数组
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	/**
	 * 添加用户
	 * @param customer  需要添加的用户
	 * @return boolean 如果为true添加成功，如果为false则添加失败
	 */
	public boolean addCustomer(Customer customer) {
		//校验  ： 1.当前用户是否已满   2.customer是否为null
		if(total >= customers.length){
			return false;
		}
		if(customer == null){
			return false;
		}
		customers[total] = customer;
		total++;
		return true;
	}
	/**
	 * 修改用户
	 * @param index 被修改用户的索引值
	 * @param cust  需要替换的新用户
	 * @return boolean 如果为true修改成功，如果为false则修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust){
		//校验 ： 1.索引值的合理范围   2.cust是否为null
		//索引值范围 ： 0 ~ total -1 (index >= 0 && index < total)
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
	 * @param index 被删除的用户的索引值
	 * @return boolean 如果为true删除成功，如果为false则删除失败
	 */
	public boolean deleteCustomer(int index){
		
		//校验：1.索引值是否在合理范围之内
		if(index < 0 || index >= total){
			return false;
		}
		
		for(int i = index; i < total - 1; i++){
			customers[i] = customers[i + 1];
		}
		//将最后一个元素变为null
		customers[total - 1] = null;
		//总人数减去1
		total--;
		
//		customers[--total] = null;  和上面的写法是一样的
		return true;
	}
	/**
	 * 获取所有的用户
	 * @return Customer[] 该数组中存放了所有的用户
	 */
	public Customer[] getAllCustomers() {
		//创建一个新的数组
		Customer[] cs = new Customer[total];
		//将原数组中所有的数据（不包括null）放入到新的数组中
		for (int i = 0; i < total; i++) {
			cs[i] = customers[i];
		}
		return cs;
	}
	/**
	 * 获取指定的用户
	 * @param index 需要获取的用户的索引值
	 * @return Customer 获取的用户
	 */
	public Customer getCustomer(int index) {
		//校验：1.索引值是否在合理范围之内 - 如果不校验有可能发生ArrayIndexOutOfBoundsException
		if(index < 0 || index >= total){
			return null;
		}
		return customers[index];
	}

}
