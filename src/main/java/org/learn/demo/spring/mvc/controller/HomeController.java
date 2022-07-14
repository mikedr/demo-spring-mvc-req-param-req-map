package org.learn.demo.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	String home() {
		return "home";
	}
	
	@RequestMapping("/showform")
	String showTheForm() {
		return "hello-form";
	}
	
	@RequestMapping("/processform")
	String showTheResult() {
		return "hello-user";
	}	
	
	@RequestMapping("/processformV2")
	String showTheResultV2(@RequestParam("username") String name, Model model) {
		
		name = name.toUpperCase();
		
		String result = "Hi "+name;
		
		model.addAttribute("message", result);
		
		return "hello-user";
	}	
}
