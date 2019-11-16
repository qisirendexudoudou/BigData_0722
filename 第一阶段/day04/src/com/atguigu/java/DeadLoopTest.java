
package com.atguigu.java;


/*

	 ��ѭ���ĸ�ʽ��

		for(;;){}

		while(true){}
	
		do{}while(true);
	
	����˳���ѭ����
		��ʽһ �� ��ѭ���������false
		��ʽ�� �� ʹ��break�ؼ���

*/
public class DeadLoopTest{

	public static void main(String[] args){
	
		/*
		for(;;){
			System.out.println("����ô��ô�ÿ�������");
		}
		*/

		/*
		while(true){
			System.out.println("���� �ٺ� ôô��");
		}
		*/

		//��ʽһ �� ��ѭ���������false
		/*
		boolean boo = true;
		while(boo){
			System.out.println("���� �ٺ� ôô��");
			boo = false;
		}
		*/

		
		//��ʽ�� �� ʹ��break�ؼ���
		while(true){
			System.out.println("���� �ٺ� ôô��");
			break; //������ֹ��ǰѭ����
		}
	
	}
}