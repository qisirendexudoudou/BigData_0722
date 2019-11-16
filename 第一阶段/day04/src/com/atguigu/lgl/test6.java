package com.atguigu.lgl;

/*

1.��ӡ1~100֮�����������ĺ�
2.��ӡ1~100֮��������7�ı����������ĸ������ܺͣ�������ü�������˼�룩
3.������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
    ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5
*/


public class test6
{
	public static void main(String[] args){

		//test3
			for (int i=100;i<=999 ;i++ )
		{
			int l=i/100;
			int m=(i%100)/10;
			int n=i%10;
			int sum=l*l*l+m*m*m+n*n*n;
			if (sum == i)
			{
				System.out.println(sum);
			}
			
		}





		//test2
        /*
		int sum=0;
		int m=0;
		for (int i=1;i<=100 ;i++ )
		{
			int n=i%7;

			switch (n)
			{
			case 0:
				System.out.println(i);
				m=m+1;
				sum=i+sum;
				break;
			case 1:
				break;
			}
		}
		System.out.println("m=" + m);
		System.out.println("sum=" + sum);
		*/





		//test1
		
		int sum=0;
		for (int i=1;i<=100 ;i++ )
		{
			int n1=i%2;
			switch (n1)
			{
			case 0:
				break;
			case 1:
				System.out.println(i);
				sum=i+sum;
				break;
			}
		}
		System.out.println("sum=" + sum);
		


	}
}