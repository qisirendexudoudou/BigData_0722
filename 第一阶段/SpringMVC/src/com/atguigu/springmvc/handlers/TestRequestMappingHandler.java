package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/*
 * 1. 当前项目中，不能出现@RequestMapping一模一样的两个方法
 * 
 * 2.@RequestMapping：
 * 		标注在方法上：　为方法映射处理的url
 *		 标注在类上:   为当前类的所有的方法的@RequestMapping加上一层父路径
 *
 *		属性：  String[]  value: 限制url，匹配多个url
 *			RequestMethod [] method:   限定当前访问url的请求方式
 *				如果请求方式不匹配，报错 405 - Request method 'GET' not supported
 *			String [] params:  限定当前请求必须携带复合规则的参数
 *				        age:  必须携带名为age的参数
 *						!age：  不能携带名为age的参数
 *						age=20: 必须携带age=20
 *						age!=20: 必须携带age，且不等于20
 *					
 *			String [] headers： 限定当前请求必须携带复合要求的请求头
 * 			
 */
@RequestMapping(value="/test")
@Controller
public class TestRequestMappingHandler {
	
	@RequestMapping(value= {"/hello","/handle2"},
			method= {RequestMethod.POST,RequestMethod.GET},
			headers= {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.81 Safari/537.36"},
			params= {"age=20"})
	public String handle1() {
		
		System.out.println("处理了hello请求！");
		
		return  "success";
	}

}
