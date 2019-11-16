package com.atguigu.java;


/*
4. ��д���򣺴Ӽ���������2019��ġ�month���͡�day����Ҫ��ͨ������������������Ϊ2019��ĵڼ��졣

*/

import java.util.Scanner;
public class SwitchTest4{

	public static void main(String[] args){
	
		//1.��ȡ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·�");
		int month = sc.nextInt();
		System.out.println("����������");
		int day = sc.nextInt();

		int sumDay = 0; //����ͳ�Ƶ����������
	
		//2.ͳ������
		switch(month){
		/*
		case 1:
			sumDay = day;
			break;
		case 2:
			sumDay = day + 31;
			break;
		case 3:
			sumDay = day + 31 + 28;
			break;
		case 4:
			sumDay = day + 31 + 28 + 31;
			break;
		*/

		case 4:
			sumDay += 31;
			
		case 3:
			sumDay += 28; //��ֵ��+=��ȫ��һ���� sumDay += 28 : ����sumDayԭ���������ٶ������28
			
		case 2:
			sumDay  += 31; // sumDay = sumDay + 31
			
		case 1:
			sumDay += day;
	
		}

		//3.���
		System.out.println("2019��" + month + "��" + day + "���ǵ���ĵ�" + sumDay + "��");

	}
}