package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.StyledEditorKit.ItalicAction;

import org.junit.Test;

public class CollectionTest{

	@Test
	public void test1(){
		Collection list = new ArrayList();
		list.add("aa");
		list.add("bb");
		System.out.println(list.size());
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		for (Object object : array) {
		System.out.println(object);	
		}
	}
	
	
	@Test
	public void test(){
		
		String[] names = {"aa","cc"};
		
		List asList2 = Arrays.asList(names);
		List asList = Arrays.asList(new String[]{"aa","bb","cc"});
		
		for (Object o : asList2) {
			System.out.println(o);
		}
		
		System.out.println("----------------------");
		for (Object obj : asList) {
			System.out.println(obj);
		}
	}
	
	@Test
	public void test3(){
		String[] str = {"a","b","d"};
		List list = Arrays.asList(str);
		System.out.println(list.size());
		list.set(0, "cc");
//		list.add("ff");
		
		
		for (Object object : list) {
			System.out.println(object);
		}
		
//		public static void main(String[] args) {
//			Integer[] datas = {1,2,3,4,5};
//			List<Integer> list = Arrays.asList(datas);
//			list.add(5);
//			System.out.println(list.size());
		
		
	}
}
