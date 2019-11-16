package com.atguigu.lgl2;

public class CustomerView {
	private CustomerList list = new CustomerList(10);
	
	public CustomerView(){
		Customer customer = new Customer("小罗", '男', 12, "12345654", "657334940@qq.com");
		list.addCustomer(customer);
	}
	
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
			System.out.println("				 1 添 加 客 户");
			System.out.println("				 2 修 改 客 户");
			System.out.println("				 3 删 除 客 户");
			System.out.println("				 4 客 户 列 表");
			System.out.println("				 5 退           出");
			System.out.print("请选择(1-5)：");
			
			char selection = CMUtility.readMenuSelection();
			switch (selection) {
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
				char readConfirmSelection = CMUtility.readConfirmSelection();
				if (readConfirmSelection == 'Y') {
					flag = false;
					System.out.println("成功退出");
				}else{
					break;
				}
			}
		} while (flag);	
	} 
	
	private void addNewCustomer(){
		
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名:");
		String name = CMUtility.readString(20);
		System.out.print("性别:");
		char gender = CMUtility.readChar();
		System.out.print("年龄:");
		int age = CMUtility.readInt();
		System.out.print("电话:");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱:");
		String email = CMUtility.readString(30);
		
		//封装对象
		Customer customer = new Customer(name, gender, age, phone, email);
		//添加至数组中
		boolean addCustomer = list.addCustomer(customer);
		if (addCustomer) {
			System.out.println("---------------------添加成功---------------------");
		}else
			System.out.println("---------------------添加失败---------------------");
	} 
	
	
	private void modifyCustomer(){
		
		Customer customer = null;
		boolean flag = true;
		int id = 0;
		
		System.out.println("---------------------修改客户---------------------");
		while (flag) {
			System.out.print("请选择待修改客户编号(-1退出)：");
			id = CMUtility.readInt();
			if (id == -1) {
				return;
			}
			
			//判断用户是否存在
			customer = list.getCustomer(id-1);
			if (customer == null) {
				System.out.println("找不到该用户");
			}else{
				flag = false;
			}		
		}

			System.out.print("姓名(" + customer.getName()+"):");
			String name = CMUtility.readString(12, customer.getName());
			System.out.print("性别("+customer.getGender()+"):");
			char gender = CMUtility.readChar(customer.getGender());
			System.out.print("年龄("+customer.getAge()+"):");
			int age = CMUtility.readInt(customer.getAge());
			System.out.print("电话("+customer.getPhone()+"):");
			String phone = CMUtility.readString(11, customer.getPhone());
			System.out.print("邮箱("+customer.getEmail() +"):");
			String email = CMUtility.readString(30, customer.getEmail());
			
			//封装对象
			Customer customer2 = new Customer(name, gender, age, phone, email);
			
			//判断是否修改成功
			boolean result = list.replaceCustomer(id -1,customer2);
			if (result) {
				System.out.println("---------------------替换成功---------------------");
			}else{
				System.out.println("---------------------替换失败---------------------");
			}		
	}
	
	private void deleteCustomer(){
			
			boolean flag = true;
			int id = 0 ;
		
			System.out.println("---------------------删除客户---------------------");
			
			while (flag) {
				System.out.print("请选择待删除客户编号(-1退出)：");
				id = CMUtility.readInt();
				if (id == -1) {
					return;
				}
				
				//查找用户是否存在
				Customer customer = list.getCustomer(id-1);
				if (customer == null) {
					System.out.println("用户不存在");
				}else
					break;
			}
				
			System.out.print("确认是否删除(Y/N):");
			char readConfirmSelection = CMUtility.readConfirmSelection();
			if (readConfirmSelection == 'Y') {
				boolean deleteCustomer = list.deleteCustomer(id-1);
				if (deleteCustomer) {
					System.out.println("---------------------删除成功---------------------");
				}else
					System.out.println("---------------------删除失败---------------------");
			}	
	}
	
	private void listAllCustomers(){
		
			System.out.println("---------------------------客户列表---------------------------");
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
				
			Customer[] customers = list.getAllCustomers();
			if (customers.length > 0 ) {
				for (int i = 0; i < customers.length; i++) {
					//遍历每个对象
					 Customer customer = customers[i];
					 
					 System.out.println(i+1 + 
							 "\t" + customer.getName()+
							 "\t" + customer.getGender() + 
							 "\t" + customer.getAge() +
							 "\t" + customer.getPhone() + 
							 "\t" + customer.getEmail());
				}
			}else{
				System.out.println("暂时没有用户");
			}
			System.out.println("--------------------------客户列表完成-------------------------");
	}
	
	public static void main(String[] args){
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}

}
