package com.atguigu.springmvc.handlers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.entity.User;

/*
 * 1. 获取请求参数
 * 			原生web:  HttpServletRequest.getParameter("参数名");
 * 
 * 		SpringMVC：  ①直接在处理的方法的形参位置，声明参数接受请求参数即可
 * 						要求：方法位置的形参名称和要请求参数名一致！
 * 
 * 					②如果方法位置的形参名称和要请求参数名不一致！
 * 						使用@RequestParam(value="username")绑定请求参数到指定参数
 * 							属性：value="username"： 强制要求绑定的参数，默认是必须携带
 * 								required=false： 是否必须携带，默认为true
 * 								defaultValue="nodata": 如果绑定失败，提供一个默认值
 * 
 * 					
 * 
 * 2. 获取请求头
 * 			原生web:  HttpServletRequest.getHeader("key");
 * 
 * 			SpringMVC:  使用@RequestHeader获取指定请求头的value属性
 * 
 * 3. 获取cookie中的value属性
 * 			原生web: Cookie [] cookies= HttpServletRequest.getCookies();
 * 					if(cookies !=null){
 * 						for(Cookie c:cookies){
 * 							if(c.getName()=="JESESSIONID"){
 * 									c.getValue();
 * 							}// 获取cookie名
 * 							// 获取cookie值
 * 						}
 * 					}
 *			SpringMVC：  使用@CookieValue完成获取指定cookie的值
 *
 *4. 表单提交了很多信息,我们可以根据表单提交的信息，创建一个数据模型（POJO）
 *			在参数位置声明一个POJO参数，springmvc自动将请求参数，封装到POJO的属性上！
 *			要求：   请求参数 和 POJO的属性名一一对应
 *			
 *			级联属性的封装：  表单的属性名采用 属性名.属性名
 *				User [id=1, username=null, password=123, phone=null]
 *				Phone [brand,type]
 *
 *			将brand和type，称为User对象的级联（关联)属性,属性的属性
 *
 *5. 提供了9种传统API，允许使用原生的javaweb进行操作
 *			HttpServletRequest 
 *			HttpServletResponse
 *			HttpSession
 *
 *6. 乱码问题
 *		请求乱码：
 *			GET：   改tomcat的server.xml
 *			POST：   在第一次获取请求参数前，设置请求编码
 *						request.setCharacterEncoding="utf-8";
 *					springmvc提供了一个Filter---->CharacterEncodingFilter
 *
 *		响应乱码：  CharacterEncodingFilter也能顺便解决
 *
 *		在web.xml中配置CharacterEncodingFilter，设置encoding=xxx,forceEncoding=true
 *
 *7. 获取url路径上的某个变量
 *			使用@PathVarialbe
 *			
 *
 *
 */
@Controller
public class TestHandleRequestHandler {
	
	@RequestMapping(value="/handle1")
	public String handle1(@RequestParam(value="username",required=false,defaultValue="nodata")String name,String age) {
		
		System.out.println("name："+name);
		System.out.println("age："+age);
		
		System.out.println("处理了handle1请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle2")
	public String handle2(@RequestHeader(value="User-Agent",required=false,defaultValue="nodata")String user_agent) {
		
		System.out.println("user_agent："+user_agent);
		
		System.out.println("处理了handle2请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle3")
	public String handle3(@CookieValue(value="JSESSIONID")String JESSIONID) {
		
		System.out.println("JESSIONID："+JESSIONID);
		
		System.out.println("处理了handle3请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle4")
	public String handle4(User user ) {
		
		System.out.println("user："+user);
		
		System.out.println("处理了handle4请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle5")
	public String handle5(HttpServletRequest request ,HttpServletResponse response) {
		
		System.out.println(request.getParameter("jack"));
		
		try {
			response.getWriter().print("hello!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("处理了handle5请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle6/{a}/{b}")
	public String handle6(@PathVariable("a")String a,@PathVariable("b")String b) {
		
		System.out.println(a);
		System.out.println(b);
	
		
		System.out.println("处理了handle6请求！");

		return "success";
	}


}
