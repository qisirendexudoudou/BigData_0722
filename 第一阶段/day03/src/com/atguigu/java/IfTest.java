package com.atguigu.java;


/*
	��֧�ṹ ��if-else , switch-case


	if-else:

	��ʽһ��

		if(�������ʽ){
			ִ�����;
		}


	��ʽ������ѡһ
		if(�������ʽ){
			ִ�����1;
		}else{
			ִ�����2;
		}

	��ʽ������ѡһ
		if(�������ʽ1){
			ִ�����1;
		}else if(�������ʽ2){
			ִ�����2;
		}else if(�������ʽ3){
			ִ�����3;
		}
		......
		else{
			ִ�����n;
		}

*/
public class IfTest{

	public static void main(String[] args){
		
		//��ʽһ
		boolean handsome = false;

		if(handsome){
			System.out.println("�����Ҿͼ޸���");
		}

		System.out.println("-----------------------------------");
		//��ʽ����
		boolean hasMoney = false;
		if(hasMoney){
			System.out.println("������������˶�");
		}else{
			System.out.println("�Ҳ��������˶�");
		}

		System.out.println("-----------------------------------");
		//��ʽ��
		int age = 30;
		if(age < 18){
			System.out.println("δ�����ֹ�ۿ�");
		}else if(age < 28){
			System.out.println("û�¶�����Ů���ѣ����ڼҿ�Ƭ");
		}else if(age < 38){
			System.out.println("Ƭ�����˰ɣ����嶼������");
		}else{
			System.out.println("�ú�ڰ��������ʱ����Ӧ��ȥ�й�Ⱥú�ѧϰ");
		}

		System.out.println("���������");
	}

}