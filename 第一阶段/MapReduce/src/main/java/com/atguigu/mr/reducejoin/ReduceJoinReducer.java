package com.atguigu.mr.reducejoin;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

// 只需要处理来自于order.txt的key-value
public class ReduceJoinReducer extends Reducer<NullWritable, JoinBean, JoinBean, NullWritable>{

	// 分类pd.txt中的信息
	private Map<String, String> pdInfo=new HashMap<>();
	// order.txt中需要Join的数据
	private List<JoinBean> dataToProcess=new ArrayList<JoinBean>();
	// reduce中只能分类，不能合并
	@Override
	protected void reduce(NullWritable key, Iterable<JoinBean> values,
			Reducer<NullWritable, JoinBean, JoinBean, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		for (JoinBean joinBean : values) {
			
			if (joinBean.getSource().equals("order.txt")) {
				
				// 在迭代时，key-value只会创建一次，每次迭代都是将下一组key-value的值赋值给当前的key-value对象 
				
				JoinBean data = new JoinBean();
				
				try {
					BeanUtils.copyProperties(data, joinBean);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				
				dataToProcess.add(data);
				
				
			}else {
				
				pdInfo.put(joinBean.getPid(), joinBean.getPname());
				
			}
			
		}
		
	}
	
	// 最终将分类完的数据写出
	@Override
	protected void cleanup(Reducer<NullWritable, JoinBean, JoinBean, NullWritable>.Context context)
			throws IOException, InterruptedException {
		
		for (JoinBean joinBean : dataToProcess) {
			
			// 真正的Join
			joinBean.setPname(pdInfo.get(joinBean.getPid()));
			
			context.write(joinBean, NullWritable.get());
			
		}
		
	}
	
}
