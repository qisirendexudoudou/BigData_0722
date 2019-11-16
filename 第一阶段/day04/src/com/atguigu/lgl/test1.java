package com.atguigu.lgl;

/*
switch(���ʽ){
	case ����1:
		���1;
		// break;
	case ����2:
		���2;
		// break;
	�� ��
	case ����N:
		���N;
		// break;
	default:
		���;
		// break;
	 } 
*/

import java.util.Scanner;
public class test1
{
	public static void main(String[] args){
	
		System.out.println("please input 0/1:");
		Scanner s = new Scanner(System.in);
		int sorce = s.nextInt();

		switch ( sorce)
		{
		case  1:
			System.out.println("����������");
			break;
		case 0:
			System.out.println("����Ů����");
			break;
		default:
			System.out.println("�㲻�в�Ů����");
			break;
		}
	}
}