package com.atguigu.mr.sort2;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;


/*
 *  (FlowBean,Null),(FlowBean,Null)
 *  
 */
public class SortSumFlowReducer extends Reducer<FlowBean2, NullWritable, FlowBean2, NullWritable>{

	
	
}
