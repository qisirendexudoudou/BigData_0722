package com.atguigu.demo;

public class CustomerView {

	CustomerList list;

	public CustomerView() {
		list = new CustomerList(10); // 给CustomerList中的数组指定长度
		//默认添加一条数据
		Customer customer = new Customer("小井", '男', 18, "110", "aaa@qq.com");
		list.addCustomer(customer);
	}

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		do {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                 1 添 加 客 户");
			System.out.println("                 2 修 改 客 户");
			System.out.println("                 3 删 除 客 户");
			System.out.println("                 4 客 户 列 表");
			System.out.println("                 5 退       出");
			System.out.print("请选择(1-5)：");
			char menuSelection = CMUtility.readMenuSelection();
			//格式化代码：ctrl + shift + F
			switch (menuSelection) {
			case '1':
				//添加新客户
				addNewCustomer();
				break;
			case '2':
				//修改用户
				modifyCustomer();
				break;
			case '3':
				//删除用户
				deleteCustomer();
				break;
			case '4':
				//展示所有用户
				listAllCustomers();
				break;
			case '5':
				//退出程序
				System.out.print("确认是否退出(Y/N):");
				char confirmSelection = CMUtility.readConfirmSelection();
				if(confirmSelection == 'Y'){
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
			姓名：a
			性别：男
			年龄：16
			电话：155
			邮箱：a@qq.com
			---------------------添加完成---------------------
		 */
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名:");
		String name = CMUtility.readString(10);
		System.out.print("性别:");
		char gender = CMUtility.readChar();
		System.out.print("年龄:"); //快捷键 shift + 回车
		int age = CMUtility.readInt();
		System.out.print("电话:");
		String phone = CMUtility.readString(13);
		System.out.print("邮箱:");
		String email = CMUtility.readString(13);
		
		//将读取的内容进行封装并保存到数组中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isOk = list.addCustomer(customer);
		if(isOk){
			System.out.println("---------------------添加完成---------------------");
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
			请选择待修改客户编号(-1退出)：30
			无法找到指定客户！
			请选择待修改客户编号(-1退出)：100
			输入长度（不大于2）错误，请重新输入：50
			无法找到指定客户！
			请选择待修改客户编号(-1退出)：1
			姓名(小空):
			性别(女):
			年龄(26):
			电话(110):
			邮箱(110@qq.com):
			---------------------修改完成--------------------- 
		 */
		//退出的条件 1.找到用户   2.输入-1
		System.out.println("---------------------修改客户---------------------");
		Customer customer = null;
		int id = 0;
		while(true){
			System.out.print("请选择待修改客户编号(-1退出)：");
			//输入用户id
			id = CMUtility.readInt();
			//如果输入的id是-1结束方法
			if(id == -1){
				return;
			}
			//通过id去找客户，如果找到退出循环，读取数据，如果找不到让用户继续重新输入
			customer = list.getCustomer(id - 1);
			if(customer == null){ //没有找到指定用户
				System.out.println("无法找到指定用户");
			}else{ //找到用户
				break; //找到用户退出循环
			}
		}
		//找到用户后进行的修改操作
		System.out.print("姓名(" + customer.getName() + "):");
		String name = CMUtility.readString(10, customer.getName());
		System.out.print("性别(" + customer.getGender() + "):");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄(" + customer.getAge() + "):");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话(" + customer.getPhone() + "):");
		String phone = CMUtility.readString(12,customer.getPhone());
		System.out.print("邮箱(" + customer.getEmail() + "):");
		String email = CMUtility.readString(12,customer.getEmail());
		//将修改后的用户在数组中进行替换
		boolean replaceCustomer = list.replaceCustomer(id - 1, new Customer(name, gender, age, phone, email));
		if(replaceCustomer){
			System.out.println("---------------------修改完成--------------------- ");
		}else{
			System.out.println("---------------------修改失败--------------------- ");
		}
		
		
	}

	/**
	 * 删除用户
	 */
	private void deleteCustomer() {
		/*
		 * ---------------------删除客户---------------------
			请选择待删除客户编号(-1退出)：20
			无法找到该用户
			请选择待删除客户编号(-1退出)：1
			确认是否删除(Y/N)Y
			---------------------删除完成---------------------
		 */
		System.out.println("---------------------删除客户---------------------");
		int id = 0;
		while(true){
			System.out.print("请选择待删除客户编号(-1退出)：");
			id = CMUtility.readInt();
			//如果id是-1退出
			if(id == -1){
				return;
			}
			
			Customer customer = list.getCustomer(id - 1); //查找用户是否存在
			if(customer == null){
				System.out.println("无法找到该用户");
			}else{
				break;
			}
		}
		System.out.print("确认是否删除(Y/N):");
		char selection = CMUtility.readConfirmSelection();
		if(selection == 'Y'){ //确定删除
			//在数组中进行删除
			boolean deleteCustomer = list.deleteCustomer(id - 1);
			if(deleteCustomer){
				System.out.println("---------------------删除完成---------------------");
			}else{
				System.out.println("---------------------删除失败---------------------");
			}
			
		}else{
			System.out.println("-----------------------------------------------");
		}
	}

	/**
	 * 展示用户
	 */
	private void listAllCustomers() {
		/*
		 * ---------------------------客户列表---------------------------
			编号 	姓名	性别	年龄	电话		邮箱
			1	小空	女	26	110		110@qq.com
			-------------------------客户列表完成-------------------------
		 */
		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		Customer[] allCustomers = list.getAllCustomers();
		
		if(allCustomers.length == 0){//没有用户
			System.out.println("亲！！！您还没有添加用户哦！！！！！");
		}else{
			for (int i = 0; i < allCustomers.length; i++) {
				Customer customer = allCustomers[i];
				System.out.println(i + 1 + "\t" + customer.getName() + "\t"
						+ customer.getGender() + "\t" + customer.getAge() + "\t"
						+ customer.getPhone() + "\t\t" + customer.getEmail());
			}
		}
		System.out.println("--------------------------客户列表完成-------------------------");
		
	}

	public static void main(String[] args) {
		// 进入主菜单
		new CustomerView().enterMainMenu();
	}
}
