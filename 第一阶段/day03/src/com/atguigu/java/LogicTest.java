package com.atguigu.java;


/*

	�߼��������
		&���߼���         | ���߼���         �����߼���
		&& ����·��      || ����·��        ^ ���߼���� 

	˵����
		1.&��&& �����߶�Ϊtrue���Ϊtrue(ֻҪ��һ��Ϊfalse���Ϊfalse)
		2.|��|| �����߶�Ϊfalse���Ϊfalse(ֻҪ��һ��Ϊtrue���Ϊtrue)
		3.! : ȡ��
		4.^ :��ͬΪfalse����ͬΪtrue
	
	�ص� ��
		1.�߼��������������������ǲ�������
		2.�߼�������Ľ��Ϊ��������

*/
public class LogicTest{

	public static void main(String[] args){
	
		boolean boo1 = true;
		boolean boo2 = false;

		System.out.println(boo1 & boo2); //false
		System.out.println(boo1 && boo2); //false
		System.out.println(boo1 | boo2); //true
		System.out.println(boo1 || boo2);//true
		System.out.println(!boo2);//true
		System.out.println(boo1 ^ boo2);//true

		System.out.println("-----------------------������---------------------------");

		/*
			|��||��������ʲô��&��&&��������ʲô��



			&��&&��������ʲô��
			&��&&��ߵ�ʽ��Ϊtrueʱ���ұߵ�ʽ�Ӷ���ִ�С�����Ϊ�жϲ��������
			&��&&��ߵ�ʽ��Ϊfalseʱ��
				&�ұߵ�ʽ����Ȼ��ִ�С�
				&&�ұߵ�ʽ�Ӳ���ִ�С�����Ϊ�ܹ��жϳ������Ϊfalse��

		
			|��||��������ʲô��
			|��||��ߵ�ʽ��Ϊfalseʱ���ұߵ�ʽ�Ӷ���ִ�С�����Ϊ�жϲ��������
			|��||��ߵ�ʽ��Ϊtrueʱ��
				|�ұߵ�ʽ����Ȼ��ִ�С�
				||�ұߵ�ʽ�Ӳ���ִ�С�����Ϊ�ܹ��жϳ������Ϊtrue��
		*/

		//&��&&��������ʲô��
		/*
		boolean bo = false;

		int number = 5;
		if(bo & (++number < 10)){
			System.out.println("����һ��true");
		}
		System.out.println("bo=" + bo + "  number=" + number);

		int number2 = 5;
		if(bo && (++number2 < 10)){
			System.out.println("����һ��true");
		}
		System.out.println("bo=" + bo + "  number2=" + number2);
		*/

		System.out.println("------------------------------------------------");

		boolean bo = true;

		int number = 5;
		if(bo | (++number < 10)){
			System.out.println("����һ��true");
		}
		System.out.println("bo=" + bo + "  number=" + number);

		int number2 = 5;
		if(bo || (++number2 < 10)){
			System.out.println("����һ��true");
		}
		System.out.println("bo=" + bo + "  number2=" + number2);
	}
}