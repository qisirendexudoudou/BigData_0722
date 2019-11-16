package com.atguigu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.dao.Employee;
import com.atguigu.dao.User;
import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;

/*
 * 解决乱码：
 * 		响应乱码：在获取writer之前，调用response.setContype("text/html;charset=UTF-8")
 * 		请求乱码：
 * 			get:修改server配置文件
 * 			post:设置参数
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userdao;
	
    public LoginServlet() {
    	userdao=new UserDaoImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 获取请求参数
		 * 1.request 获取请求报文的参数
		 * 2.response 响应报文的参数
		 */
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		/*
		 * 对用户名和密码进行校验，使用数据库--打印信息至控制台
		 */
/*		try {
			User user = userdao.getUser(username, password);
			//判断空串
			if ("".equals(username) || "".equals(password)) {
				System.out.println("用户名或者密码为空！"); 
			}
			
			if (user==null) {
				System.out.println("用户名或者密码错误，登录失败！");
			} else {
				System.out.println("登录成功！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*
		 * 对用户名和密码进行校验，使用数据库--返回信息至浏览器
		 */
		try {
			User user = userdao.getUser(username, password);
			//设置字符集
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter writer = response.getWriter();
			
			//判断空串
			if ("".equals(username) || "".equals(password)) {
				writer.print("用户名或者密码为空！");
				return;
			}
			
			if (user==null) {
/*				writer.print("用户名或者密码错误，登录失败！");
				//让浏览器重定向到index.html
				String contextPath = request.getContextPath();
				response.sendRedirect(contextPath+"/index.html");*/
				
				//将错误信息保存到request域中
				request.setAttribute("errorinfo", "用户名或者密码错误");
				request.setAttribute("usname", username);
				//将错误信息转发至index.jsp页面  转发不加项目名
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				
				
				
				
			} else {
//				writer.print("登录成功！");
				//request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
				List<Employee> emps = userdao.getAllemps();
				request.setAttribute("emps", emps);
				request.getRequestDispatcher("/pages/list.jsp").forward(request, response);
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
