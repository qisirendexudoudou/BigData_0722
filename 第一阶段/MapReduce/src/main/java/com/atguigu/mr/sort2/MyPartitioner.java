package com.atguigu.mr.sort2;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/*
 * <KEY, VALUE>: 分区器计算的key-value类型
 */
public class MyPartitioner extends Partitioner<FlowBean2, NullWritable>{

	// 计算一组key-value的分区号
	// numPartitions启动的reduceTask的数量
	//  136,137,138,139各位于一个分区，其他在另一个分区
	@Override
	public int getPartition(FlowBean2 key, NullWritable value, int numPartitions) {
		
		String keyPreStr = key.getPhoneNum().substring(0, 3);
		
		int partitonNum=0;
		
		switch (keyPreStr) {
		case "136":
			partitonNum=numPartitions-1;
				break;
		case "137":
			partitonNum=numPartitions-2;
				break;
		case "138":
			partitonNum=numPartitions-3;
				break;
				
		case "139":
			partitonNum=numPartitions-4;
				break;
		default:
			break;
		}
		
		
		return partitonNum;
	}

}
