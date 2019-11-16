package com.atguigu.lgl;

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

public class test4
{
	public static void main(String[] args)
	{
		int a = 4;
		if (a == 4)
		{
			System.out.println("û���Ҿ���4��");
		}
		
		if (a > 10 )
		{
			System.out.println("���Ǽٵģ���������ݣ�");
		}else if (a == 6)
		{
			System.out.println("������ģ��ҵ�ֵ��4��");
		}else{
			System.out.println("���Ǳ����ģ�");
		}
	}
}