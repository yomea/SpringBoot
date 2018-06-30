package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@CrossOrigin(origins="http://localhost:8080")//细粒度控制跨域，一定要定义请求方法
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() {
		
		return "hello springboot";
	}
	
	@RequestMapping("/map")
	public Map<String, Object> map() {
		Map<String, Object> map = new HashMap<>();
		map.put("hello", "world");
		map.put("a","c");
		map.put("date",new Date());
		return map;
	}
	
	
}
