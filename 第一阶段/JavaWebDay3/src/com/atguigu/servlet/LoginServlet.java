package com.atguigu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;
import com.atguigu.entity.Employee;
import com.atguigu.entity.User;



public class LoginServlet extends HttpServlet {
	
	private UserDao userDao;
       
   
    public LoginServlet() {
      
    	userDao=new UserDaoImpl();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 指定request使用utf-8解析
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
				
		// 不需要做Null值判断
		if ("".equals(username) || "".equals(password)) {
						
			return;
		}
		
		// 对用户名和密码进行校验（查询数据库）
		try {
			User user = userDao.getUserByUserNameAndPassword(username, password);
			
			
			if (user==null) {
				
				// 将错误信息保存到request域中
				request.setAttribute("errorInfo", "用户名和密码错误！");
				
				request.setAttribute("usname", username);
				
				// 将错误信息转发到index.jsp页面,转发不加项目名
				request.getRequestDispatcher("/index.jsp").forward(request, response);
				

			}else {
				
				// 向用户显示一个所有员工信息的列表页面
				List<Employee> emps = userDao.getAllEmps();
				
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
