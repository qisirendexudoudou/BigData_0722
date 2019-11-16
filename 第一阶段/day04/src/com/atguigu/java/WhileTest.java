package com.atguigu.java;
/*


	ѭ���ṹ ��while

	ѭ�����ĸ����֣�
		1.��ʼ������
		2.ѭ������
		3.ѭ����
		4.��������

	��ʽ��
		��ʼ������;
		while(ѭ������){
			ѭ����;
			��������;
		}

	˵����
		1.whileѭ����forѭ�������໥�滻ʹ��
		2.while�ĳ�ʼ�������ڽṹ�⣬forѭ���ĳ�ʼ�������ڽṹ�ڡ�

*/
public class WhileTest{

	public static void main(String[] args){
		//��100���ڵ�ż����ż���ĸ�����ż�����ܺ�
		int i = 1; //��ʼ������
		int sum = 0; //�ܺ�
		int count = 0; //����
		while(i <= 100){ //ѭ������
			//ѭ����
			if(i % 2 == 0){
				count++;
				sum += i;
				System.out.println(i);
			}
			//��������;
			i++; //����Ҫ��������������Ϊ��ѭ��
		}

		System.out.println("count=" + count + " sum=" + sum);
	}
}