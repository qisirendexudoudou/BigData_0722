package com.atguigu.lgl;


/*
-----------------��ͥ��֧�������-----------------

                   1 ��֧��ϸ
                   2 �Ǽ�����
                   3 �Ǽ�֧��
                   4 ��    ��

                   ��ѡ��(1-4)��_

�����ͥ��ʼ�����������Ϊ10000Ԫ��
ÿ�εǼ����루�˵�2��������Ľ��Ӧ�ۼӵ��������ϣ�����¼����������ϸ���Ա�����Ĳ�ѯ��
ÿ�εǼ�֧�����˵�3����֧���Ľ��Ӧ�ӻ������п۳�������¼����֧����ϸ���Ա�����Ĳ�ѯ��
��ѯ��֧��ϸ�� �˵�1��ʱ������ʾ���е����롢֧����ϸ�б�

������ļ�¼����ʹ��int���͵ľֲ�������ʵ�֣�
	int balance = 10000;
��֧��ϸ��¼����ʹ��Sting���͵ı�����ʵ�֣����ʼֵΪ��ϸ��ı�ͷ�����磺
	String details = "��֧\t�˻����\t��֧���\t˵    ��\n";
�ڵǼ���֧ʱ������֧�����balance��ӻ��������֧��¼ֱ�Ӵ��ӵ�details���漴�ɡ�

String details = "��֧\t�˻����\t��֧���\t˵    ��\n";


��Ŀ���ṩ��Utility.java�࣬�����������ʵ�ּ��̷��ʡ�
�����ṩ�����¾�̬������
public static char readMenuSelection()  ���÷�����ȡ���̣�����û����롯1��-��4���е������ַ����򷽷����ء�����ֵΪ�û������ַ���
public static int readNumber() ���÷����Ӽ��̶�ȡһ��������4λ���ȵ���������������Ϊ�����ķ���ֵ��
public static String readString() ���÷����Ӽ��̶�ȡһ��������8λ���ȵ��ַ�������������Ϊ�����ķ���ֵ��
public static char readConfirmSelection() ���÷����Ӽ��̶�ȡ��Y����N������������Ϊ�����ķ���ֵ��

*/

import java.util.*;
import java.util.Scanner;
public class shouzhi
{
	//Scanner s = new Scanner(System.in);
	public static char readMenuSelection(){
		Scanner s = new Scanner(System.in);
		char c;
		for (; ; )
		{
			String c1 = s.nextLine();
			c=c1.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4' )
			{
				System.out.println("��������������1-4��");
			}else
			{
				break;
			}
		}
		return c;
	}


	public static int readNumber(){
		Scanner s = new Scanner(System.in);
		char d;
		for (; ; )
		{
			String d1 = s.nextLine();
			d=d1.charAt(0);
			if (d >= 10000)
			{
				System.out.println("������һ��������4λ����������");
			}else
			{
				break;
			}
		}
		return d;
	}

	public static String readString(){
			Scanner s = new Scanner(System.in);
			String str1 = s.nextLine();
			return str1;	
	}

	public static char readConfirmSelection(){
			Scanner s = new Scanner(System.in);
			String str2 = s.nextLine();
			char str3=str2.charAt(0);
			for (; ; )
			{
				if ( str3 == 'y' || str3 == 'n' )
				{
					break;
				}else
				{
					System.out.println("����������y/n:");
				}
			}
			return str3;
	}

}


