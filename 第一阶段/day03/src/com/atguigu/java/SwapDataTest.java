package com.atguigu.java;


/*

	�������������е����ݣ�

*/
public class SwapDataTest{

	public static void main(String[] args){
		
		int n = 5, m = 10;

		//��ʽһ������ᣨ�ŵ㣺�κ��������Ͷ����Խ�����ȱ�㣺��Ҫһ����ʱ������
		/*
		int temp = m;
		m = n;
		n = temp;
		*/


		//��ʽ�������ŵ� ������Ҫ���������ı���  ȱ�㣺1.ֻ��������ֵ 2.�п��ܻᳬ��������Χ��
		/*
		m = m + n;
		n = m - n; //(m + n) - n
		m = m - n; //(m + n) - n(m)
		*/


		//��ʽ�������ŵ� ��1.����Ҫ�������ı���  2.Ч�ʸ�   ȱ�㣺1.��������� 2.ֻ��������ֵ ��
		m = m ^ n;
		n = m ^ n; //(m ^ n) ^ n
		m = m ^ n; //(m ^ n) ^ n(m)

		System.out.println("m=" + m + " n=" + n);
	}
}