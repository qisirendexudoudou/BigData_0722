package com.atguigu.lgl;


//接口与类之间的多态性

/*interface Usb{
	public abstract void satrtu();
	public abstract void stopu();
}

interface BlueTooth{
	public abstract void satrtb();
	public abstract void stopb();
}

//打印机连接鼠标和蓝牙
class Printer implements BlueTooth {

//	@Override
//	public void satrtu() {
//		System.out.println("鼠标  开始  使用了...");
//	}
//
//	@Override
//	public void stopu() {
//		System.out.println("鼠标  停止  使用了...");
//	}

	@Override
	public void satrtb() {
		System.out.println("蓝牙已经    连接...");
	}

	@Override
	public void stopb() {
		System.out.println("蓝牙已经    断开...");
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

public class InterfaceTest2_2 {
	public static void main(String[] args) {
		//方式二
		Usb usb2 = new Usb() {
			
			@Override
			public void stopu() {
				System.out.println("鼠标  停止  运行了");
			}
			
			@Override
			public void satrtu() {
				System.out.println("鼠标  开始   运行了");
			}
		};
		
		new ComputerPc().runUsb(usb2);
	}
}
*/