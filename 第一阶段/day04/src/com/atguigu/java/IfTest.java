package com.atguigu.java;


/*

	��д�����ɼ����������������ֱ�������num1��num2��num3��
	�����ǽ�������(ʹ�� if-else if-else),���Ҵ�С���������

*/
import java.util.Scanner;
public class IfTest{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//��ȡ����
		System.out.println("������������");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		//�ж�
		if(num1 > num2){

			if(num3 > num1){ //˵��num3���
				System.out.println(num2 + " " + num1 + " " + num3);
			}else if(num3 < num2){ //˵��num3��С
				System.out.println(num3 + " " + num2 + " " + num1);
			}else{//��num1��num2�м��λ��
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		
		}else{ //num1 <= num2
			
			if(num3 > num2){//˵��num3���
				System.out.println(num1 + " " + num2 + " " + num3);
			}else if(num3 < num1){//˵��num3��С
				System.out.println(num3 + " " + num1 + " " + num2);
			}else{//��num1��num2�м��λ��
				System.out.println(num1 + " " + num3 + " " + num2);
			}

		}
	
	}
}