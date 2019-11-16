package mytest;
//package project1;

/*

3.������е�ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
���磺 153 = 1*1*1 + 3*3*3 + 5*5*5

*/
public class test3 {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++ ) {
			//int sum;
			int l=i/100;
			int m=i%100/10;
			int n=i%10;
			int sum = l*l*l + m*m*m + n*n*n;
			if ( sum == i ) {
				System.out.println(sum);
			}
		}
	}
}
