package com.example.demo.controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class IndexController {
	
	@CrossOrigin(origins="http://localhost:8080")//细粒度控制跨域，一定要定义请求方法
	@RequestMapping(value="/index",method=RequestMethod.POST)
	public String index(@RequestParam("file") MultipartFile file) {
		
		if(file.isEmpty()) {
			return "文件不能为空！";
		}
		
		return "上传成功！";
	}
	
	public static void main(String[] args) throws ParserConfigurationException {
		
	}
	
}
