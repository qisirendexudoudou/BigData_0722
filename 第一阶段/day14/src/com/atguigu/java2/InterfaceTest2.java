package com.atguigu.java2;

/**
 * 接口和类之间的多态性 ：
 * 
 *
 */

interface USB{
	void start();
	void close();
}

interface Bluetooth{
	void connect();
	void disconnect();
}

class Printer implements USB,Bluetooth{

	public void print(){
		System.out.println("打印内容中........");
	}
	
	@Override
	public void start() {
		System.out.println("摄像头关闭闪光灯打开....");
		System.out.println("摄像头关闭开始拍照......");
	}

	@Override
	public void close() {
		System.out.println("摄像头关闭......");
	}

	@Override
	public void connect() {
		System.out.println("摄像头蓝牙连接中....");
	}

	@Override
	public void disconnect() {
		System.out.println("摄像头蓝牙断开连接....");
	}
	
}

class Mouse implements USB,Bluetooth{

	@Override
	public void start() {
		System.out.println("鼠标彩灯闪起来......");
		System.out.println("鼠标移动起来.......");
	}

	@Override
	public void close() {
		System.out.println("鼠标关闭........");
	}

	@Override
	public void connect() {
		System.out.println("鼠标蓝牙连接中........");
	}

	@Override
	public void disconnect() {
		System.out.println("鼠标蓝牙断开连接........");

	}
}

class Computer{
	
	public void runUSB(USB usb){
		usb.start(); //传的对象是谁就调谁的start方法
		System.out.println("------------------运行中-----------------");
		usb.close();
	}
	
	public void runBluetooth(Bluetooth bt){
		bt.connect();
		System.out.println("-----运行中------------");
		bt.disconnect();
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		Mouse mouse = new Mouse();
		
		Printer printer = new Printer();
		
		computer.runUSB(mouse);
		computer.runUSB(printer);
		
		System.out.println("========================================");
		

		
		System.out.println("=================调用蓝牙=======================");
		
		computer.runBluetooth(mouse);
		computer.runBluetooth(printer);
		
		System.out.println("-------------------------------------------------------------------");
		
		//接口和类之间的多态 ： 接口的类型指向实现类的对象
//		Bluetooth bp = new Printer();
		USB up = new Printer(); //可以向下转型，可以进行类型判断
		if(up instanceof Printer){
			System.out.println("我是一台打印机");
			//向下转型
			Printer p = (Printer) up;
			p.print();
		}else if(up instanceof Mouse){
			System.out.println("我是一个鼠标");
		}
		
	}
}









