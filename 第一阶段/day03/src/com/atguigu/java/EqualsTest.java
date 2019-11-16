package com.atguigu.java;


/*

	�Ƚ������ �� ==  !=  > >= < <=

	ע�� �� �Ƚ�������Ľ��Ϊ��������
*/
public class EqualsTest{

	public static void main(String[] args){
		
		boolean boo = false;
		
		/*	
			if(���ʽ){
				ִ�����;
			}

			1.���ʽ�Ľ��ֻ��Ϊ��������
			2.������ʽ�Ľ��Ϊtrue��ִ��ִ����䡣����ִ�С�

		*/
		if(boo = true){
			System.out.println("����һ��true1");
		}

		boo = false;
		if(boo == true){
			System.out.println("����һ��true2");
		}

		System.out.println("�������");
	
	}
}