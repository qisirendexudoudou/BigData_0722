package com.atguigu.java;
/*
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
 
   ע���ж�һ���Ƿ�������ı�׼��
       1�����Ա�4�����������ɱ�100����
	��
       2�����Ա�400����


*/
import java.util.Scanner;
public class SwitchTest5{

	public static void main(String[] args){
	
		//1.��ȡ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		int year = sc.nextInt();
		System.out.println("�������·�");
		int month = sc.nextInt();
		System.out.println("����������");
		int day = sc.nextInt();

		int sumDay = 0; //����ͳ�Ƶ����������
	
		//2.ͳ������
		switch(month){
	
		case 4:
			sumDay += 31;
			
		case 3:
			//�жϵ����Ƿ�������
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
				sumDay += 29; 
			}else{
				sumDay += 28; 
			}
			
			
		case 2:
			sumDay  += 31; 
			
		case 1:
			sumDay += day;
	
		}

		//3.���
		System.out.println(year + "��" + month + "��" + day + "���ǵ���ĵ�" + sumDay + "��");
		
	}
}