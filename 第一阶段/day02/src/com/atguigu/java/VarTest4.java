package com.atguigu.java;

/*
3��
	ǿ������ת�����Զ���������������̡����Ѵ�������ֵ��С������

	˵����	
		1.��Ҫʹ��ǿ������ת���� ����ǿת�����ͣ�
		2.ǿ������־�����ܻ���ʧ����
*/
public class VarTest4{

	public static void main(String[] args){
	
		int number = 100;
		byte b = (byte)number;
		System.out.println(b);

		System.out.println("---------------------------------------");

		float f = 12.5f;
		int num = (int)f;
		System.out.println(num);

		System.out.println("---------------------------------------");

		num = 100; 
		long num2 = (long)num; //С������ֵ�����������Լ�ǿ������ת��������û��Ҫ��
		System.out.println(num2);

		System.out.println("----------------��ϰ��-----------------------");

		int n = 10;
		int n2 = 20;
		//byte n3 = (byte)n + (byte)n2; //���벻ͨ����byte�����㻹�Ὣ��������Ϊint
		byte n3 = (byte)(n + n2);
		System.out.println(n3);
	}
}