package run100;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test18 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("test_gbk.txt");
		InputStreamReader isr = new InputStreamReader(fis, "GBK");

		FileOutputStream fos = new FileOutputStream("test_utf8.txt");
		OutputStreamWriter oos = new OutputStreamWriter(fos, "UTF-8");

		char[] data = new char[10];
		int len;
		while ((len = isr.read(data)) != -1) {
			oos.write(data, 0, len);
		}

		isr.close();
		fis.close();
		oos.close();
		fos.close();
	}
}