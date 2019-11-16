package com.atguigu.java;

import com.atguigu.lgl.Utility;

/*
 	快捷键 ： ctrl + alt + down ： 复制
 	
 		   ctrl + shift + f : 格式化代码
 		   
 		   shift +　回车 ： 直接向下另起一行
 		   
 		   ctrl + shift + 回车 ： 直接向上另起一行
 */
public class FamilyAcccount {

	public static void main(String[] args) {
		String details = "收支\t账户金额\t收支金额\t说    明";//收支明细
		int balance = 10000; //余额
		boolean isFlag = true; // 用来控制循环
		do {
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println();
			System.out.println("                 1 收支明细");
			System.out.println("                 2 登记收入");
			System.out.println("                 3 登记支出");
			System.out.println("                 4 退    出");
			System.out.print("                  请选择(1-4)：");
			// 通过类名.方法名调用Utility类中的方法
			char menuSelection = Utility.readMenuSelection();// 读取到了菜单项
			// 判断
			switch (menuSelection) {
			case '1': //千万不能写成1  因为‘1’的unicode值是49
				//收支明细
				/*
				 * -----------------当前收支明细记录-----------------
					收支	账户金额	收支金额	说    明
					收入	10100		100		aa
					支出	10050		50		买肝
					
					--------------------------------------------------
				 */
				System.out.println("-----------------当前收支明细记录-----------------");
				System.out.println(details);
				System.out.println("----------------------------------------------");
				break;
			case '2': //收入
				/*
				 *  本次收入金额：300
					本次收入说明：卖肾
					---------------------登记完成---------------------
				 */
				System.out.println("------------------------------------------------");
				//读取数据
				System.out.print("本次收入金额:");
				int income = Utility.readNumber();
				System.out.print("本次收入说明：");
				String incomeDes = Utility.readString();
				//要将收入的金额累加到余额中
				balance += income;
				//将读取的内容拼接到字符串上
				details += "\n收入\t" + balance + "\t" + income + "\t" + incomeDes;
				System.out.println("---------------------登记完成---------------------");
				break;
			case '3':
				/*
				 *  本次支出金额：100
					本次支出说明：买娃娃
					---------------------登记完成---------------------
				 */
				System.out.println("------------------------------------------------");
				//读取数据
				System.out.print("本次支出金额：");
				int pay = Utility.readNumber();
				System.out.print("本次支出说明：");
				String payDes = Utility.readString();
				//2.将支出的金额从余额中减掉
				balance -= pay;
				//3.字符串拼接
				details += "\n支出\t" + balance + "\t" + pay + "\t" + payDes;
				System.out.println("---------------------登记完成---------------------");
				break;
			case '4':
				/*
				 * 确认是否退出(Y/N)：y
				 */
				System.out.print("确认是否退出(Y/N)：");
				//读取是否退出
				char confirmSelection = Utility.readConfirmSelection();
				//判断
				if(confirmSelection == 'Y'){
					//退出程序
					isFlag = false; //不能写break - 写break不会退出循环
					System.out.println("退出成功!!!");
				}
				break;

			}

		} while (isFlag);

	}
}
