package com.atguigu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.regexp.internal.recompile;

@Controller
public class helloController {
	
	@RequestMapping(value="/hello2",params={"age"})
	public String controller2() {
		System.out.println("处理了hello2请求！"); 
		//转到ok页面
		return "forward:/ok2.jsp";
	}
	
	@RequestMapping(value="/hello",method= {RequestMethod.GET})
	public String controller() {
		System.out.println("处理了hello请求！");
		//转到ok页面
		return "ok";
	}
	
	@RequestMapping(value= {"/hello3","/hello4"},method={RequestMethod.GET})
	public String controller34() {
		System.out.println("处理了hello3请求，也可以处理hello4请求！");
		//转到ok页面
		return "redirect:/pages/ok.jsp";
	}
	
//	@RequestMapping(value="/hello4")
//	public String controller4() {
//		System.out.println("处理了hello4请求！");
//		//转到ok页面
//		return "redirect:/hello";
//	}

}
