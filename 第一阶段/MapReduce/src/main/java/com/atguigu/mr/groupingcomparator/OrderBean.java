package com.atguigu.mr.groupingcomparator;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.WritableComparable;

public class OrderBean implements WritableComparable<OrderBean>{
	
	private String orderId;
	private String productId;
	private Double amount;
	
	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return orderId + "\t" + productId + "\t" + amount ;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public void write(DataOutput out) throws IOException {
		
		out.writeUTF(orderId);
		out.writeUTF(productId);
		out.writeDouble(amount);
		
	}

	@Override
	public void readFields(DataInput in) throws IOException {
		
		orderId=in.readUTF();
		productId=in.readUTF();
		amount=in.readDouble();
		
	}

	// 二次排序，先按照订单号排序，相同的继续按照amount降序排序
	@Override
	public int compareTo(OrderBean o) {
		
		int result=this.getOrderId().compareTo(o.getOrderId());
		
		// 订单号相同
		if (result==0) {
			
			result=-this.getAmount().compareTo(o.getAmount());
			
		}
		
		return result;
	}
	
	

}
