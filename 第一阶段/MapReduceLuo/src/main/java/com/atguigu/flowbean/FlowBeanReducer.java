package com.atguigu.flowbean;

import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class FlowBeanReducer extends Reducer<Text, FlowBean, Text, FlowBean>{

	private FlowBean out_value=new FlowBean();
	
	@Override
	protected void reduce(Text key, Iterable<FlowBean> values, Reducer<Text, FlowBean, Text, FlowBean>.Context context)
			throws IOException, InterruptedException {
	
		long sumupFlow=0;
		long sumdownFlow=0;
		for (FlowBean flowBean : values) {
			
			sumupFlow+=flowBean.getUpFlow();
			sumdownFlow+=flowBean.getDownFlow();
			
		}
			out_value.setUpFlow(sumupFlow);
			out_value.setDownFlow(sumdownFlow);
			out_value.setSumFlow(sumupFlow+sumdownFlow);
			
			//写出
			context.write(key, out_value);
			
	}
}
