package com.atguigu;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShardDataContorllerTest {

	@RequestMapping(value="/handle7")
	public String handle7(Map map,Model model,ModelMap modelMap) {
		
		map.put("map", map.getClass().getName());
		Model model2 = model.addAttribute("model", model.getClass().getName());
		ModelMap modelMap2 = modelMap.addAttribute("modelMap", modelMap.getClass().getName());
		
		System.out.println("处理了handle7请求！");
		System.out.println(model2);
		return "sharddata";
	} 
}
