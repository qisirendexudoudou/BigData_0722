package com.atguigu.java;



/*

	��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ�

*/
public class SwitchTest3{

	public static void main(String[] args){
	
		int score = 50;

		
		switch(score){
		
		case 0:
			System.out.println("���ϸ�");
			break;
		case 1:
			System.out.println("���ϸ�");
			break;
		
		}

		System.out.println("-------------------------------------------");
		switch(score){
		
		case 0:
		case 1:
		case 2:
		//......
		case 59:
			System.out.println("���ϸ�");
			break;
		
		}

		System.out.println("-------------------------------------------");

		switch(score / 10){
		
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("���ϸ�");
			break;
		case 6:
		case 7:
		//......
		case 10:
			System.out.println("�ϸ�");
			break;
		
		}

		System.out.println("-------------------------------------------");

		switch(score / 60){
		
		case 0:
			System.out.println("���ϸ�");
			break;
		case 1:
			System.out.println("�ϸ�");
			break;
		
	}
	}
}