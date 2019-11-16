package com.atguigu.java;

/*
3��
	�����ķ��ࣺ

	
	�����������ͷ� ��������������  vs ������������

		�����������ͣ�
				
				���� ��byte(1�ֽ�=8bit -128 ~ 127) short(2�ֽ�) 
						int��4�ֽڣ� long��8�ֽڣ�
				������ �� float(4�ֽ�) double��8�ֽڣ�
				�ַ��� ��char(2�ֽ�)
				�������� ��boolean(ֻ������ֵtrue��false)

		�����������ͣ��ࣨString�����ࣩ���ӿڣ�����

*/
public class VarTypeTest{

	public static void main(String[] args){
		//byte(1�ֽ�=8bit -128 ~ 127) short(2�ֽ�) int��4�ֽڣ� long��8�ֽڣ�
		byte b = 100;
		long number = 11222222L;//����long�ͳ������ӡ�l��(һ�㲻��'l')��L��

		//float(4�ֽ�) double��8�ֽڣ�
		double d = 12.3; //������Լ�"d"��"D"����һ�����Ƕ����ӣ�Ĭ�Ͼ���double
		float f = 12.5f; //����float�ͳ��������ӡ�f����F��
		d = .5; //0.5
		System.out.println(d);


		System.out.println("----------------------------------------------");
		//char(2�ֽ�)
		//��ʽһ
/*		char c = 'io';
		c = 'a';
		c = '��';

		//��ʽ��
		c = '\n';
		c = '\t';
		System.out.println("aaa" + c + "dddd"); //"aaa\ndddd"

		//��ʽ��
		c = '\u0065'; //��ȡ����Unicodeֵ����Ӧ���ַ�
		c = 65; //65����Ӧ���Ǹ��ַ�'A'
		System.out.println(c);


		System.out.println("----------------------------------------------");

		boolean boo = true;
		boo = false;*/
//		System.out.println(boo);

	}
}