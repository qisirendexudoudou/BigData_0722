package com.atguigu.lgl;

/*
 * 
 * 创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z‘,后10个元素放置'0'-'9‘。
使用for循环访问所有元素并打印出来。

十进制	字符
00	00	0	nul	100	40	64	@
01	01	1	soh	101	41	65	A
02	02	2	stx	102	42	66	B

 */
public class test2 {
	public static void main(String[] args) {
		char n = 48;
		char j = 65;
		char[] sr = new char[36];
		
		for (int i=0;i<sr.length;i++){
			if (i >= 26 ){
				sr[i]= n;
				n++;
			}else{
			sr[i] = j;
			j++;
			}
			System.out.println(sr[i]);

		}
	}

}
