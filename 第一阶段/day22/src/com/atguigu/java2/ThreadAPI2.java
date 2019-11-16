package com.atguigu.java2;

/*
static  void  yield()：线程让步
	暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
	若队列中没有同优先级的线程，忽略此方法
join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将被阻塞，
		直到 join() 方法加入的 join 线程执行完为止   
		低优先级的线程也可以获得执行 
static  void  sleep(long millis)：(指定时间:毫秒)
	令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后重排队。
	抛出InterruptedException异常
stop(): 强制线程生命期结束
boolean isAlive()：返回boolean，判断线程是否还活着

interrupt(); //杀死其它线程（线程的死亡通知）
isInterrupted() : 如果线程被杀死返回true,否则返回false
 */
public class ThreadAPI2 {

	public static void main(String[] args) {
		
		Thread t = new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					//isInterrupted() : 如果线程被杀死返回true,否则返回false
					if(Thread.currentThread().isInterrupted()){
						//保存数据，清理内容，等等......
						return;//run方法结束当前线程就结束了
					}
					System.out.println(Thread.currentThread().getName() 
							+ "====" + i );
				}
			}
		};
		t.start();
		
		
		for (int i = 0; i < 100; i++) {
			if(i == 10){
//				Thread.currentThread().yield();//线程让步
				
				/*
				try {
					t.join();//让t线程开始执行，执行完后再由主线程继续执行。
				} catch (InterruptedException e) {
					e.printStackTrace();
				}*/
				
				/*
				try {
					//让当前线程睡眠
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				*/
				
//				t.stop();//过时了杀死其它线程
				t.interrupt(); //杀死其它线程（线程的死亡通知）
			}
			
			System.out.println(Thread.currentThread().getName() + "====" + i);
		}
		
		
		System.out.println(t.isAlive());//判断某个线程是否还活着
		
	}
}
