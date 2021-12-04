package com.jboss7.spring.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hello, Application is running on JBOSS EAP 7.4";
		
	}

}
