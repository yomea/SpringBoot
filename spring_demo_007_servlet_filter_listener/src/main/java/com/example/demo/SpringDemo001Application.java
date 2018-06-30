package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan//使用注解的方式寻找servlet，filter，listener
@SpringBootApplication
public class SpringDemo001Application{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo001Application.class, args);
	}
}
