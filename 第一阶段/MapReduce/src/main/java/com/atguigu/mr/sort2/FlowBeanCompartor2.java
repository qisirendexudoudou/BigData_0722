package com.atguigu.mr.sort2;


import java.io.IOException;

import org.apache.hadoop.io.DataInputBuffer;
import org.apache.hadoop.io.RawComparator;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.io.WritableComparable;


public class FlowBeanCompartor2 implements RawComparator<FlowBean2>{
	
	 private final DataInputBuffer buffer;
	 private final FlowBean2 key1;
	 private final FlowBean2 key2;
	 
	 public FlowBeanCompartor2() {
		 
		 buffer=new DataInputBuffer();
		 key1=new FlowBean2();
		 key2=new FlowBean2();
		 
	}
	 

	@Override
	public int compare(FlowBean2 o1, FlowBean2 o2) {
		return -o1.getSumFlow().compareTo(o2.getSumFlow());
	}

	@Override
	public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
		 try {
		      buffer.reset(b1, s1, l1);                   // parse key1
		      key1.readFields(buffer);
		      
		      buffer.reset(b2, s2, l2);                   // parse key2
		      key2.readFields(buffer);
		      
		      buffer.reset(null, 0, 0);                   // clean up reference
		    } catch (IOException e) {
		      throw new RuntimeException(e);
		    }
		    
		    return compare(key1, key2);      
	}
	
	
}
