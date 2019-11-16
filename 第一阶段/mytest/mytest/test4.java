package mytest;
import java.util.Scanner;



/*
 猜数字游戏：一个类A有一个成员变量v，有一个初值100。定义一个类，对A类的成员变量v进行猜。如果大了则提示大了，小了则提示小了。等于则提示猜测成功。
 */
public class test4 {
	public static void main(String[] args) {
		A a = new A();
//		System.out.println(a.V);
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你猜想的数字：");
		while (flag) {
			int num = scanner.nextInt();
			if (num > 100 ) {
					System.out.println("too big!");
			} else if(num < 100) {
					System.out.println("too small!");
			}else{
				System.out.println("good! 程序结束了");
				flag = false;
			}
		} 
	}

}
class A{
	int V = 100;
	
	public int findNum(int v){
		this.V = v;
		return V;
	}
}
