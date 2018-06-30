package com.example.demo.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	
	@RequestMapping("/index")
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
