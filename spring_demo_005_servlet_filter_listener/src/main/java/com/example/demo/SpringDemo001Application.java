package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.filter.CustomFilter;
import com.example.demo.listener.CustomListener;
import com.example.demo.servler.CustomServlet;

@SpringBootApplication
public class SpringDemo001Application {

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		
		return new ServletRegistrationBean(new CustomServlet(), "/customServlet");
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		//拦截上面那个servlet，如果要拦截所有的，那么就不要传递第二个参数
		return new FilterRegistrationBean(new CustomFilter(), servletRegistrationBean());
	}
	
	@Bean
	public ServletListenerRegistrationBean<CustomListener> listenerRegistrationBean() {
		return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDemo001Application.class, args);
	}
}
