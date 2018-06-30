package com.example.demo;

import java.util.EnumSet;
import java.util.Set;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import com.example.demo.filter.CustomFilter;
import com.example.demo.listener.CustomListener;
import com.example.demo.servler.CustomServlet;

public class CutomInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> sets, ServletContext servletContext) throws ServletException {
		servletContext.addServlet("customServlet", new CustomServlet()).addMapping("/customServlet");
		//为某个servlet在请求时添加拦截
		servletContext.addFilter("customFilter", new CustomFilter()).addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "customServlet");
		servletContext.addListener(CustomListener.class);
	}

}
