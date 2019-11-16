package mytest;

import java.util.Scanner;

public class test6 {
	
	public static void main(String[] args) {
//1.定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，计算并输出学生的平均成绩。		
/*		int[] numbers = {72,89,65,58,87,91,53,82,71,93,76,68};
		int sum =0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("aver = " + sum/numbers.length);*/
		
/**
 * 2.定义一个数组来存储12个学生的成绩{72,89,65,58,87,91,53,82,71,93,76,68}，
统计各成绩等级（90分以上为‘A’，80~89分为‘B’，70~79分为‘C’，60~69分为‘D’，60分以下为E）学生人数，
并将其放入到数组count中，其中：count[0]存E级的人数，count[1]存D级的人数，……，count[4]存A级的人数。
 */
		
/*		int[] a = {72,89,65,58,87,91,53,82,71,93,76,68};
		int[] count =new int[5];
		for (int i = 0; i < a.length; i++) {
			if ( a[i] >= 90) {
				count[0]++;
			}else if( a[i] >= 80 && a[i] < 90){
				count[1]++;
			}else if (a[i] >= 70 && a[i] < 89){
				count[2]++;
			}else if( a[i] >= 60 && a[i] < 79){
				count[3]++;
			}else
				count[4]++;
		}
		
		System.out.println("A B C D E");
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i]+" ");
		}*/
		
/**
 * 3.从键盘输入8个整数存放在一个数组中，然后将奇数和偶数分别存入到两个不同的数组中，
并按奇数、偶数交替的顺序输出这两个数组中的所有数据
（先交替输出，如果奇数个数多，则再输出剩下的奇数，如果偶数个数多，则再输出剩下的偶数）。
（提示与要求：
（1）定义一个数组存储从键盘输入的8个整数，先判断这8个整数中奇数和偶数的个数，
才能定义存储奇数和偶数的数组的长度；
（2）把一个大的数组分别存放在奇数和偶数数组中并交替输出的过程定义为方法）		
 */
		System.out.println("please input 8 numbers:");
		int[] a = new int[8];
		int jlength = 0;
		int olength = 0;
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2 == 0) {
				olength++;
			}else
				jlength++;
		}
		int[] js = new int[jlength];
		int[] os = new int[olength];
		
	}
}
