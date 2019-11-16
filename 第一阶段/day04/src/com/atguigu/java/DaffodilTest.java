package com.atguigu.java;


/*

	3.������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
    ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5

*/
public class DaffodilTest{

	public static void main(String[] args){
		
		for(int i = 100; i <= 999; i++){
		
			//��ÿ�����İ�λʮλ��λȫ�����
			int a = i / 100; //��λ
			int b = i % 100 / 10; //ʮλ
			int c = i % 10;

			//�ж��Ƿ���ˮ�ɻ���
			if(a * a * a + b * b * b + c * c * c == i){
				System.out.println(i);
			}
		
		}
	
	}
}