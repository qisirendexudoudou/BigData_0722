package com.atguigu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;


public class ValidUsernameServlet extends HttpServlet {

	private UserDao userDao;
       
   
    public ValidUsernameServlet() {
       
    	userDao=new UserDaoImpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String username = request.getParameter("username");
			
			response.setContentType("text/html;charset=utf-8");
			
			try {
				boolean ifExist = userDao.validUsernameExist(username);
				
				if (!ifExist) {
					
					response.getWriter().print("用户名不存在，请检查后再填写！");
					
				}else {
					
					response.getWriter().print("");
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
