package com.atguigu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public HelloServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 创建
		Cookie cookie1 = new Cookie("name", "jack");
		Cookie cookie2 = new Cookie("age", "18");
		
		// 设置cookie2的属性
		cookie2.setMaxAge(60*10);
		cookie2.setPath(request.getContextPath()+"/login");
		
		// 保存到浏览器
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		// 
		System.out.println("来到了helloServlet");
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
