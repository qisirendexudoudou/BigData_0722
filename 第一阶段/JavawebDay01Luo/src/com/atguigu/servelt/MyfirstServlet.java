package com.atguigu.servelt;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 1.servlet是单例，是在处理第一次请求时才创建
 * 
 * 
 */
public class MyfirstServlet implements Servlet{
	
	
	public MyfirstServlet() {
		System.out.println("MyfirstServlet create!");
	}

	@Override
	public void destroy() {
		System.out.println("MyfirstServlet destroy()");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("MyfirstServlet init()");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("MyfirstServlet service()");
		
	}

}
