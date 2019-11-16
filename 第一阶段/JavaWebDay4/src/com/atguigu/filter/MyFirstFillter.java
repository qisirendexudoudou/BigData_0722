package com.atguigu.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstFillter implements Filter{
	
	public MyFirstFillter() {
		System.out.println("MyFirstFillter create!");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
			System.out.println("MyFirstFillter init");
	}

	// 核心方法，一旦拦截到了url，进入此方法处理
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
		
		//response.getWriter().print("get out!");
		
		System.out.println("来到了MyFirstFillter doFilter(),放行前");
		
		// 放行请求
		chain.doFilter(request, response);
		
		System.out.println("来到了MyFirstFillter doFilter()，放行后");
	}

	@Override
	public void destroy() {
		System.out.println("MyFirstFillter destroy");
	}

}
