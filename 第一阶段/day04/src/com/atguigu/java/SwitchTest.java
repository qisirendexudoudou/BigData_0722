package com.atguigu.java;


/*

	��֧���:switch-case

	��ʽ��

		switch(���ʽ){
		
		case ����1��
			ִ�����1;
			break;
		case ����2��
			ִ�����2;
			break;
		......
		default:
			ִ�����n;
			break;
		
		}

	˵����
		1.case����ĳ�����ͱ��ʽ����ƥ�䣬һ��ƥ��ɹ�����ִ�ж�Ӧ��ִ����䡣ֱ������break��ִ�е�
				switch-case�����Ȼ������switch-case�ṹ��

		2.break�ǿ�ѡ�ġ�break������ֹswitch-case�ṹ��
		3.default�ǿ�ѡ�ġ������û��ƥ��ɹ���ִ��default�е�ִ����䡣
			default��λ�������ġ�
		4.���ʽ������ֻ���� byte,short,int char ö�� String(jdk1.7��ʼ֧�ֵ�)
		5.case����ֻ�ܸ�����
		6.switch-case���Ա�if-else���滻����֮�����������߶�����ʹ������ѡ��switch-caseЧ�ʸ�һЩ

*/
public class SwitchTest{

	public static void main(String[] args){
	
		int number = 9;

		switch(number){
		//default��λ�������Ŀ����������λ�á�
		default:
			System.out.println("other");

		case 1:
			System.out.println("1");
			//break;
		case 3:
			System.out.println("3");
			//break;
		case 5:
			System.out.println("5");
			break;
		
		}

		System.out.println("-------------------------------------------");

		boolean boo = true;
		//���ʽ������ֻ���� byte,short,int char ö�� String(jdk1.7��ʼ֧�ֵ�)
		/*
		���� ����Ϊ���ʽ�����Ͳ���
		switch(boo){
		case true:
			System.out.println(true);
			break;
		case false:
			System.out.println(false);
			break;
		}
		*/

		System.out.println("-------------------------------------------");

		String season = "summer";

		switch(season){
		case "spring"://case����ֻ�ܸ�����
			System.out.println("���쵽��");
			break;
		case "summer":
			System.out.println("�������");
			break;
		}


		System.out.println("����ִ�����");
	
	}
}