package com.skillsoft.springboot.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController{
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "This is the main page of war";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome to Spring Boot war";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hello Spring Boot war";
	}
}