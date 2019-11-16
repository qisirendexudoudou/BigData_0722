package com.atguigu.mr.flowbean;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class FlowBean implements Writable{
	
	private  long upFlow;
	private  long downFlow;
	private  long sumFlow;
	public Long getUpFlow() {
		return upFlow;
	}
	public void setUpFlow(Long upFlow) {
		this.upFlow = upFlow;
	}
	public Long getDownFlow() {
		return downFlow;
	}
	public void setDownFlow(Long downFlow) {
		this.downFlow = downFlow;
	}
	public Long getSumFlow() {
		return sumFlow;
	}
	public void setSumFlow(Long sumFlow) {
		this.sumFlow = sumFlow;
	}
	
	// 序列化，将对象的属性写到磁盘
	// 序列化和反序列化顺序要一致
	@Override
	public void write(DataOutput out) throws IOException {
		
		out.writeLong(upFlow);
		out.writeLong(downFlow);
		out.writeLong(sumFlow);
		
		
	}
	
	// 反序列化，从磁盘读取对象的属性
	@Override
	public void readFields(DataInput in) throws IOException {
		
		upFlow=in.readLong();
		downFlow=in.readLong();
		sumFlow=in.readLong();
		
	}
	
	// 上行\t下行\t总流量
	@Override
	public String toString() {
		return upFlow + "\t" + downFlow + "\t" + sumFlow ;
	}
	
	
	

}
