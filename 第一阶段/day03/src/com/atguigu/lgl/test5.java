package com.atguigu.lgl;


/*

	�߼��������
		&���߼���         | ���߼���         �����߼���
		&& ����·��      || ����·��        ^ ���߼���� 

	˵����
		1.&��&& �����߶�Ϊtrue���Ϊtrue(ֻҪ��һ��Ϊfalse���Ϊfalse)
		2.|��|| �����߶�Ϊfalse���Ϊfalse(ֻҪ��һ��Ϊtrue���Ϊtrue)
		3.! : ȡ��
		4.^ :��ͬΪfalse����ͬΪtrue
	
	�ص� ��
		1.�߼��������������������ǲ�������
		2.�߼�������Ľ��Ϊ��������

*/

//test1


public class test5
{
	public static void main(String[] args){
		int x1=1;
		int y1=1;
			if(x1++==2 & ++y1==2){// 1 == 2 false & 2 == 2 true   ���Ϊfalse
				x1 =7; // ��ִ��
			}
			
System.out.println("x1="+x1+",y1="+y1); // 2,2


//test2
	int x2 = 1,y2 = 1;
	if(x2++==2 && ++y2==2){//1==2 false && ��ִ����  ���Ϊflase
	x2 =7; // ��ִ��
}
System.out.println("x2="+x2+",y2="+y2);// 2,1


//test3
	int x3 = 1,y3 = 1;
	if(x3++==1 | ++y3==1){ // 1==1 | 2==1 ���Ϊtrue
		x3 =7;// ִ��
}
System.out.println("x3="+x3+",y3="+y3); //7,2

//test4
	int x4 = 1,y4 = 1;
	if(x4++==1 || ++y4==1){//1==1 || ��ִ���� Ϊtrue
		x4 =7;
}
System.out.println("x4="+x4+",y4="+y4); //7,1

	}
}