package com.atguigu.lgl;

import com.atguigu.lgl.Utility;
/*
-----------------家庭收支记账软件-----------------

1 收支明细
2 登记收入
3 登记支出
4 退    出
 请选择(1-4)：
 
 */

public class FamilyAcccount {
	public static void main(String[] args) {
		
		boolean flag = true;//控制循环
		String details = "收支\t账户金额\t收支金额\t说    明";//表头
		int balance = 1000;//初始金额

		do {
			System.out.println("-----------------家庭收支记账软件-----------------");
			System.out.println();
			System.out.println("                  1 收支明细");
			System.out.println("                  2 登记收入");
			System.out.println("                  3 登记支出");
			System.out.println("                  4 退    出");
			System.out.print("请选择(1-4)：     ");
			
			//读取用户输入
			int selection = Utility.readMenuSelection();
			switch (selection) {
			case '1':
/* 
-----------------当前收支明细记录-------------------
收支	账户金额	收支金额	说    明
----------------------------------------------
*/
				System.out.println("-----------------当前收支明细记录-------------------");
				System.out.println(details);
				System.out.println("----------------------------------------------");
				break;
			case '2':
/*
                  请选择(1-4)：2
------------------------------------------------
本次收入金额:100
本次收入说明：haode 
---------------------登记完成---------------------
 */		
				System.out.println("-----------------------------------------------");
				System.out.print("本次收入金额: ");
				int sr = Utility.readNumber();
				System.out.print("本次收入说明：  ");
				String srsm = Utility.readString();
				balance += sr;
				details += "\n收入\t" + balance +"\t" + sr + "\t" + srsm ;			
				System.out.println("---------------------登记完成---------------------");				
				break;
			case '3':
/*
 ------------------------------------------------
本次支出金额：100
本次支出说明：en
---------------------登记完成---------------------
 */				
				
				System.out.println("------------------------------------------------");
				System.out.print("本次支出金额: ");
				int sc = Utility.readNumber();
				System.out.print("本次支出说明：  ");
				String scsm = Utility.readString();
				balance -= sc;
				details += "\n支出\t" + balance +"\t" + sc + "\t" + scsm ;			
				System.out.println("---------------------登记完成---------------------");		
				break;
			case '4':
				System.out.print("确认是否退出(Y/N)：");
				int tc = Utility.readConfirmSelection();
				if (tc == 'Y') {
					flag = false;
					System.out.println("程序退出");
				}else{
					flag = true;
				}
	
				break;
			}
			
			
			
			
		} while (flag);
	}
}
