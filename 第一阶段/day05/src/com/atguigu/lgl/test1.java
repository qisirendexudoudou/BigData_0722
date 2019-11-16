package com.atguigu.lgl;
public  class test1
{
	public static void main(String[] args){

		//��̬��ʼ��
		//��ʽһ
		
		int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a[1]);

		System.out.println("---------------------------------------");
		//��ʽ��
		String b[];
		b=new String[3];
		b[1]="����";
		System.out.println(b[1]);
		System.out.println("---------------------------------------");

		//��̬��ʼ��
		//��ʽһ
		
		int c[] = {100,200,300};
		for (int h=0;h<c.length ;h++ )
		{
			System.out.println("c["+ h +"] = " + c[h]);
		}
		System.out.println("---------------------------------------");


		//��ʽ��
	

	}
}


