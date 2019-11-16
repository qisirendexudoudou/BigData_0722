package com.atguigu.lgl;

/*
 创建一个char类型的26个元素的数组，分别 放置'A'-'Z‘。
使用for循环访问所有元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> ‘1‘
 * */


/*
十进制	字符
00	00	0	nul	100	40	64	@
01	01	1	soh	101	41	65	A
02	02	2	stx	102	42	66	B
03	03	3	etx	103	43	67	C

 */
public class test1 {
	public static void main(String[] args) {
		char j = 65;
		char[] sr = new char[26];
		for (int i=0;i<sr.length;i++){
			sr[i] = j;
			j++;
//			System.out.println(sr[i]+ ".....");
			System.out.println(sr[i]);
		}
	}
}
