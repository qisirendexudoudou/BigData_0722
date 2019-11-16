package com.atguigu.springmvc.handlers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * 1. 四大域对象
 * 			域对象.setAttribute();
 * 			域对象.getAttribute();
 * 
 * 		使用SpringMVC:
 * 			向域中放数据：
 * 				request域（最常用）：
 * 					①  只需要在处理方法的形参位置声明以下三种类型的参数任意一个即可
 * 					Map,Model,ModelMap，使用参数存放数据即可。
 * 
 * 					这三种类型都使用同一个实现类：org.springframework.validation.support.BindingAwareModelMap.
 * 					使用同一个对象。
 * 						也将这个对象，称为隐含模型！每一次请求，系统都会自动创建一个隐含模型对象，这个对象伴随此次请求的始终。
 * 						隐含模型对象是一个Map，这个Map中存放的所有数据，都会最终放入到请求域！
 * 
 * 					②直接将处理方法的返回值声明为ModelAndView类型
 * 						
 * 				session域：  建议 还是使用原生API
 * 				application域： 建议 还是使用原生API
 */
@Controller
public class TestShareDataHandler {
	
	@RequestMapping(value="/handle7")
	public String handle6(Map map,Model model,ModelMap modelMap) {
		
		map.put("map", map.getClass().getName());
		
		System.out.println(map==model);
		
		System.out.println(map==modelMap);
		
		model.addAttribute("mdoel", model.getClass().getName());
		
		modelMap.addAttribute("modelMap", modelMap.getClass().getName());
	
		
		System.out.println("处理了handle7请求！");

		return "success";
	}
	
	@RequestMapping(value="/handle8")
	public ModelAndView handle8() {
		
		//ModelAndView既包含数据模型，还包含处理后要去往的视图名
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.setViewName("success");
			
			modelAndView.addObject("hello", "hello");
		
		

		return modelAndView;
	}
	
	@RequestMapping(value="/handle9")
	public String handle9(HttpSession sesion) {
		
		sesion.setAttribute("session", "session");
		
		sesion.getServletContext().setAttribute("applicaiton", "applicaiton");
		

		return "success";
	}

}
