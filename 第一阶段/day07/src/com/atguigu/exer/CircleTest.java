package com.atguigu.exer;

/*
 * 鍒╃敤闈㈠悜瀵硅薄鐨勭紪绋嬫柟娉曪紝璁捐绫籆ircle璁＄畻鍦嗙殑闈㈢Н銆�
 */
class Circle{
	
	public double radius;//鍗婂緞
	
	/**
	 * 姹傞潰绉� 锛� 
	 * 鎬濊�� 锛�1.璇ユ柟娉曢渶涓嶉渶瑕佽繑鍥炲��    2.璇ユ柟娉曢渶涓嶉渶瑕佸舰鍙�
	 * 
	 * 鎬濊�冿細闇�涓嶉渶瑕佽繑鍥炲�硷紵闇�涓嶉渶浣跨敤杩欎釜缁撴灉鍘诲仛鍏跺畠鐨勮繍绠�
	 * 鎬濊�� 锛氳鏂规硶闇�涓嶉渶瑕佸舰鍙傦紵闇�涓嶉渶瑕佹柟娉曠殑璋冪敤鑰呯粰浼犳暟鎹��
	 */
	public void findArea(){
		System.out.println(Math.PI  * radius * radius);
	}
	
	
	public void zhouChang(){
		System.out.println(Math.PI * 2 * radius);
	}
	
	//璁捐涓嶅悎鐞� 锛氬悓涓�涓渾鐨勫懆闀挎垨闈㈢Н瀹冧滑鐨勫崐寰勫簲璇ラ兘鏄竴鏍风殑銆�
	public void findArea2(double r){
		System.out.println(Math.PI * r * r);
	}
}


public class CircleTest {

	public static void main(String[] args) {

		Circle circle = new Circle();
		//璋冪敤鏃犲弬鐨勬柟娉�
		circle.radius = 1;
		circle.findArea();
		circle.zhouChang();
		//璋冪敤鏈夊弬鐨勬柟娉�
		circle.findArea2(1);
	}
	
	public void add(int a,int b){
		System.out.println(a + b);
	}
}
