package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 在springmvc中，只能在控制器上标注@Controller

/*
 * 1. 当容器中配置了视图解析器后，所有的方法返回的视图名，都需要经过拼接后，再转发
 * 
 * 2. 转发操作，不会被视图解析器拼接视图名
 * 			使用： forward:+视图地址(绝对路径)
 * 				加上forward:的视图名，不会经过视图解析器解析的！
 * 
 * 3. 重定向： 使用： redirect:+视图地址(绝对路径,无需加项目名)
 * 				不会被视图解析器拼接视图名
 */
@Controller
public class HelloHandler {
	
	@RequestMapping(value="/hello")
	public String handle1() {
		
		System.out.println("处理了hello请求！");
		
		//处理完后，转发到一个success.jsp页面
		// 要转发页面的地址返回即可
		
		///pages/success1.jsp
		// pages/success.jsp
		return  "success";
	}
	
	@RequestMapping(value="/hello2")
	public String handle2() {
		
		System.out.println("处理了hello2请求！");
			
		// /pages/xxx/xx/xx/xx/xx/xxx/xx/success.jsp
		// /success.jsp
		return  "forward:/success.jsp";
	}
	
	@RequestMapping(value="/hello3")
	public String handle3() {
		
		System.out.println("处理了hello3请求！");
			
		
		return  "redirect:/hello";
	}

}
