package com.atguigu.java;


/*
	if-else : ʡ�Դ�����

	˵����
		1.��if-else�����ִ�����ֻ��һ������ô�����ſ���ʡ��
*/
public class IfTest3{

	public static void main(String[] args){
	
		if(5 > 3)
			System.out.println("5 > 3");
			//System.out.println("5 > 3"); ֻ��һ��ִ�����ſ���ʡ�Դ�����
		else
			System.out.println("5 <= 3");

		System.out.println("--------------------------------------------");
		//�ֽ׶β�������ʡ�Դ����š�
		if(true)
			if(false)
				System.out.println("cccc");
			else //�ͽ�ԭ��-���ĸ�if����ͺ�˭��һ��
				System.out.println("ddddddd");

		System.out.println("--------------------------------------------");

		int x = 4;
		int y = 1;
		if (x > 2) {
			if (y > 2) {
                System.out.println(x + y);
			}
			System.out.println("atguigu");
		} else //�������if��һ�ԣ���Ϊ���˴�����
			System.out.println("x is " + x);
		System.out.println("���������");
	
	}
}