package com.atguigu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.UserDaoImpl;
import com.atguigu.entity.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Servlet implementation class QueryAllEmpsServlet
 */
public class QueryAllEmpsServlet extends HttpServlet {
	
	private UserDao userDao;
       
    
    public QueryAllEmpsServlet() {
    	userDao=new UserDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		try {
			List<Employee> allEmps = userDao.getAllEmps();
			
			// 以json格式将查询的数据输出到浏览器
			Gson gson = new Gson();
			
			String jsonStr = gson.toJson(allEmps);
			
			response.setContentType("text/html;charset=utf-8");
			
			response.getWriter().print(jsonStr);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
