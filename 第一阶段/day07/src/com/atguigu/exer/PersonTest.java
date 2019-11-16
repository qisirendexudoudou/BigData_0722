package com.atguigu.exer;

class Person{
	/*
	 * 瑕佹眰锛�(1)鍒涘缓Person绫荤殑瀵硅薄锛岃缃瀵硅薄鐨刵ame銆乤ge鍜宻ex灞炴�э紝璋冪敤study鏂规硶锛�
	 * 杈撳嚭瀛楃涓测�渟tudying鈥濓紝璋冪敤showAge()鏂规硶鏄剧ずage鍊硷紝璋冪敤addAge()鏂规硶缁欏璞＄殑age灞炴�у�煎鍔�2宀併��
(2)鍒涘缓绗簩涓璞★紝鎵ц涓婅堪鎿嶄綔锛屼綋浼氬悓涓�涓被鐨勪笉鍚屽璞′箣闂寸殑鍏崇郴銆�

	 */
	
	public String name;
	public int age;
	public int sex;
	
	//缁檃ge澧炲姞2宀佸悓鏃惰繑鍥炲勾绾�
	public int addAge(int i){
		age += i;
		return age;
	}
	
	//闇�姹傦細 璋冪敤showAge()鏂规硶鏄剧ずage鍊�
	public void showAge(){
		System.out.println(age);
	}
	
	//闇�姹傦細 杈撳嚭瀛楃涓测�渟tudying鈥�
	public void study(){
		System.out.println("studying");
	}
	
}
public class PersonTest {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name = "灏忓己鍝�";
		p.age = 38;
		p.sex = 0;
		
		p.showAge(); //鏄剧ず骞寸邯  38
		p.study();//鏄剧ず瀛︾敓涔犱腑
		p.addAge(2);
		p.showAge(); //40
	}

}
