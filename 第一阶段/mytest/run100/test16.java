package run100;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class test16 {

	@Test
	public void test16() throws Exception{
		
		Properties ps = new Properties();
		
		FileInputStream fis = new FileInputStream("info.properties");
		
		ps.load(fis);
		
		String user = ps.getProperty("user");
		System.out.println(user);
		
	}
}
