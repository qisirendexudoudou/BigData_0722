package com.atguigu.java;


/*
	
	��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů����
	��ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
*/

import java.util.Scanner;
public class IfTest2{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ߣ�");
		int height = sc.nextInt();
		System.out.println("���������ĲƸ�(ǧ��)");
		double money = sc.nextDouble();
		/*
		System.out.println("������������˧��(true/false)");
		boolean handsome = sc.nextBoolean();


		//�ж�
		if(height >= 180 && money >= 1 && handsome){
			System.out.println("��һ��Ҫ�޸���");
		}else if(height >= 180 || money >= 1 || handsome){
			System.out.println("�ްɣ����ϲ����������");
		}else{
			System.out.println("����");
		}
		*/


		System.out.println("������������˧��");
		String handsome = sc.next();//��ȡString������


		//�ж�
		if(height >= 180 && money >= 1 && "˧".equals(handsome)){
			System.out.println("��һ��Ҫ�޸���");
		}else if(height >= 180 || money >= 1 || "˧".equals(handsome)){
			System.out.println("�ްɣ����ϲ����������");
		}else{
			System.out.println("����");
		}
	}
}