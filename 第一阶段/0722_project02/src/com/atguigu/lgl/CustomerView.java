package com.atguigu.lgl;

public class CustomerView { //CustomerView为主模块，负责菜单的显示和处理用户操作
	
	private CustomerList list = new CustomerList(10);
	
	//默认一条数据
	public CustomerView(){
		Customer customer = new Customer("小罗", '男', 16, "18394932", "758t49@qq.com");
		list.addCustomer(customer);
	}

	/**
	 * 用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理
	 */
	/**
	 * -----------------客户信息管理软件-----------------
                  1 添 加 客 户
                  2 修 改 客 户
                  3 删 除 客 户
                  4 客 户 列 表
                  5 退           出
                  请选择(1-5)：
	 */
	public void enterMainMenu(){
		
		boolean flag = true;
		do {
			
		System.out.println("-----------------客户信息管理软件-----------------");
		System.out.println("                 1 添 加 客 户");
		System.out.println("                 2 修 改 客 户");
		System.out.println("                 3 删 除 客 户");
		System.out.println("                 4 客 户 列 表");
		System.out.println("                 5 退           出");
		System.out.print("请选择(1-5)： ");
		
		//读取用户输入
		char choose = CMUtility.readMenuSelection();
		switch (choose) {
		case '1':
			addNewCustomer();
			break;
		case '2':
			modifyCustomer();
			break;
		case '3':
			deleteCustomer();
			break;
		case '4':
			listAllCustomers();
			break;
		case '5':
			System.out.print("确认是否退出(Y/N):");
			char choose2 = CMUtility.readConfirmSelection();
			if (choose2 == 'Y') {
				flag = false;
				System.out.println("退出成功");
			}else
				break;
		}
		
		}while (flag);	
	} 
	
	
	
	//增加用户
	/**
	 * ---------------------添加客户---------------------
姓名:11
性别:男
年龄:11
电话:12
邮箱:haode
---------------------添加成功---------------------
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名: ");
		String name = CMUtility.readString(12);
		System.out.print("性别: ");
		char gender = CMUtility.readChar();
		System.out.print("年龄: ");
		int age = CMUtility.readInt();
		System.out.print("电话: ");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱: ");
		String email = CMUtility.readString(30);
		
		//创建对象
		 Customer customer = new Customer(name, gender, age, phone, email);
		 
		//添加到数组中
		 boolean result = list.addCustomer(customer);
		 if (result) {
			 System.out.println("---------------------添加成功---------------------");
		 }else
			 System.out.println("---------------------添加失败---------------------");
	}
	
	
	
	//修改用户
	/**
	 * ---------------------修改客户---------------------
请选择待修改客户编号(-1退出)：1
姓名(小龙哥):
性别(男):
年龄(18):
电话(152222222):
邮箱(qq@qq.com):
---------------------替换成功--------------------- 
	 */
	private void modifyCustomer(){
		
		boolean flag = true;
		Customer customer = null;
		int id = 0 ;
		
		while(flag) {
		System.out.println("------------------修改用户---------------------");
		System.out.print("请选择待修改客户编号(-1退出)：");
		id = CMUtility.readInt();
		if (id == -1) {
			return;
		}
		//判断用户是否存在
		customer = list.getCustomer(id - 1 );
		if (customer == null) {
			System.out.println("该用户不存在");
		}else
			flag = false;
		}
		
		System.out.print("姓名("+ customer.getName()+"):");
		String name = CMUtility.readString(12,customer.getName());
		System.out.print("性别("+ customer.getGender()+"):");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄("+customer.getAge() +"):");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话("+ customer.getPhone()+"):");
		String phone = CMUtility.readString(11, customer.getPhone());
		System.out.print("邮箱("+customer.getEmail()+"):");
		String email = CMUtility.readString(30, customer.getEmail());
		
		//创建对象
		Customer customer2 = new Customer(name, gender, age, phone, email);
		
		//添加到数组中
		boolean  result =  list.replaceCustomer(id-1, customer2);
		if (result) {
			System.out.println("---------------------替换成功---------------------");
		}else {
//			System.out.println("---------------------替换失败---------------------");
		}
	}
	
	//删除用户
	/**
	 * ---------------------删除客户---------------------
请选择待删除客户编号(-1退出)：2
确认是否删除(Y/N):n
	 */
	private void deleteCustomer(){
		int id = 0;
		boolean flag = true;
		
		System.out.println("---------------------删除客户---------------------");
		
		while (flag) {
			System.out.print("请选择待删除客户编号(-1退出)：");
			id = CMUtility.readInt();
			if (id == -1) {
				return;
			}
			//判断用户是否存在
			Customer customer = list.getCustomer(id-1);
			if (customer == null) {
				System.out.println("无法找到该用户");
			}else{
				break;
			}
		}
			
			System.out.print("确认是否删除(Y/N): ");
			char result = CMUtility.readConfirmSelection();
			if (result == 'Y') {
				boolean result2 = list.deleteCustomer(id-1);
				if (result2) {
					System.out.println("---------------------删除成功---------------------");
				}else{
					System.out.println("---------------------删除失败---------------------");
				}
			}	
			
	}
	
	//展示用户列表
	/**
	 * ---------------------------客户列表---------------------------
		编号	姓名	性别	年龄	电话		邮箱
		1	小龙哥	男	18	152222222	qq@qq.com
--------------------------客户列表完成-------------------------
	 */
	private void listAllCustomers(){
		System.out.println("---------------------------客户列表---------------------------");
		System.out.print("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		Customer[] customers = list.getAllCustomers();
		if (customers.length > 0 ) {
			for (int i = 0; i < customers.length; i++) {
				Customer customer = customers[i];
				System.out.print( "\n" + (i+1) + 
									"\t" + customer.getName()+
									"\t" + customer.getGender()+
									"\t" + customer.getAge()+
									"\t" + customer.getPhone()+
									"\t" + customer.getEmail());
			}
		} else {
			System.out.println("\n暂时没有用户");
		}
		System.out.println("------------------------------------------------------------");
		
	}
	
	public static void main(String[] args){
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}
	
	
	
	
	
	
	
}
