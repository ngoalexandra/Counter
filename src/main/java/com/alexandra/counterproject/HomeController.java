package com.alexandra.counterproject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/your_server")
public class HomeController {
	@RequestMapping("")
	public String home(HttpSession session) {
//		setting session count = 0
		session.setAttribute("count", 0);
		return "index.jsp";
		
	}
	@RequestMapping("/counter")
	public String count(HttpSession session) {
//		getting count session and creating a variable
		Integer counter = (Integer) session.getAttribute("count");
		counter ++;
//		you have to set session again because the count changes and it doesn't know what counter is. 
//		Since we are only setting counter
		session.setAttribute("count", counter);
		return "count.jsp";
	}
	
	

}
