package com.atguigu.lgl;


/*
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������

public class DoWhileLoop {
    public static void main(String args[]) {
        int result = 0, i = 1;
        do {
            result += i;
            i++;
        } while (i <= 100);
            System.out.println("result=" + result);
        }
}


*/

//int z = scanner.nextInt();

import java.util.Scanner;
public class test7
{
	public static void main(String[] args){

		int z=0;
		int f=0;
		
		System.out.println("please input number:");
		Scanner s = new Scanner(System.in);
		while (true)
		{	
			int num = s.nextInt();
			
			if (num > 0 )
			{
				z++;
			}else if (num < 0 )
			{
				f++;
			}else{
				System.out.println("���������");
				break;
			}
		};
		System.out.println("z number = " + z);
		System.out.println("f number = " + f);

		
    }
}

