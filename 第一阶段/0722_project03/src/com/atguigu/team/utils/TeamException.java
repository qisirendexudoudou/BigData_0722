package com.atguigu.team.utils;

/**
 * 自定义的异常类
 * @author Administrator
 *
 */
public class TeamException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4442554082261643598L;

	public TeamException(){
		
	}
	
	public TeamException(String message){
		super(message);
	}
}
