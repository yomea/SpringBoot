package com.example.demo.controller;

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
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<>();
		map.put("hello", "world");
		map.put("a","c");
		return map;
	}
	
	
}
