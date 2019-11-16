package com.atguigu.java;
/*

	break:
		ʹ�÷�Χ ��1.ѭ���ṹ   2.switch-case�ṹ
		���ã� 1.��ѭ���ṹ������������ǰѭ������switch-case�ṹ����������switch-case�ṹ��
		��Ƕ��ѭ���� ����Ƕ��ѭ����break���������ǰ��������ǲ�ѭ���ĵ�ǰѭ����

	continue:
		ʹ�÷�Χ �� 1.ѭ���ṹ
		���� ��������������ѭ��
		��Ƕ��ѭ���� ����Ƕ��ѭ����continue���������ǰ��������ǲ�ѭ���ĵ���ѭ����

	ע�⣺break��continue�ĺ��治��ֱ����д����������������

*/
public class BreakContinueTest{

	public static void main(String[] args){
		
		//break
		for(int i = 1; i <= 5; i++){
		
			System.out.println(i);

			if(i == 3){
				break; //������ǰѭ����
				//System.out.println("ccccc"); //���������Ϊ�������Զ�޷�ִ�еõ�
			}

			System.out.println("ccccc");
		
		}

		System.out.println("---------------------------------------------------");}
	}