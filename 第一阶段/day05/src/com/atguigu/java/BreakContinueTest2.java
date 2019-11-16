package com.atguigu.java;

/*

	break��continue��Ƕ��ѭ���е�ʹ��

*/


public class BreakContinueTest2{

	public static void main(String[] args){

		//��Ƕ��ѭ����break���������ǰ��������ǲ�ѭ���ĵ�ǰѭ����
		/*
		for(int i = 1; i <= 3; i++){
		
			for(int j = 1; j <= 5; j++){
			
				System.out.print(j + " ");
				
				if(j == 3){
					break;
				}
			}
			System.out.println();
			System.out.println("i=" + i);
		
		}
		*/

		System.out.println("----------------------------------------");
		//��Ƕ��ѭ����continue���������ǰ��������ǲ�ѭ���ĵ���ѭ����
		for(int i = 1; i <= 3; i++){
		
			for(int j = 1; j <= 3; j++){
			
				if(j == 2){
					continue;
				}

				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println("i=" + i);
		
		}

		System.out.println("-----------------�������ѭ��----------------------");

		//lable�����ѭ�������֣��������������֣�
		lable : for(int i = 1; i <= 3; i++){
		
			for(int j = 1; j <= 5; j++){
			
				System.out.print(j + " ");
				
				if(j == 3){
					break lable; //���������ѭ������lable���Ǹ�ѭ��
				}
			}
			
//			System.out.println();
//			System.ou
		
	}
	}
}