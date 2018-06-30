package com.example.demo;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.filter.CustomFilter;
import com.example.demo.listener.CustomListener;
import com.example.demo.servler.CustomServlet;

@SpringBootApplication
public class SpringDemo001Application implements ServletContainerInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo001Application.class, args);
	}

	@Override
	public void onStartup(Set<Class<?>> sets, ServletContext servletContext) throws ServletException {
		servletContext.addServlet("customServlet", new CustomServlet()).addMapping("/customServlet");
		//为某个servlet在请求时添加拦截
		servletContext.addFilter("customFilter", new CustomFilter()).addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "customServlet");
		servletContext.addListener(new CustomListener());
		
	}
}
