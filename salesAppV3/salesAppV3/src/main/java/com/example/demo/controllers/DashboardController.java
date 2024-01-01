package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/***
 * @RequestMapping is a general-purpose handles requests of any HTTP method,
 *  @GetMapping is specifically for GET requests, enhances the clarity and readability 
 */





@Controller
public class DashboardController {
	
	@GetMapping("/")
	public String rootView() {
		return "index";
	}
	
	

}
