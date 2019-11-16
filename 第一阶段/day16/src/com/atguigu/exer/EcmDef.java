package com.atguigu.exer;

/**
 * 快捷键 ：　alt + shift + z
 * @author Administrator
 *
 */
public class EcmDef {

	public static void main(String[] args) {
		
		try {
			//获取两个数据
			String s = args[0];
			String s2 = args[1];
			//将String转成基本数据类型
			int n1 = Integer.parseInt(s);
			int n2 = Integer.parseInt(s2);
			//验证输入的数是否是负数
			volidate(n1, n2);
			//运算
			System.out.println(n1 / n2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("缺少命令行参数");
		} catch(NumberFormatException e){
			System.out.println("数据类型不一致");
		} catch(ArithmeticException e){
			System.out.println("不能除0");
		} catch (EcDef e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 验证输入的值是否是负数
	 * @param n1
	 * @param n2
	 */
	public static void volidate(int n1,int n2) throws EcDef{
		if(n1 < 0 || n2 < 0){
			throw new EcDef("不能是负数");
		}
	}
}
