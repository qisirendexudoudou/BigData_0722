package com.atguigu.lgl;


//接口与类之间的多态性

interface Usb{
	public abstract void satrtu();
	public abstract void stopu();
}

interface BlueTooth{
	public abstract void satrtb();
	public abstract void stopb();
}

//打印机连接鼠标和蓝牙
class Printer implements Usb,BlueTooth {

	@Override
	public void satrtu() {
		System.out.println("鼠标  开始  使用了...");
	}

	@Override
	public void stopu() {
		System.out.println("鼠标  停止  使用了...");
	}

	@Override
	public void satrtb() {
		System.out.println("蓝牙已经    连接...");
	}

	@Override
	public void stopb() {
		System.out.println("蓝牙已经    断开...");
	}
	
	public void say(){
		System.out.println("这是我独有的一个方法");
	}
}

class ComputerPc{
	public void runUsb(Usb usb){
		usb.satrtu();
	}
	public void stopUsb(Usb usb){
		usb.stopu();
	}
	public void runBlueTooth(BlueTooth bt){
		bt.satrtb();
	}
	public void stopBlueTooth(BlueTooth bt){
		bt.stopb();
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		
		ComputerPc pc1 = new ComputerPc();
		Printer printer1 = new Printer();
		
		pc1.runUsb(printer1);
		pc1.stopUsb(printer1);
		pc1.runBlueTooth(printer1);
		pc1.stopBlueTooth(printer1);
		
		System.out.println("---------------");
		
		//接口和类之间的多态：接口的类型指向实现类的对象
		Usb u = new Printer();
		if (u instanceof Printer ) {
			System.out.println("我是Printer的一个实例");
			//判断，如果是  向下转型
			Printer pp = (Printer) u;
			pp.say();
		}

		
	}
}
