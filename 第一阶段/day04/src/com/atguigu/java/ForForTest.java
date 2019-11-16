package com.atguigu.java;


/*
	
	Ƕ��ѭ�� �� һ��ѭ��a��Ϊ��һ��ѭ��b��ѭ���塣aѭ�������ڲ�ѭ����bѭ���������ѭ����

*/
public class ForForTest{

	public static void main(String[] args){
	
		//ÿ��ֻ�����*   ���*****ͼ��
		for(int i = 1; i <= 5; i++){
			System.out.print("*");
		}


		System.out.println();
		System.out.println("---------------------------------------------");
		/*	
			*****
			*****
			*****
			*****
			*****

			ѭ���Ĵ��� = ���ѭ���Ĵ��� * �ڲ�ѭ���Ĵ���

			��Ϊ���ѭ��ѭ��һ�Σ��ڲ�ѭ��ѭ��һ�֡�

			���ѭ�������У��ڲ�ѭ�������С�
		*/

		for(int j = 1; j <= 5; j++){
			for(int i = 1; i <= 5; i++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("---------------------------------------------");
		/*	
							i			j
			*				1			1
			**				2			2
			***				3			3
			****			4			4
			*****			5			5
		*/
		for(int i = 1; i <= 5; i++){ //������
		
			for(int j = 1; j <= i ; j++){ //������
				System.out.print("*");
			}

			System.out.println();
		
		}

		System.out.println();
		System.out.println("---------------------------------------------");
		/*	
						i		j
			*****		1		5
			****		2		4
			***			3		3
			**			4		2
			*			5		1
		*/
		for(int i = 1; i <= 5; i++){
			
			for(int j = 1; j <= 6 - i; j++){
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("---------------------------------------------");
		/*	
							    i			j		k
			----*				1			4		1
			---* *				2			3		2
			--* * *				3			2		3
			-* * * *			4			1		4
			* * * * *			5			0		5
		*/
		for(int i = 1; i <= 5; i++){ //��
		
			for(int j = 1; j <= 5 - i; j++){//�ո�
				System.out.print(" ");
			}

			for(int k = 1; k <= i; k++){//"* "
				System.out.print("* ");
			}

			System.out.println();
		
		}
	
	}
}