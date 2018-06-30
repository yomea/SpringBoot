package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.IndexController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemo001ApplicationTests {

	private MockMvc mvc;
	
	@Before
	public void before() {
		this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
	}
	
	@Test
	public void contextLoads() throws Exception {
		//创建请求
		RequestBuilder requestBuilder = get("/index");
		
		mvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(MockMvcResultMatchers.content().string("hello springboot"));
		
		
	}
	

}
