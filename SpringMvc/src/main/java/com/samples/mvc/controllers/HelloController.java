package com.samples.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	public String printWelcome(ModelMap model) {
		 
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
 
	}

}
