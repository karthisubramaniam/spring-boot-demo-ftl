package com.kgs.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld(Model model) {
		System.out.println("helloWorld calling...");
		model.addAttribute("name", "Wolrd");
		return "helloworld";
	}
}
