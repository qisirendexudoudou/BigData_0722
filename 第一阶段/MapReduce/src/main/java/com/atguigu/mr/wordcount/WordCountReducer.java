package com.atguigu.mr.wordcount;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/*
 * 1.声明当前类是个Reducer
 * 
 * 
 * 2. 泛型
 * KEYIN, VALUEIN： 取决于Map输出的Key-value
 *  KEYOUT, VALUEOUT： 自定义
 *  
 *  3. 区别
 *  		Mapper：
 *  		while(context.nextKeyValue()){
 *  			map() 
 *  		}
 *  
 *  		Reducer：
 *  		while(context.nextKey()){
 *  			reduce() 
 *  		}
 *  
 *  Mapper处理完的数据，在传递给Reducer之前，会按key分组！
 *  
 *  举例：
 *  		MapTask:  输入： (0-nice to meet you)...
 *  				  输出：    (nice-1),(to-1),(meet-1),(you-1)
 *  					(nice-1),(to-1),(meet-1),(you-1)
 *  
 * 			ReduceTask: 使用Reducer对象进行处理。
 * 				在进入Reducer之前，数据需要分组和排序！
 * 					[(meet-1),(meet-1)],[(nice-1),(nice-1)]...
 * 
 * 				Reducer一次处理一组数据！
 *  
 */
public class WordCountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
	
	private IntWritable out_value=new IntWritable();
	
	
	@Override
	protected void reduce(Text key, Iterable<IntWritable> values,
			Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
		
		int sum=0;
		// 增强for循环循环遍历迭代器中的数据
		/*for (IntWritable intWritable : values) {
			
		}*/
		Iterator<IntWritable> iterator = values.iterator();
		
		while(iterator.hasNext()) {
			
			IntWritable intWritable = iterator.next();
			
			sum+=intWritable.get();
			
			
		}
		
		out_value.set(sum);
		
		//输出最终结果
		context.write(key, out_value);
		
		
	}
	

}
