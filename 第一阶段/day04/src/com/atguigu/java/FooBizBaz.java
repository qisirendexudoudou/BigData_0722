package com.atguigu.java;


/*

	��д�����1ѭ����150������ÿ�д�ӡһ��ֵ��������ÿ��3�ı������ϴ�ӡ����foo��,
	��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz����

*/
public class FooBizBaz{

	public static void main(String[] args){
	
		for(int i = 1; i <= 150; i++){

			System.out.print(i + " ");
			//3�ı���
			if(i % 3 == 0){
				System.out.print("foo ");
			}

			//5�ı���
			if(i % 5 == 0){
				System.out.print("biz ");
			}

			//7�ı���
			if(i % 7 == 0){
				System.out.print("baz ");
			}

			System.out.println();
		
		}
	}
}