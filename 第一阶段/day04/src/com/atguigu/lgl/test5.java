package com.atguigu.lgl;


/*
��д�����1ѭ����150������ÿ�д�ӡһ��ֵ��������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz����

*/


public class test5
{
	public static void main(String[] args){

		for (int i=1;i<=150 ;i++ )
		{
			int sum1=i%3;
			int sum2=i%5;
			int sum3=i%7;

			System.out.print(i +" ");

			if(sum1 == 0)
			{
				System.out.print("foo " );
			}
			if (sum2 == 0)
			{
				System.out.print("biz " );
			}
			if (sum3 == 0)
			{
				System.out.print("baz " );
			}		
						
			System.out.println();
			
		}
	}
}