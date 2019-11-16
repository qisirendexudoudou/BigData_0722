package mytest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.standard.PrinterState;

public class test14 {
	
		public static void main(String[] args){
			HashMap<String,ArrayList<String>> map = new HashMap<>();
			
			ArrayList<String> bj = new ArrayList<>();
			bj.add("aa");
			map.put("1", bj);
			
			Set<Entry<String,ArrayList<String>>> entry = map.entrySet();
			for(Entry<String,ArrayList<String>> en : entry){
				System.out.println(en.getKey());
				
				ArrayList<String> value = en.getValue();
				for(String str : value){
					System.out.println("\t" + str);
				}
			}

		}
}
