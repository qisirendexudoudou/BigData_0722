package com.atguigu.exer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * 4：编写程序，在main方法中创建一个线程。线程每隔一定时间（200ms以内的随机时间）产生一个0-100之间的随机整数，
 * 打印后将该整数放到集合中；
共产生100个整数，全部产生后，睡眠30秒，然后将集合内容打印输出；

 */
public class PrintNumberTest {

	public static void main(String[] args) {
		
		//1.在分线程将随机数存放到集合中
		//2.在主线程中输出集合中的数据
		
		//注意 ： 泛型的类型不能是基本数据类型。（集合中只能存放引用数类型）
		List<Long> list = new ArrayList<>();
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Random random = new Random();
				
				for (int i = 0; i < 100; i++) {
					
					long number = Math.round(Math.random() * 100);
					list.add(number);
					//睡眠
					try {
						Thread.sleep(random.nextInt(200));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				
			}
		});
		t.start();
		
		
		try {
			t.join();//等t线程执行完毕主线程再继续执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(20000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println(list);
		
	}
}
