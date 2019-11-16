package com.atguigu.java;



/*

	�Ƚ��ַ��������� - ���˽⼴��
*/
public class StringTest{

	public static void main(String[] args){
	
		String str = new String("˧");

		//�ж�˧��˧
		System.out.println("˧" ==  str); //�������ܱ��ַ���������
		
		boolean handsome = "˧".equals(str); //�Ƚϵ����ַ��������� - ���������ͬ����true���򷵻�false
		System.out.println(handsome);
	
	}
}