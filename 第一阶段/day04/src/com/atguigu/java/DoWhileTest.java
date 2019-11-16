package com.atguigu.java;


/*

	ѭ���ṹ ��do-while

	ѭ�����ĸ����֣�
		1.��ʼ������
		2.ѭ������
		3.ѭ����
		4.��������


	��ʽ��
		
		��ʼ������;
		do{
			ѭ����;
			��������;
			
		}while(ѭ������);
*/
public class DoWhileTest{

	public static void main(String[] args){
		
		//��100���ڵ�ż����ż���ĸ�����ż�����ܺ�
		int i = 1; //��ʼ������
		int sum = 0;
		int count = 0;
		do{
			//ѭ����
			if(i % 2 == 0){
				sum += i;
				count++;
				System.out.println(i);
			}
			//��������
			i++;
		
		}while(i <= 100); //ѭ������

		System.out.println("sum=" + sum + " count=" + count);
	}
}