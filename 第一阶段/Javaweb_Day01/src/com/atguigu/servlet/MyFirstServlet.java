package com.atguigu.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//  servlet是单例的
//  servlet在处理第一次请求时，才创建
//  servlet在服务器关闭，应用卸载时执行
//  构造器----init(1次)----service(N次)-----destroy(1次)
public class MyFirstServlet implements Servlet{
	
	public MyFirstServlet() {
		System.out.println("MyFirstServlet created!");
	}

	// init初始化，在MyFirstServlet对象被创建后，只调用一次
	@Override
	public void init(ServletConfig config) throws ServletException {
		
		System.out.println("MyFirstServlet init");
		
	}

	// 返回ServletConfig（代表servlet的配置对象）
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	//  处理请求，响应页面
	// ServletRequest：  代表请求报文，tomcat会将请求报文中的信息自动封装为一个ServletRequest对象
	// ServletResponse：   代表响应报文，服务器响应的内容，使用当前对象进行封装。
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("MyFirstServlet service");
		
	}

	// 返回servelt的说明信息
	@Override
	public String getServletInfo() {
		return null;
	}

	// 在tomcat 卸载servlet（伴随tomcat shutdown时，会卸载所有的web项目）时执行
	@Override
	public void destroy() {
		
		System.out.println("MyFirstServlet destroy");
	}

}
