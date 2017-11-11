package com.tlc.DojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DojoSurveyController {

		@RequestMapping("/")
		public String index(){
			return "index.jsp";
		}
		
		@RequestMapping(path="/results", method=RequestMethod.POST)
		public String results(@RequestParam(value="name") String name, 
							@RequestParam(value="location") String location, 
							@RequestParam(value="language") String language, 
							@RequestParam(value="comments") String comments, HttpSession session) {
			session.setAttribute("name", name);
			session.setAttribute("location", location);
			session.setAttribute("language", language);
			session.setAttribute("comments", comments);
			
			return "redirect:/result";
		}
		
		@RequestMapping("/result")
		public String survey(HttpSession session) {
			System.out.println(session.getAttribute("name"));
			return "home.jsp";
		}
}
