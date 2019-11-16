package com.atguigu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import com.atguigu.entity.User;


@Controller
public class RequestContorllerTest {
	
	//获取参数--@RequestParam(value="name")
	@RequestMapping(value="/handle1")
	public String handle1(@RequestParam(value="name",
										required=false,
										defaultValue="gouzi"
	)String name,String password) {
		
		System.out.println("处理了handle1请求！");
		System.out.println("username= "+name + "  password= "+password);
		return "handleok";
		
	}

		//获取请求头--@RequestHeader(value="User-Agent")
		@RequestMapping(value="/handle2")
		public String handle2(@RequestHeader(value="User-Agent")String useragent) {
			
			System.out.println("处理了handle2请求！");
			System.out.println("useragent = " +useragent);
			return "handleok";		
		}
		
		//获取cookie--@CookieValue(value="JSESSIONID")
		@RequestMapping(value="/handle3")
		public String handle3(@CookieValue(value="JSESSIONID")String jsessionid) {
			
			System.out.println("处理了handle3请求！");
			System.out.println("jsessionid = " +jsessionid);
			return "handleok";		
		}
		
		//获取表单数据封装为POJO对象
		@RequestMapping(value="/handle4")
		public String handle4(User user) {
			
			System.out.println("处理了handle4请求！");
			System.out.println("user = " +user);
			return "handleok";		
		}
		
		//支持9中传统的API，允许使用原生的javaweb进行操作
		@RequestMapping(value="/handle5")
		public String handle5(HttpServletRequest request,HttpServletResponse response) {
			String name = request.getParameter("username");
			System.out.println(name);
			
			System.out.println("处理了handle5请求！");
			return "handleok";		
		}
	
}
