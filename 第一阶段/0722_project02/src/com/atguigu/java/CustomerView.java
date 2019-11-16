package com.atguigu.java;


/**
 * CustomerView : 用来和用户进行交互，展示数据c
 * 
 * @author Administrator
 *
 */
public class CustomerView {
	// 创建CustomerList的对象
	private CustomerList list = new CustomerList(10);
	
	/**
	 * 构造器
	 */
	public CustomerView(){
		Customer customer = new Customer("小龙哥", '男', 18, "152222222", "qq@qq.com");
		//添加到数组中
		list.addCustomer(customer);
	}

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {
		boolean isFlag = true; // 控制循环
		do {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                  1 添 加 客 户");
			System.out.println("                  2 修 改 客 户");
			System.out.println("                  3 删 除 客 户");
			System.out.println("                  4 客 户 列 表");
			System.out.println("                  5 退           出");
			System.out.print("                  请选择(1-5)：");
			// 读取菜单项
			char menuSelection = CMUtility.readMenuSelection();
			// 判断
			switch (menuSelection) {
			case '1':// 添 加 客 户
				addNewCustomer();
				break;
			case '2'://修 改 客 户
				modifyCustomer();
				break;
			case '3'://删 除 客 户
				deleteCustomer();
				break;
			case '4'://客 户 列 表
				listAllCustomers();
				break;
			case '5'://退           出
				System.out.print("确认是否退出(Y/N):");
				//读取是否退出
				char selection = CMUtility.readConfirmSelection();
				//判断是否退出
				if (selection == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}
		} while (isFlag);
	}

	/**
	 * 添加用户
	 */
	private void addNewCustomer() {
		/*
		 * ---------------------添加客户---------------------
			姓名:aa
			性别:男
			年龄:18
			电话:1521321321
			邮箱:22@qq.com
			---------------------添加完成---------------------
		 */
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名:");
		//1.读取数据
		String name = CMUtility.readString(10);
		System.out.print("性别:");
		//读取数据
		char gender = CMUtility.readChar();
		System.out.print("年龄:");
		//读取数据
		int age = CMUtility.readInt();
		System.out.print("电话:");
		//读取数据
		String phone = CMUtility.readString(11);
		System.out.print("邮箱:");
		//读取数据
		String email = CMUtility.readString(30);
		
		//2.创建(封装)对象
		Customer customer = new Customer(name, gender, age, phone, email);
		//3.添加数据
		boolean addCustomer = list.addCustomer(customer);
		//4.判断是否添加成功
		if (addCustomer) {
			System.out.println("---------------------添加成功---------------------");
		}else{
			System.out.println("---------------------添加失败---------------------");
		}
		
	}

	/**
	 * 修改用户
	 */
	private void modifyCustomer() {
		/*
		 * ---------------------修改客户---------------------
			请选择待修改客户编号(-1退出)：2
			无法找到指定用户
			请选择待修改客户编号(-1退出)：1
			姓名(cc):aa
			性别(男):
			年龄(20):
			电话(1533333333):
			邮箱(cc@qq.com):
			---------------------修改完成--------------------- 
		 */
		System.out.println("---------------------修改客户---------------------");
		boolean isFlag = true; //用来控制循环
		Customer customer = null;//被替换的用户
		int id = 0;//被替换用户的编号
		while(isFlag){
			System.out.print("请选择待修改客户编号(-1退出)：");
			//读取用户输入的编号，如果为-1则退出
			id = CMUtility.readInt();
			if(id == -1){
				return; //结束方法
			}
			//如果不为-1就查找该用户是否存在
			customer = list.getCustomer(id - 1); //id是从1开始的，传的是索引值
//			System.out.println(customer);
			//如果customer为null则没有找到该用户
			if (customer == null) {
				System.out.println("无法找到指定用户");
			}else{
				//是否修改原来的内容
				isFlag = false;
			}
		}
		//下面还有代码
		/*
		 *  姓名(cc):
			性别(男):
			年龄(20):
			电话(1533333333):
			邮箱(cc@qq.com):
		 */
		System.out.print("姓名(" + customer.getName() + "):");
		//读取数据 : 如果没有输入内容那么读取默认值，如果输入了内容就读取输入的内容
		String name = CMUtility.readString(13,customer.getName());
		System.out.print("性别(" + customer.getGender() + "):");
		//读取数据 ：如果没有输入内容那么读取默认值，如果输入了内容就读取输入的内容
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄(" + customer.getAge()+ "):");
		//读取数据 ：如果没有输入内容那么读取默认值，如果输入了内容就读取输入的内容
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话(" + customer.getPhone()+ "):");
		//读取数据 ：如果没有输入内容那么读取默认值，如果输入了内容就读取输入的内容
		String phone = CMUtility.readString(11,customer.getPhone());
		System.out.print("邮箱(" + customer.getEmail()+ "):");
		////读取数据 ：如果没有输入内容那么读取默认值，如果输入了内容就读取输入的内容
		String email = CMUtility.readString(30,customer.getEmail());
		
		//2.封装对象
		Customer cust = new Customer(name, gender, age, phone, email);
		//3.替换原来的对象
		boolean replaceCustomer = list.replaceCustomer(id - 1 , cust);
		//4.判断是否替换成功
		if (replaceCustomer) {
			System.out.println("---------------------替换成功--------------------- ");
		} else {
			System.out.println("---------------------替换失败--------------------- ");
		}
	}

	/**
	 * 删除用户
	 */
	private void deleteCustomer() {
		/*
		 * ---------------------删除客户---------------------
请选择待删除客户编号(-1退出)：6
无法找到该用户
请选择待删除客户编号(-1退出)：1
确认是否删除(Y/N):Y
---------------------删除完成---------------------
		 */
		System.out.println("---------------------删除客户---------------------");
		boolean isFlag = true; //控制循环结构
		int id = 0; //被删除用户的编号
		while(isFlag){
			System.out.print("请选择待删除客户编号(-1退出)：");
			//读取用户编号，如果为-1则退出
			id = CMUtility.readInt();
			//判断id是否为-1
			if (id == -1) {
				return;
			} 
			//如果id不为-1则查找该用户是否存在
			Customer customer = list.getCustomer(id - 1);
			//判断customer是否为null如果为null则没有找到该用户
			if (customer == null) {
				System.out.println("无法找到该用户");
			}else{
				break;
			}
		}
		//提示是否删除该用户
		System.out.print("确认是否删除(Y/N):");
		//读取是否删除
		char selection = CMUtility.readConfirmSelection();
		//判断是否删除
		if (selection == 'Y') {
			//确定要删
			boolean deleteCustomer = list.deleteCustomer(id - 1);
			if (deleteCustomer) {
				System.out.println("---------------------删除成功---------------------");
			} else {
				System.out.println("---------------------删除失败---------------------");
			}
		}
		
	}

	/**
	 * 展示所有的用户
	 */
	private void listAllCustomers() {
		/*
		 * ---------------------------客户列表---------------------------
			编号	姓名	性别	年龄	电话		邮箱
			1	小井	男	20	1333333333		aaa@qq.com
			2	aa	男	18	15222222222		qq@qq.com
			3	aa	男	18	1521321321		22@qq.com
			--------------------------客户列表完成-------------------------
		 */
		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		//1.获取所有的用户
		Customer[] customers = list.getAllCustomers();
		if(customers.length > 0){
			//2.遍历
			for (int i = 0; i < customers.length; i++) {
				//获取每一个用户
				Customer customer = customers[i];
				//输出用户的信息
				System.out.println(i + 1 + 
						"\t" + customer.getName() + 
						"\t" + customer.getGender() + 
						"\t" + customer.getAge() + 
						"\t" + customer.getPhone() + 
						"\t" + customer.getEmail()
				);
			}
		}else{
			System.out.println("亲！！！您还没有添加用户哦！！！！！");
		}
		System.out.println("--------------------------客户列表完成-------------------------");
	}

	/**
	 * 程序的入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 进入主菜单
		new CustomerView().enterMainMenu();
	}

}
