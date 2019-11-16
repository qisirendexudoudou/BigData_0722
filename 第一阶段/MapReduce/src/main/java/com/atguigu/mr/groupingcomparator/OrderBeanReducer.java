package com.atguigu.mr.groupingcomparator;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * OrderBean key(orderId,productId,amount)
 * NullWritable(null)
 * (10000001	Pdt_01	222.8-null)
(10000001	Pdt_02	222.8-null)
(10000001	Pdt_05	25.8-null)
 */
public class OrderBeanReducer extends Reducer<OrderBean, NullWritable, OrderBean, NullWritable>{

	@Override
	protected void reduce(OrderBean key, Iterable<NullWritable> values,
			Reducer<OrderBean, NullWritable, OrderBean, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		Double maxValue = key.getAmount();
		
		for (NullWritable nullWritable : values) {
			
			if (!key.getAmount().equals(maxValue)) {
				return ;
			}
			/*if (key.getAmount()!=maxValue) {
				return ;
			}*/
			
			context.write(key, nullWritable);
			
		}
		
	}
	
}
