package com.atguigu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;
import com.atguigu.entity.User;


/*
 * 乱码的解决：   编码和解码都使用同一字符集。
 * 
 * 1. 解决响应乱码
 * 			在获取writer之前，调用response.setContentType("text/html;charset=UTF-8");
 * 
 * 2. 请求乱码
 * 			get:   参数附加在url后面。
 * 					url由tomcat解析。tomcat默认使用iso-8859-1 编码。
 * 					解决： 在tomcat的所有配置在server.xml中，在8080端口处，配置tomcat使用UTF-8进行编码和解码
 * 			post:  参数在请求体中。
 * 						在解析请求体的参数时，没有使用utf-8编码。
 * 					解决：在第一次获取请求参数前，指定解析请求报文时，使用utf-8编码
 *				 request.setCharacterEncoding("utf-8");
 *
 *3. 重(两次，多次)定（确定）向（方向，请求）： 在发送一次请求后，再次重新确定向哪个url再次发送请求。
 *
 *		原理：      浏览器发送第一次请求，服务器处理请求。
 *				服务器需要通知浏览器，让浏览器继续向其他url再次发送请求。
 *				浏览器就再次发送请求，完成第二次请求。
 *
 *		实现：       浏览器发送第一次请求，服务器处理请求。
 *				服务器需要通知浏览器，服务器会在响应头上添加一个location属性，指向了第二次需要发送请求的url，
 *				并且，服务器会响应浏览器一个302状态码。
 *				
 *				浏览器在收到302状态码之后，继续向响应头Location属性所在的url发送第二次请求。
 *
 *				response.sendRedirect("url");
 *
 *4. 转发
 *			转发一般是在服务器内部完成。
 *			当一个servlet处理请求时，没有处理完，此时它不会响应客户端。
 *			将已经处理好的request，继续交给下一个servlet处理，由最终完成的servlet响应浏览器。
 *			这个过程，称之为转发！
 *
 *		解决：        
 *			
 *				
 *		
 */
public class LoginServlet extends HttpServlet {
	
	private UserDao userDao;
       
   
    public LoginServlet() {
      
    	userDao=new UserDaoImpl();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 指定request使用utf-8解析
		request.setCharacterEncoding("utf-8");
		
		// 如果请求参数没有传(没有带指定的参数名)，那么获取到的value就是null 。获取请求参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//String aaa = request.getParameter("aaa");
		
		System.out.println(username+"=====》"+password);
		
		// 设置响应内容的类型和编码，必须在获取writer之前设置
		//  设置响应报文的编码为utf-8，告诉浏览器响应的内容类型是文本。
		//  不加text/html，默认不会以文件来解释响应内容。默认以application来解释。
		response.setContentType("text/html;charset=UTF-8");
		
		//response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		// 不需要做Null值判断
		if ("".equals(username) || "".equals(password)) {
			
			writer.print("用户名和密码非法！");
			
			return;
		}
		
		// 对用户名和密码进行校验（查询数据库）
		try {
			User user = userDao.getUserByUserNameAndPassword(username, password);
			
			
			if (user==null) {
				
				//writer.print("用户名和密码错误！");
				// context_root
				//String contextPath = request.getContextPath();
				
				// 让浏览器重新定向到 Index.html页面,重定向是由浏览器发送第二次请求，url需要加上项目名
				//response.sendRedirect(contextPath+"/index.html");
				
				// 将错误信息保存到request域中
				request.setAttribute("errorInfo", "用户名和密码错误！");
				
				request.setAttribute("usname", username);
				
				// 将错误信息转发到index.jsp页面,转发不加项目名
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				

			}else {
				
				writer.print("用户名和密码正确！");
				
				
				request.getRequestDispatcher("/WEB-INF/hello.jsp").forward(request, response);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
