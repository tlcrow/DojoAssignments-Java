package com.tlc.driverlicense.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tlc.driverlicense.models.Person;
import com.tlc.driverlicense.services.PersonService;

@Controller
@RequestMapping("/")
public class PersonController {

@Autowired
private PersonService personservice;
	public PersonController(PersonService personservice){
		this.personservice = personservice;
	}
	
	@RequestMapping("")
	public String person(Model model) {
		model.addAttribute("person", new Person());
		return "index.jsp";
	}

	@PostMapping("/newperson")
	public String createp(@Valid @ModelAttribute("person") Person person, BindingResult res, HttpSession session) {
		if(res.hasErrors()) {
			return "redirect:/";
		}
		session.setAttribute("person", person);
		personservice.createPerson(person);
		return "redirect:/license";
	}
	
	
}
