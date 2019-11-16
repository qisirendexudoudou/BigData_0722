package com.atguigu.java;


/*

	��ֵ����� �� =

	��չ��ֵ������� +=, -=, *=, /=, %=

*/
public class SetValueTest{

	public static void main(String[] args){
	
		int a = 10;
		a += 2;// �������� a = a + 2;
		System.out.println("a=" + a);

		System.out.println("-------------������-----------------------");

		byte b = 10;
		//b = b + 2; ���벻ͨ������Ϊbyte��������Ƚ���������Ϊint
		b += 2; //����û���� ������ı�ԭ�����������͡�
		System.out.println("b=" + b);

		System.out.println("----------------�κ���---------------------");

		int i = 1;
		i *= 0.1;
		System.out.println(i);//0
		i++;
		System.out.println(i);//1

	}
}