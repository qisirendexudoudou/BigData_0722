package com.atguigu.java;


/*

��С���μ�Java���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ100��ʱ������һ��BMW��
�ɼ�Ϊ(80��99]ʱ������һ̨iphone xs max��
���ɼ�Ϊ[60,80]ʱ������һ�� iPad��
����ʱ��ʲô����Ҳû�С�
��Ӽ���������С������ĩ�ɼ����������ж�


	˵����
		1.�������������ʽ�ķ�Χ�ǻ����ϵ����ô˭��˭�¶����ԡ�
			�������������ʽ�ķ�Χ�ǰ�����ϵ����ô��ΧС�������棬��Χ��������档
		2.else����ʡ�ԡ�����ʡ�Ժ���ܻᵼ��û������һ������������ġ�

*/
//����
import java.util.Scanner;
public class IfTest2{

	public static void main(String[] args){
		
		//��������
		Scanner s = new Scanner(System.in);
		//���÷���
		System.out.println("������С�����ĳɼ�");
		int score = s.nextInt();

		//�жϳɼ�
		/*
		if(score == 100){
			System.out.println("�ٺ� ���� ���� �����ͣ���ſ�");
		}else if(score >= 60 && score <= 80){
			System.out.println("֪����֪�� ipad���������");
		}else if(score > 80 && score <= 99){
			System.out.println("�� ������ iphone xs max �Ѿ���·����");
		}else{
			System.out.println("����Ҫ���������һ�ȥ��������");
		}
		*/
		

		System.out.println("-----------------------------------------------");
		
		//����ķ�ʽ���뿼�Ƿ�Χ�Ĵ�С��
		if(score == 100){
			System.out.println("�ٺ� ���� ���� �����ͣ���ſ�");
		}else if(score > 80){
			System.out.println("�� ������ iphone xs max �Ѿ���·����");
		}else if(score >= 60){
			System.out.println("֪����֪�� ipad���������");
		}else{
			System.out.println("����Ҫ���������һ�ȥ��������");
		}
		
	
	}
}