package run100;

import sun.applet.Main;

public class fujia {

		    public static void main(String[] args) {
		        System.out.println(test("aabbccdd", "ss", "ww"));
		    }
		    public static String test(String str, String replace, String oldstr) {

		        char[] ch = str.toCharArray();//讲字符串装换成字符数组
		        int index = str.indexOf(oldstr);
		        if (index != -1) {
		            int newl = replace.length();
		            int len = index + newl;
		            char[] ch1 = replace.toCharArray();
		            int flag = 0;
		            for (int i = 0; i < ch.length; i++) {
		                if (i >= index && i < len) {
		                    for (int j = flag; j < ch1.length; j++) {
		                        ch[i] = ch1[j];
		                    }
		                    flag++;
		                }

		            }
		        }
		        String s = new String(ch);
		        return s;
		    
	}

}
