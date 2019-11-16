package com.atguigu.java;


/*

	λ�������

	<< �����ƣ� ����һ����Χ�ڣ�ÿ������һλ��ôԭ����������2

	>> �����ƣ� ����һ����Χ�ڣ�ÿ������һλԭ����������2

	>>(����) ��������������λ��0��������Ǹ������λ��1����

	>>>���޷������ƣ� �� �����������Ǹ��������λ������0��
*/
public class BitTest{

	public static void main(String[] args){
	
		System.out.println(3 << 1);//6
		System.out.println(3 << 2);//12
		System.out.println(3 << 3);//24

		System.out.println(1 << 31);

		System.out.println("-----------------------------------------");

		System.out.println(6 >> 1);
		System.out.println(3 >> 1);
		System.out.println(-3 >> 1);

		System.out.println("-----------------------------------------");
		System.out.println(6 >>> 1);
		System.out.println(-6 >>> 1);

	}
}