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
public class test2
{
	public static void main(String[] args){
	
		System.out.println("please input jijiemingcheng:");
		Scanner s = new Scanner(System.in);
		String mess = s.next();

		switch ( mess)
		{
		case "chun":
			System.out.println("���Ǵ��죡");
			break;
		case "xia":
			System.out.println("�������죡");
			break;
		case "qiu":
			System.out.println("�������죡");
			break;
		case "dong":
			System.out.println("���Ƕ��죡");
			break;
		default:
			System.out.println("�㲻�ڵ����ϣ�����");
			break;
		}
	}
}