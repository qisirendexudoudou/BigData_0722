package com.atguigu.java;


/*

	ѭ���ṹ ��forѭ��

	ѭ�����ĸ����֣�
		1.��ʼ������
		2.ѭ������
		3.ѭ����
		4.��������

	��ʽ��
		for(1��ʼ������;2ѭ������;4��������){
			3ѭ����
		}
	
	 ִ�е�˳�� �� 1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 ........2


	 ˵����
			1.��ʼ������ִֻ��һ��
			2.ѭ���������Ϊ�������ͣ����Ϊtrue��ִ��ѭ���壬���Ϊ��ֹforѭ��
			3.ѭ���� ����Ҫ����ִ�еĴ���
			4.�������� ���������ɶ�ѭ���������ͳ�ơ�

*/
public class ForTest{

	public static void main(String[] args){
		/*
		//���100��
		for(int i = 0; i < 100; i++){
			//ѭ����
			System.out.println("������ô��ô˧");
		}
		*/

		System.out.println("------------------------------------");
		
		/*
		��⼴�� �� ���ִ�е�˳��
		int i = 1;
		int j = 1;
		for(System.out.println("��ʼ������"); ++j < 5 || i <= 5 ; i++){
			System.out.println("ѭ����=====" + i + "===============" + j);
		}

		System.out.println("���������===" + i);
		*/


		System.out.println("----------------��ϰ--------------------");
		int count = 0; //ͳ��ż���ĸ���
		int sum = 0; //�ۼ�ż�����ܺ�
		//��100���ڵ�ż����ż���ĸ�����ż�����ܺ�
		for(int i = 1; i <= 100; i++){

			if(i % 2 == 0){ //ż��
				count++;
				sum += i;
				System.out.println(i);
			}
		}

		System.out.println("count=" + count + " sum=" + sum);
	
	}
}