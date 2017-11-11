package com.tlc.driverlicense.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tlc.driverlicense.models.License;
import com.tlc.driverlicense.models.Person;
import com.tlc.driverlicense.services.LicenseService;
import com.tlc.driverlicense.services.PersonService;

@Controller
@RequestMapping("/")
public class LicenseController {
	private License license;
	
	private LicenseService licenseservice;
	private PersonService personservice;
	
	public LicenseController(LicenseService licenseservice, PersonService personservice){
		this.licenseservice = licenseservice;
		this.personservice = personservice;
	}
	
	@RequestMapping("license")
	public String license(Model model) {
		model.addAttribute("license", new License());
		model.addAttribute("person", personservice.getpall());
		return "license.jsp";
	}
	
	@PostMapping("/newlicense")
	public String createl(@Valid @ModelAttribute("license") License license, @RequestParam("person") Person person, BindingResult res) {
		license.setPerson(person);
		System.out.println(person.getId());
		licenseservice.createLicense(license);
		System.out.println(license.getDate());
		return "redirect:/persons/"+ person.getId();
	}
	
	@RequestMapping("/persons/{person_id}")
	public String profile(@PathVariable("person_id") long id, Model model) {
		System.out.println(id);
		Person person = personservice.getpById(id);
		License license = licenseservice.getlById(id);	
		System.out.println(license);
		model.addAttribute("license",licenseservice.findByPersonId(id));
		model.addAttribute("person", person);
		System.out.println(license.getState());
		return "profile.jsp";
	}
	
}
