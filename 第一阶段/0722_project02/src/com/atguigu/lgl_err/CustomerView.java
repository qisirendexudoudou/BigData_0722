package com.atguigu.lgl_err;

/*
customerView为主模块，负责菜单的显示和处理用户操作
本类封装以下信息：
	CustomerList customers = new CustomerList(10);
创建最大包含10客户对象的CustomerList 对象，供以下各成员方法使用。
该类至少提供以下方法：
		public void enterMainMenu() 
		private void addNewCustomer() 
		private void modifyCustomer()
		private void deleteCustomer()
		private void listAllCustomers()
		public static void main(String[] args)

*/

public class CustomerView {
	
	//创建CustomerList的对象
	CustomerList list = new CustomerList(10);
	
	//构造器    创建一个对象添加到数组中
	public CustomerView(){
		Customer customer = new Customer("小许", '女', 14, "1231231", "123@qq.com");
		list.addCustomer(customer);
	}
	
	//进入主菜单
	public void enterMainMenu() {
		boolean flag = true;
		do {
			//页面展示
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                  1 添 加 客 户");
			System.out.println("                  2 修 改 客 户");
			System.out.println("                  3 删 除 客 户");
			System.out.println("                  4 客 户 列 表");
			System.out.println("                  5 退           出");
			System.out.print("请选择(1-5)：");
			
			//读取用户输入		
			char menuSelection = CMUtility.readMenuSelection();
			
			//判断用户输入
			switch (menuSelection) {
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
				//判断是否退出
				char selection = CMUtility.readConfirmSelection();
				if (selection == 'Y') {
					flag = false;
					System.out.println("程序退出");
				} 
				break;
			}
			
		} while (flag);
	}
	
	//添加用户
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
		//读取数据
		System.out.print("姓名 ：" );
		String name = CMUtility.readString(30);
		
		System.out.print("性别 ：" );
		char gender = CMUtility.readChar();
		
		System.out.print("年龄 ：" );
		int age = CMUtility.readInt();
		
		System.out.print("电话 ：" );
		String phone = CMUtility.readString(11);
		
		System.out.print("邮箱 ：" );
		String email = CMUtility.readString(30);
		
		//创建对象（）
		Customer customer = new Customer(name, gender, age, phone, email);
		
		//添加数据
		boolean addCustomer = list.addCustomer(customer);
		
		//判断
		if (addCustomer) {
			System.out.println("---------------------添加成功---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}
		
	}
	
	//修改用户
	private void modifyCustomer(){
		/*
		---------------------修改客户---------------------
		请选择待修改客户编号(-1退出)：1
		姓名(小井):小罗
		性别(男):
		年龄(18):
		电话(110):
		邮箱(aaa@qq.com):
		*/
		
		System.out.println("---------------------修改客户---------------------");
		boolean flag = true;
		int id = 0;
		Customer customer = null;//被替换的用户
		
		while(flag){
			System.out.print("请选择待修改客户编号(-1退出): ");
			//判断用户输入
			id = CMUtility.readInt();
			if (id == -1) {
				return;
			}
			//判断用户是否存在
			customer = list.getCustomer(id - 1);
			System.out.println(customer);
			if (customer == null) {
				System.out.println("无法找到指定用户");
			} else {
				flag = false;
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
		System.out.print("姓名("+ customer.getName() +"):");
		String name = CMUtility.readString(30, customer.getName());
		System.out.print("性别("+ customer.getGender() +"):");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄("+ customer.getAge() +"):");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话("+ customer.getPhone() +"):");
		String phone = CMUtility.readString(11, customer.getPhone());
		System.out.print("邮箱("+ customer.getEmail() +"):");
		String email = CMUtility.readString(30, customer.getEmail());
		
		//封装对象
		Customer sc1 = new Customer(name, gender, age, phone, email);
		
		//替换原来的用户
		boolean isflag = list.replaceCustomer(id -1 , sc1);
		if (isflag) {
			System.out.println("---------------------替换成功--------------------- ");
		} else {
			System.out.println("---------------------替换失败--------------------- ");
		}
	}
	
	//删除用户
	private void deleteCustomer(){
		/*
		 * ---------------------删除客户---------------------
			请选择待删除客户编号(-1退出)：6
			无法找到该用户
			请选择待删除客户编号(-1退出)：1
			确认是否删除(Y/N):Y
			---------------------删除完成---------------------
		 */
		
		System.out.println("---------------------删除客户---------------------");
		boolean flag = true;
		int id = 0;
		while (flag) {
			System.out.print("请选择待删除客户编号(-1退出)：");
			id = CMUtility.readInt();
			if (id == -1) {
				return;
			}
			
			//如果id不为-1则查找该用户是否存在
			Customer customer = list.getCustomer(id -1);
			if (customer == null) {
				System.out.println("无法找到该用户");
			} else {
				break;
			}
			
		}
		
		System.out.println("确认是否删除(Y/N):");
		char selection = CMUtility.readConfirmSelection();
		if (selection == 'Y') {//确定要删
				boolean deleteCustomer = list.deleteCustomer(id-1);
				if (deleteCustomer) {
					System.out.println("---------------------删除成功---------------------");
				}else
					System.out.println("---------------------删除失败---------------------");
		}
	
	}
	
	//显示用户列表信息
	private void listAllCustomers(){
		/*
		 * ---------------------------客户列表---------------------------
			编号	姓名	性别	年龄	电话		邮箱
			1	小井	男	20	1333333333		aaa@qq.com
			2	aa	男	18	15222222222		qq@qq.com
			3	aa	男	18	1521321321		22@qq.com
			--------------------------客户列表完成-------------------------
		 */
		
		
		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");

		//获取所有的用户
		 Customer[] customers = list.getAllCustomers();
		 
		 if (customers.length > 0 ) {		 
		//遍历信息
		 for (int i = 0; i < customers.length; i++) {
			 //获取每一个用户
			 Customer customer = customers[i];
			 System.out.println(i+1 +   "\t" + customer.getName() +
										"\t" + customer.getGender() + 
										"\t" + customer.getAge() + 
										"\t" + customer.getPhone() + 
										"\t" + customer.getEmail()
					 
					 );
		}
		 }else {
			 System.out.println("亲！！！您还没有添加用户哦！！！！！");
		 }
		System.out.println("--------------------------客户列表完成-------------------------");
		
	}
	
	//程序入口
	public static void main(String[] args){
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}
	
	
}