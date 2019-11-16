package com.atguigu.lgl;


/*
1.ʹ�� switch ��Сд���͵� char��תΪ��д��ֻת�� a, b, c, d, e. ��������� ��other����
��ʾ��String word = scan.next();  char c = word.charAt(0); switch(c){}

2.��ѧ���ɼ�����60�ֵģ�������ϸ񡱡�����60�ֵģ���������ϸ񡱡�

3.��������ָ���·ݣ���ӡ���·������ļ��ڡ�  
3,4,5 ���� 6,7,8 �ļ�  9,10,11 �＾ 12, 1, 2 ����

4. ��д���򣺴Ӽ���������2019��ġ�month���͡�day����Ҫ��ͨ������������������Ϊ2019��ĵڼ��졣

*/


import java.util.Scanner;
public class test3
{
	public static void main(String[] args){
	
		//tets4
		System.out.println("please input 2019's month:");
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();

		System.out.println("please input 2019's day:");
		Scanner m = new Scanner(System.in);
		int day = m.nextInt();

		int sum;

		switch ( month )
		{
		case 1:
			sum=day;
			break;
		case 2:
			sum = 31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 3:
			sum = 31+28+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 4:
			sum = 31+28+31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 5:
			sum = 31+28+31+30+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 6:
			sum = 31+28+31+30+31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 7:
			sum = 31+28+31+30+31+30+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 8:
			sum = 31+28+31+30+31+30+31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 9:
			sum = 31+28+31+30+31+30+31+31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 10:
			sum = 31+28+31+30+31+30+31+31+30+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		case 11:
			sum = 31+28+31+30+31+30+31+31+30+31+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		default:
			sum=31+28+31+30+31+30+31+31+30+31+30+day;
			//System.out.println("this is 2019's " + sum + "th day!");
			break;
		}
			System.out.println("this is 2019's " + sum + "th day!");
		//test3
		/*
		System.out.println("please input a yuefen(1-12):");
		Scanner s = new Scanner(System.in);
		int yuefen = s.nextInt();

		switch ( yuefen )
		{
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("�ļ���");
			break;
		case 7:
			System.out.println("�ļ���");
			break;
		case 8:
			System.out.println("�ļ���");
			break;
		case 9:
			System.out.println("�＾��");
			break;
		case 10:
			System.out.println("�＾��");
			break;
		case 11:	
			System.out.println("�＾��");
			break;
		default:
			System.out.println("������");
			break;
		}
		*/



		//test2
		/*
		System.out.println("please input your score:");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();

		//int ss = score/10;		
		//System.out.println(ss);

		switch ( score/60 )
		{
		case 1:
			System.out.println("�ϸ�");
			break;
		default:
			System.out.println("���ϸ�");
			break;
		}
		*/





		//test1
		/*
		System.out.println("please input a zimu:");
		Scanner s = new Scanner(System.in);
		String word = s.next();

		switch ( word)
		{
		case "a":
			System.out.println("A");
			break;
		case "b":
			System.out.println("B");
			break;
		case "c":
			System.out.println("C");
			break;
		case "d":
			System.out.println("D");
			break;
		case "e":
			System.out.println("E");
			break;
		default:
			System.out.println("other");
			break;
		}
		*/


	}
}