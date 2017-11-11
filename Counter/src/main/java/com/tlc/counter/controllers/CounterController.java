package com.tlc.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	
	@RequestMapping("") 
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null){
			session.setAttribute("count",0);
		}else{
			session.setAttribute("count",(Integer) session.getAttribute("count")+1);
		}
		return "index2.jsp";
	}
	
	@RequestMapping("/counter")
	public String mycounter() {
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session){
		session.setAttribute("count",0);
		return "redirect:/your_server/counter";
	}
}
