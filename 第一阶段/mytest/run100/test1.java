package run100;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import org.junit.Test;
public class test1 {
	
	@Test
	public void test1(){
		//1、用循环控制语句打印输出：1+3+5+...+99=?的结果
	int sum= 0 ;
	for (int i = 1; i < 100; i+=2) {
		sum+=i;
	}
	System.out.println(sum);
	}
	@Test
	public void test2(){
		//2、请写一个冒泡排序，实现{5,7,3,9,2}从小到大排序
		int[] nums= {5,7,3,9,2};
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-i-1; j++) {
				if (nums[j]>nums[j+1]) {
					int tmpe = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = tmpe;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
}	
	
	@Test
	public void test3(){
		//3、编写方法实现：求某年某月某日是这一年的第几天       提示：闰年（1）能被4整除不能被100整除（2）能被400整除
		Scanner s = new Scanner(System.in);
		System.out.println("请输入年月日： ");
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		switch (month) {
		case 12:
			day=day+30;
		case 11:
			day=day+31;
		case 10:
			day=day+30;
		case 9:
			day=day+31;
		case 8:
			day=day+31;
		case 7:
			day=day+30;	
		case 6:
			day=day+31;
		case 5:
			day=day +30;
		case 4:
			day=day+31;
		case 3:
			if ((year%4 ==0 && year%100 !=0) || year %400 ==0 ) {
				day = day+29;
			}else {
				day=day + 28;
			}
		case 2:
			day=day+31;
		case 1:
			day=day;
		}
		System.out.println(day);
	}
	
	@Test
	public void test3_3(){
		System.out.println(daysOfYear(2019, 3, 2));
	}
	
	public static int daysOfYear(int year, int month, int day){
		int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = day;
        for (int i = 0; i <month-1; i++) {
			sum += daysOfMonth[i];
        }
		if (month > 2) {
			if (year % 4 == 0 && year%100 !=0 || year %400 ==0) {
				sum++;
			}
		}
		
		
		return sum;
    }

	
	/*
	 * 3、编写方法实现：求某年某月某日是这一年的第几天
	 */
	@Test
	public void test(){
		int s = daysOfYear2(2020, 13, 2);
		System.out.println(s);
	}

		public static int daysOfYear2(int year, int month, int day){
			
			int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
			int sum = day;
	        for (int i = 0; i < month-1; i++) {
					sum += daysOfMonth[i];
	        }
	        if(month>2){
	        	if (year%4 ==0 && year%100 !=0 || year%400 ==0 ) {
					sum++;
				}
	        }
	        return sum;
	}
		
		
		/*
		 * 4、通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，其中n是大于等于5并且小于10000的整数，
		 * 例如：f(5) = 5 + 4 + 3 + 2 + 1，f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
		 * 请用非递归的方式完成方法long f( int n)的方法体。
		 */
		@Test
		public void test4(){
			System.out.println(f(10));
		}
		public long f(int n){
			long sum=0;
			for (int i = 1; i <=n; i++) {
				sum+=i;
			}
			return sum;
		}
		
		/*
		 * 1+2！+3！+...+20！
		 */
		@Test
		public void test5(){
			long sum=0;			
			for (int i = 1; i <= 20; i++) {
				long num=1;
				for (int j = 1; j <=i; j++) {
					num *= j;
				}
				sum += num;
			}
			System.out.println(sum);
		}
		
		/*
		 * 6、输出一个如下图形，一共有n行，第n行有2n-1个*，完成方法public void printStar(int n)的方法体
		 * 				i   j
						1	5   -----*
						2	4   ----***
						3	3   ---*****
						4	2   --*******
						5	1   -*********
						6	0    ***********
		 */
		@Test
		public void test6(){
			test66(6);
		}
		public void test66(int n){
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
			
			
		}
		
		/*
		 * 7、请编写代码使用把一个字符串反转，例如：hello1234，反转后：4321olleh。
		 */
		@Test
		public void test7(){
			String str= "hello1234";
			StringBuffer buffer = new StringBuffer(str);
			buffer.reverse();	
			String str2 = buffer.toString();
			System.out.println(str2);
			
		}
		/*
		 * 8、编写代码实现，从一个标准url里取出文件的扩展名，尽可能高效。
		 */
		@Test
		public void test8(){
			
				String str = fileExtNameFromUrl("http://localhost:8080/testweb/index.html");
				System.out.println(str);
			}
			
			public static String fileExtNameFromUrl(String url){
				return url.substring(url.lastIndexOf('.')+1);
		}
		/*
		 * 9、有一个字符串String abc = “342567891”，请写程序将字符串abc进行升序，可以使用JDK API中的现有的功能方法。
		 */
		@Test
		public void test9(){
			String abc = "342567891";
			char[] c1 = abc.toCharArray();
			Arrays.sort(c1);
			abc = new String(c1);
			System.out.println(abc);
		}
		
		/*
		 * 10.编写一个懒汉式单例设计模式
		 */
		
		@Test
		public void test10(){
			
		}
		

		
		/*
		 * 11、请编写一个饿汉式单例设计模式
		 */
		@Test
		public void test11(){
			
		}

		/*
		 * 12.补充如下枚举类型的代码，使得如下代码达到运行效果
		 */
		@Test
		public void test12(){}
		
		/*
		 * 13、写一段代码实现在遍历ArrayList时移除一个元素，例如：”java”？
		 */
		@Test
		public void test13(){
			List<String> list = new ArrayList<>();
			list.add("php");
			list.add("java");
			list.add("sql");
			list.add("shell");
			System.out.println(list);
			System.out.println("------------");
			
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				String next = iterator.next();
				if (next.equals("java")) {
					iterator.remove();
				}
			}
			System.out.println(list);
	
		}
		/*
		 * 14.hashmap
		 */
		
