package com.atguigu.mr.groupingcomparator;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class OrderIdComparator extends WritableComparator{
	
	public OrderIdComparator() {
		super(OrderBean.class,new Configuration(),true);
	}
	
	@Override
	public int compare(WritableComparable a, WritableComparable b) {
		
		OrderBean o1=(OrderBean) a;
		OrderBean o2=(OrderBean) b;
		
		return o1.getOrderId().compareTo(o2.getOrderId());
	}

}
