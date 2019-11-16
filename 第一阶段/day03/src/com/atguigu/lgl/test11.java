package com.atguigu.lgl;
/*
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���һ�����������ߣ�180cm���ϣ������Ƹ�1ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���

Sysout(�����:   (cm))
scanner.nextInt();
Sysout(���Ƹ�:   (ǧ��))
scanner.nextDouble();
Sysout(��˧��:   (true/false))   (��/��)
scanner.nextBoolean();   scanner.next();   ���ǡ�.equals(str)  
*/

import java.util.Scanner;
public class test11
{
	public static void main(String[] args){
	
	System.out.println("please input your shenggao(cm):");
	Scanner s = new Scanner(System.in);
	double shenggao = s.nextDouble();

	System.out.println("please input your caifu(RMB):");
	Scanner m = new Scanner(System.in);
	double caifu = m.nextDouble();

	System.out.println("please input your shuaifou(true/false):");
	Scanner n = new Scanner(System.in);
	boolean shuaifou = n.nextBoolean();


		if ( shenggao > 180 && caifu > 10000000 && shuaifou == true )
		{
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if ( shenggao > 180 || caifu > 10000000 || shuaifou == true    )
		{
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("����");
		}
			
	}
}