		/*
		 * 15.hashmap
		 */

		/*
		 * 16、请编写代码读取一个项目根目录下info.properties文件
		 */
		@Test
		public void test16() throws Exception{
			//1.创建Properties对象
			Properties ps = new Properties();
			//2.创建流的对象
			FileInputStream	 fis = new FileInputStream("info.properties");
			//3.加载流
			ps.load(fis);
			//4.读取内容
			String name = ps.getProperty("username");
			String passwd = ps.getProperty("passwd");
			System.out.println(name + " -- " + passwd);
		}
		
		/*
		 * 17、请编写代码把一个GBK的文本文件内容读取后存储到一个UTF-8的文本文件中。
		 */
		@Test
		public void test17() throws Exception{
			FileInputStream fis = new FileInputStream("test_gbk.txt");
			InputStreamReader isr = new InputStreamReader(fis,"GBK");
			
			FileOutputStream fos = new FileOutputStream("test_utf8.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			
			char[] ch = new char[1024];
			int len;
			while ((len = isr.read(ch)) != -1) {
				osw.write(ch,0,len);
			}
			
			isr.close();
			fis.close();
			osw.close();
			fos.close();
		}
		
		
		
		/*
		 * 18、用实现Runnable接口的方式，启动一个线程完成在线程中打印1-100的数字
		 */
		@Test
		public void test18(){
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int i = 1; i <=100; i++) {
						System.out.println(i);
					}
					
				}
			}).start();
			
		}
		
		@Test
		public void test19(){
			
				String str1 = "1";
				String str2 = "2";
				String str3 = new String("1");
				final String str4 = "2";
				final String str5 = new String("2");
				String str6 = "12";
				
				String str7 = "1" + "2";
				String str8 = str1 + "2";
				String str9 = str1 + str2;
				String str10 = str3 + str4;
				String str11 = "1" + str4;
				String str12 = "1" + str5;
				String str13 = (str1 + str2).intern();
			
				System.out.println("(1)"+ (str1 == str3));//false
				System.out.println("(2)"+ (str2 == str4));//true
				System.out.println("(3)"+ (str4 == str5));//false
				System.out.println("(4)"+ (str6 == str7));//true
				System.out.println("-----------------");
				System.out.println("(5)"+ (str6 == str8));//false
				System.out.println("(6)"+ (str6 == str9));//false
				System.out.println("(7)"+ (str6 == str10));//false
				
				System.out.println("(8)"+ (str6 == str11));//false-----true
				
				System.out.println("(9)"+ (str6 == str12));//false
				System.out.println("(10)"+ (str6 == str13));//true
			
		}
		
		/*
		 * 1.判断101-200之间有多少个素数，并输出所有素数
		 */
		@Test
		public void test101(){
			System.out.println("101-200之间的素数有：");
			for (int i = 101; i <=200; i++) {
				boolean flag = true;
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						flag= false;
						break;
					}
				}
				if (flag) {
					System.out.println(i);
				}
			}
		}
		
		/*
		 * 2.一个球从100米高度自由落下，每次落地后反跳回原高度的一半，再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
		 */
		@Test
		public void test102(){
			double height = 100;
			double distance = 0;
			int count = 10;
			for (int i = 1; i <=count; i++) {
				distance += height;//落下高度
				height/=2;//反弹高度
				if (i !=count) {
					height +=distance;
				}
			}
			System.out.println(height+ "   "+distance);
		}
		
		public void test102_2(){
				double height = 100;
				double distance = 0;
				int count = 10;
				for (int i = 1; i <= count; i++) {
					distance += height;// 加落下的距离
					height = height / 2;// 弹起的高度 第i次弹起的高度
					if (i != count) {
						distance += height; // 加弹起的距离
					}
				}
				System.out.println("第" + count + "次落地时，经过了：" + distance + "米");
				System.out.println("第" + count + "次反弹的高度是：" + height + "米");
		}
		
		/*
		 * 用100元钱买100支笔，其中钢笔3元/支，圆珠笔2元/支，铅笔0.5元/支，问钢笔、圆珠笔和铅笔可以各买多少支？请写main方法打印需要买的数目。
		 */
		@Test
		public void test103(){
			int mon = 100;
			int count = 100;
			double pp=3;
			double yp=2;
			double qp=0.5;
			
			for (int i = 1; i <= mon/pp; i++) {
				for (int j = 1; j <=mon/yp; j++) {
					for (int k = 1; k <=mon/qp; k++) {
						if (i+j+k ==100 && i*pp + j*yp+ k*qp == mon) {
							System.out.println(i + " + " + j + "+" + k );
						}
					}
				}
			}
		}
		
		/*
		 * 4.通项公式如下：f(n)=n + (n-1) + (n-2) + .... + 1，
		 * 其中n是大于等于5并且小于10000的整数，
		 * 例如：f(5) = 5 + 4 + 3 + 2 + 1，
		 * f(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1，
		 * 请用递归的方式完成方法long f( int n)的方法体。
		 */
		@Test
		public static long f1(int n){
			long sum = 0;
			if (n==1) {
				sum+=1;
			}else if(n>1){
				sum+= n + f1(n-1);
			}
			return sum;
		}

		/*
		 * 1+2！+3！+...+20！
		 */
		@Test
		public void test105(){
			long sum = 0;
			for (int i = 1; i <=20; i++) {
				long num = 1;
				for (int j = 1; j <=i; j++) {
					num*=j;
				}
				sum+=num;
			}
			
			System.out.println("sum = " +sum);
		}

		/*
		 * 第一个人10岁，第2个比第1个人大2岁，以此类推，请用递归方式计算出第8个人多大？
		 */
		@Test
		public void test106(){
			System.out.println("第8个人的年龄：" + getAge(8));
		}

		public static int getAge(int count){
			if (count == 1) {
				return 10;
			} else {
				return getAge(count-1)+2;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}




