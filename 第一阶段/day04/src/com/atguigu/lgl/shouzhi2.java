package com.atguigu.lgl;


import java.util.*;
public class shouzhi2
{
	public static void main(String[] args){

		//�����ʼ����
		boolean flag=true;
		int csje=10000;
		int zhje=10000;
		String biaotou = "��֧\t��֧���\t�˻����\t˵    ��\n";
		Scanner s = new Scanner(System.in);

	do
	{
		//����ѡ��
		System.out.println("----------------��ͥ��֧�������-----------------");
		System.out.println("                                                 ");
		System.out.println("                  1 ��֧��ϸ                     ");
		System.out.println("                  2 �Ǽ�����                     ");
		System.out.println("                  3 �Ǽ�֧��                     ");
		System.out.println("                  4 ��    ��                     ");
		System.out.println("                                                 ");
		System.out.println("                  ��ѡ��(1-4)��                  ");
	
		int num = s.nextInt();
		char choose = shouzhi.readMenuSelection();
		switch (num)
		{
		case 1:
			System.out.println("-------��֧��ϸ--------");
			System.out.println(biaotou);
			System.out.println("-------pass-------------");
			break;
		case 2:
			System.out.print("���������");
			int srje = shouzhi.readNumber();
			System.out.print("��������˵����");
			String srsm = shouzhi.readString();

			zhje=csje+srje;
			biaotou=biaotou+"����\t" + srje + "\t\t" + zhje + "\t\t" + srsm + "\n";
			System.out.println("-------pass-------------");
			break;
		case 3:
			
			System.out.print("����֧����");
			int zcje = shouzhi.readNumber();
			System.out.print("����֧��˵����");
			String zcsm = shouzhi.readString();

			zhje=zhje-zcje;
			biaotou=biaotou+"֧��\t" + zcje + "\t\t" + zhje + "\t\t" + zcsm + "\n";
			System.out.println("-------pass-------------");
			break;
		case 4:
			
			System.out.print("ȷ���Ƿ��˳�(y/n)��");
			char tuichu = shouzhi.readConfirmSelection();
				if (tuichu == 'y' )
				{
					flag=false;
				}else
				{
					break;
				}
		//default :
		//	char choose = shouzhi.readMenuSelection();
		//	System.out.println(choose);
	}
	}
		while (flag);
	
}
}

