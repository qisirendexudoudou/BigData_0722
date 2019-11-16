package com.atguigu.mr.custominputformat;

import java.io.IOException;
import java.io.InputStream;

import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.RecordReader;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class MyRecordReader extends RecordReader<Text, BytesWritable> {
	
	private Text key;
	private BytesWritable value;
	
	private Path filePath;
	
	private long size;
	
	private FileSystem fs;
	
	private boolean flag=true;

	
	public MyRecordReader(InputSplit split, TaskAttemptContext context) {

	}

	// 初始化，在读取切片的记录之前调用，只调用一次
	// 只需要声明，系统会自动调用
	@Override
	public void initialize(InputSplit split, TaskAttemptContext context) throws IOException, InterruptedException {
		
		 FileSplit fileSplit = (FileSplit) split;
		 
		 // 获取文件路径
		 filePath = fileSplit.getPath();
		 
		 size= fileSplit.getLength();
		 
		 // 获取当前Job使用的文件系统
		 fs=FileSystem.get(context.getConfiguration());
		
	
	}

	// 读取切片中的数据，为一个key-value，读到，返回true,否则返回flase
	@Override
	public boolean nextKeyValue() throws IOException, InterruptedException {
		
		if (flag) {
			
			// 为key-value赋值
			if (key==null) {
				key=new Text();
			}
			
			if (value==null) {
				value=new BytesWritable();
			}
			
			// 将key封装为文件名称
			key.set(filePath.toString());
			
			// 将value封装为文件中的所有内容
			byte [] content=new byte [(int) size];
			
			FSDataInputStream is = fs.open(filePath);
			
			IOUtils.readFully(is, content, 0, content.length);
			
			IOUtils.closeStream(is);
			
			value.set(content, 0, content.length);
			
			flag=false;
			
			return true;
		}
		
		
		return false;
	}

	// 获取当前读到的key-value中的key
	@Override
	public Text getCurrentKey() throws IOException, InterruptedException {
		return key;
	}

	// 获取当前读到的key-value中的value
	@Override
	public BytesWritable getCurrentValue() throws IOException, InterruptedException {
		return value;
	}

	// 获取读取的进度
	@Override
	public float getProgress() throws IOException, InterruptedException {
		return 0;
	}

	// 最终MapTask的Input关闭时调用
	@Override
	public void close() throws IOException {
		
		if (fs != null) {
			fs.close();
		}
		
	}

}
