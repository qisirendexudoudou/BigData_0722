package com.atguigu;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.xpath.internal.operations.Variable;

/*
 * 增删改查：
 * 增：POST请求
 * 删：DELETE请求
 * 改：PUT请求
 * 查：GET请求
 * 
 * 
 * 
 */

@Controller
public class bookContorllerTest {
	@RequestMapping(value="/book/{i}",method=RequestMethod.POST)
	public String addBook(@PathVariable(value="i")String i) {
		System.out.println("添加了"+i+"号图书");
		return "book";
	}
	
	@RequestMapping(value="/book/{i}",method=RequestMethod.GET)
	public String getBook(@PathVariable(value="i")String i) {
		System.out.println("查询了"+ i +"号图书");
		return "book";
	}
	
	@RequestMapping(value="/book/{i}",method=RequestMethod.PUT)
	public String updateBook(@PathVariable(value="i")String i) {
		System.out.println("修改了"+i+"号图书");
		return "book";
	}
	
	@RequestMapping(value="/book/{i}",method=RequestMethod.DELETE)
	public String deleteBook(@PathVariable(value="i")String i) {
		System.out.println("删除了"+i+"号图书");
		return "book";
	}
	

}
