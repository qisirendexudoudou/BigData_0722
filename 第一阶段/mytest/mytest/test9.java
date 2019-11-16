package mytest;

public class test9 {

	public static void main(String[] args) {

		
		AA aa = new AA(1,"22");
		aa.getName();
		
		AA.say();
		
		 String name = AA.a.getName();
		 System.out.println(name);
		
		
		
		
	}

}

class AA{
	  int age;
	  String name ="中国";
	  final static AA a = new AA(12,"ha");
	 
	 {
		 
	 }
	 static{
		 
		 
	 }
	
	public AA(int age,String name){
		this.age = age;
		this.name = name;
		
	}
	public static void say(){
		System.out.println("haha");
	}
	public  int getA() {
		return age;
	}
	public void setA(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}