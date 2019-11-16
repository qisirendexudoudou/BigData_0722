package com.atguigu.java;


/*
	3��
	��������� �� +������ -������ + - * / % ǰ++ ��++  ǰ-- ��-- +�����ӷ���
*/
public class ArithmeticTest{

	public static void main(String[] args){
	
		int n1 = 10 / 4; //2
		System.out.println(n1);

		double n2 = 10 / 4; //2.0
		n2 = (10 + 0.0) / 4; //2.5
		n2 = 10  / (4 * 1.0); //2.5
		n2 = (double)10  / 4; //2.5
		n2 = 10 / 4 * 4; //8.0
		n2 = 10  * 4 / 4; //10.0 ע�⣺�ڳ˺ͳ�������ϵʱ��Ӱ����������£���ѧ���������ȳ˺�����������
		System.out.println(n2);


		System.out.println("--------------------ȡ��/ȡģ-------------------------");
		//ȡ����������Ĵ��룺��2ȡ����
		//���� �������ж�X�Ƿ��ܱ�Y������
		System.out.println(0 % 2); //0
		System.out.println(1 % 2); //1
		System.out.println(2 % 2); //0
		System.out.println(3 % 2); //1
		System.out.println(4 % 2); //0
		System.out.println(5 % 2); //1

		System.out.println("-------------------------ȡģ���������-------------------");
		//ȡģ����������ͱ�ģ���������й�
		System.out.println(-2 % 3); //-2
		System.out.println(4 % -3); //1
		System.out.println(-5 % -3); //-2
	
	}
}