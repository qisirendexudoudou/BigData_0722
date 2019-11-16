package com.atguigu.mr.nlineinputformat;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;

/*
 * 1. 声明当前类是一个Mapper类
 * 			完成功能：  读取每一行的内容，将当前行，使用空格切分，切分后的每个单词，记1
 * 
 * 			Mapper的输入和输出必须都是key-value格式的数据！
 * 
 * 2. org.apache.hadoop.mapreduce.xxx  (2.0之后定义的新API，推荐使用)
 *    org.apache.hadoop.mapred.xxx (1.0定义的旧的API)
 *    
 * 3. 泛型怎么写？
 * 		key-value需要定义hadoop支持的序列化类型！
 * 		如果没有Reduce，不需要定义序列化类型！
 * 		
 * 		KEYIN, VALUEIN： 由当前job使用的InputFormat中使用的RecordReader决定
 *      KEYOUT, VALUEOUT： 由Mapper自己决定
 *      
 * 4. Hadoop提供了InputFormat类，作为输入格式。InputFormat代表输入的文件的类型。
 * 
 * 			InputFormat作用：
 * 				①验证输入格式的类型
 * 			    ②对输入目录中的多个文件，进行逻辑切片，切分为多个InputSplit对象，每个
 * 					InputSplit对象代表一片，没一片都会交给一个Mapper处理
 * 				③提供RecordReader，负责读取每个切片中的记录，交给Mapper处理
 * 
 * 		根据数据源类型的不同，选择对应的InputFormat。
 * 				输入的数据是文件，使用TextInputFormat(默认).
 * 				默认使用LineRecordReader作为RR！
 * 
 * 		方法：
 * 		public abstract 
    List<InputSplit> getSplits(JobContext context
                               ) throws IOException, InterruptedException： 切片
                               
     public abstract 
    RecordReader<K,V> createRecordReader(InputSplit split,
                                         TaskAttemptContext context
                                        ) throws IOException, 
                                                 InterruptedException： 返回当前使用的记录阅读器
                                                 
   5. LineRecordReader
   				将文件中的一行作为value，将偏移量作为key
   				private LongWritable key;
  				private Text value;
  				
  		在Hadoop中，Map阶段，处理完的数据，还需要继续交给Reduce处理。
  		数据需要序列化。由于Java自带的Serilizable，除了保存值，还会保存其他额外的信息，例如父子结构等。
  		并不适合在Hadoop中使用。
  		
  			Hadoop自定义了Writable的序列化机制。特点只需要保存最核心的值信息。
  			
  	6. 处理逻辑的定义
  			Mapper在调用时，运行其run()
  			
  	setup(context); // 初始化
  	
    try {
    // 判断是否还可以读取下一组输入的key-value
      while (context.nextKeyValue()) {
       // 调用map()来处理key-value
        map(context.getCurrentKey(), context.getCurrentValue(), context);
      }
    } finally {
      cleanup(context);  // 清理工作
    }
    
    7. MapTask会启动多少个？
    		取决于当前输入文件，切多少片。每一片都会启一个MapTask
  				
  	8. 在Mapper中访问当年Job的全局配置
  				JobContext.getConfiguration(). 
  				
  		
 * 			
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	//定义输出的Key-value
	private Text out_key=new Text();
	
	private IntWritable out_value=new IntWritable(1);
	
	//读取每一行的内容，将当前行，使用空格切分，切分后的每个单词，记1
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
			throws IOException, InterruptedException {
		
		String[] words = value.toString().split(" ");
		
		for (String word : words) {
			
			// 封装数据到key中
			out_key.set(word);
			
			// 输出Key-value
			context.write(out_key, out_value);
			
		}
		
		
	}
	

}
