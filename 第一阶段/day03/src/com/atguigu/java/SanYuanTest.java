package com.atguigu.java;


/*

	��Ԫ����� ��

	��ʽ �����������ʽ���� ���ʽ1 �� ���ʽ2;

	˵����
		 1.�������ʽ�Ľ��ֻ��Ϊ��������
		 2.�������ʽ�Ľ��Ϊtrueִ�б��ʽ1�����Ϊfalse��ִ�б��ʽ2
		 3.���ʽ1�ͱ��ʽ2������Ӧ�ñ���һ��
				������ʽ1�ͱ��ʽ2�����Զ�����������һ����������ôҲ���ԡ�
				�� ��double max = (m > n)? 10.2 : 5;
		4.��Ԫ���������Ƕ��ʹ�ã����ǲ����顣
		5.��Ԫ��������Ա�if-else���滻����֮�����������߶�����ʹ�õ�����£���������ѡ����Ԫ�������
				��Ϊ��Ԫ�����Ч�ʻ��һЩ��

*/
public class SanYuanTest{

	public static void main(String[] args){
		
		//��ȡ�������еĽϴ���
		int m = 10, n = 10;
		int maxNumber = (m > n)? m : n;
		System.out.println("maxNumber=" + maxNumber);

		System.out.println("-------------------------------");

		/*
			m > n : true
			m <= n :false
		*/
		String str = (m > n)? "m" : "n";
		System.out.println(str);

		System.out.println("-------------------------------");
		//���ʽ1�ͱ��ʽ2������Ӧ�ñ���һ��
		//������ʽ1�ͱ��ʽ2�����Զ�����������һ����������ôҲ����
		double max = (m > n)? 10.2 : 5;
		System.out.println(max);


		System.out.println("-------------------------------");
		//��ȡ�������еĽϴ���
		int n1 = 10, n2 = 20,n3 = 30;
		/*
		int maxN = (n1 > n2)? n1 : n2;
		maxN = (maxN > n3)? maxN : n3;
		*/

		//��Ԫ���������Ƕ��ʹ�ã����ǲ����顣
		int maxN2 = (((n1 > n2)? n1 : n2) > n3)? ((n1 > n2)? n1 : n2) : n3;
		System.out.println("maxN2=" + maxN2);

		System.out.println("--------------if-else-----------------");
		int a1 = 5,a2 = 10;
		if(a1 > a2){
			System.out.println(a1);
		}else{
			System.out.println(a2);
		}
	}
}