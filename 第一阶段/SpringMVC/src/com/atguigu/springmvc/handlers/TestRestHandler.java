package com.atguigu.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * REST: REST推崇简洁规范的url表达。
 * 			一个复合REST规范的url格式：  /资源类型/资源标识符
 * 				  通过请求方式，表达对资源的操作类型
 * 					GET：  查询资源
 * 					PUT： 修改资源
 * 					POST： 新增资源
 * 					DELETE：删除资源
 * 
 * DELETE和PUT请求怎么发？
 * 		页面---->GET、POST------->处理器---->DELETE/PUT
 * 
 * 		处理器如何知道当前请求方式是什么？
 * 				HttpServletRequest.getMethod(): 查询当前请求的请求方式。
 * 
 * 		创建一个拦截器，拦截器拦截页面的GET/POST请求，将HttpServletRequest.setMethod()将方法设置为PUT/DELETE即可。
 * 			让拦截器改变请求方式！
 * 
 * 		SpringMVC提供了HiddenHttpMethodFilter,在web.xml中配置Filter后！
 * 			页面必须发POST请求，必须提供_method=PUT/DELETE(大小写不敏感)
 * 			
 * 		
 */
@Controller
public class TestRestHandler {
	
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public String addBook() {
		
		System.out.println("添加了１号图书！");
		
		return "success";
		
	}
	
	// /book/1?
	@RequestMapping(value="/book/{id}",method=RequestMethod.GET)
	public String getBook(@PathVariable("id")Integer id) {
		
		System.out.println("查询了"+id+"号图书！");
		
		return "success";
		
	}
	
	@RequestMapping(value="/book/{id}",method=RequestMethod.DELETE)
	public String deleteBook(@PathVariable("id")Integer id) {
		
		System.out.println("删除了"+id+"号图书！");
		
		return "success";
		
	}
	
	@RequestMapping(value="/book/{id}",method=RequestMethod.PUT)
	public String updateBook(@PathVariable("id")Integer id) {
		
		System.out.println("更新了"+id+"号图书！");
		
		
		return "success";
		
	}
	
	

}
