	package com.atguigu.java;
/*

1.ʹ�� switch ��Сд���͵� char��תΪ��д��ֻת�� a, b, c, d, e. ��������� ��other����

*/
public class SwitchTest2{

	public static void main(String[] args){
	
		char c = 'a';

		switch(c){
		
		case 'a':
			//��һ�ַ�ʽ
			//System.out.println('A');

			//�ڶ��ַ�ʽ
			//a = 97  A = 65
			c -= 32; //ʹ��-=��������ı�ԭ������������
			System.out.println(c);
			break;
		
		}
	
	}
}