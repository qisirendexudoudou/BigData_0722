package mytest;
import java.util.Arrays;

public class test5 {
	public static void main(String[] args) {
		
		char[] s1 = "ABCDEF".toCharArray();
		System.out.println(Arrays.toString(s1));
		int i = 0;
		while(s1[i++] != '0')
		System.out.println(s1[i++]);
	}
	}
