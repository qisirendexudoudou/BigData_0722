package com.atguigu.java;


/*
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������
*/
import java.util.Scanner;
public class PositiveNegative{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in); //����ѭ��������

		int positiveNumber = 0; //�����ĸ���
		int negativeNumber = 0; //�����ĸ���
		while(true){
			//�Ӽ��̶�ȡһ����
			int number = sc.nextInt();
			//�ж�
			if(number == 0){
				break;
			}else if(number > 0){ //����
				positiveNumber++;
			}else{//����
				negativeNumber++;
			}
		}

		System.out.println("�����ĸ�����:" + positiveNumber + " �����ĸ����У�" + negativeNumber);
	}
}