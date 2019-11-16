package com.atguigu.java;


/*

	�Ӽ��̶�ȡ���ݣ�

	1.���� ��import java.util.Scanner;
	2.�������� ��Scanner s = new Scanner(System.in);
	3.���÷��� ��s.nextInt();
*/
import java.util.Scanner;
public class ScannerTest{

	public static void main(String[] args){
		
		//��������
		Scanner s = new Scanner(System.in);

		System.out.println("��������������");
		String name = s.next();

		System.out.println("��������������");
		//���÷��� ��������.����������
		int age = s.nextInt();

		System.out.println("������������˧��˧(true/false)");
		boolean handsome = s.nextBoolean();
		
		System.out.println("age=" + age);
		System.out.println("name=" + name);
		System.out.println("handsome=" + handsome);

	
	}
}