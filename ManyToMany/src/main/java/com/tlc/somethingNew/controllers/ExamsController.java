package com.tlc.somethingNew.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tlc.somethingNew.models.Exams;
import com.tlc.somethingNew.models.Students;
import com.tlc.somethingNew.services.ExamsService;
import com.tlc.somethingNew.services.StudentsService;

@Controller

public class ExamsController {
	
	private StudentsService studentsService;
	private ExamsService examsService;
	
	public ExamsController(StudentsService studentsService, ExamsService examsService) {
		this.studentsService = studentsService;
		this.examsService = examsService;
	}
	
	@RequestMapping("/")
	public String root(Model model) {
		model.addAttribute("student", new Students());
		model.addAttribute("exam", new Exams());
		model.addAttribute("exams", examsService.findAll());
		model.addAttribute("students", studentsService.findAll());
		return "index.jsp";
	}
	
	@RequestMapping("/results")
	public String results(Model model){
		model.addAttribute("students", studentsService.findAll());
		model.addAttribute("exams", examsService.findAll());
		return "end.jsp";
	}
	
	@RequestMapping("/delete/student/{id}")
	public String deleteStudent(@PathVariable("id") long id) {
		Students student = studentsService.findById(id);
		studentsService.destroyStudent(student);
		return "redirect:/results";
	}
	
	@RequestMapping("/delete/exam/{id}")
	public String deleteExam(@PathVariable("id") long id) {
		Exams exam = examsService.findById(id);
		examsService.destroyExams(exam);
		return "redirect:/results";
	}
	
	@PostMapping("/student/new")
	public String student(@Valid @ModelAttribute("student") Students student,BindingResult res){
		studentsService.createStudent(student);
		return "redirect:/";	
	}
	
	@RequestMapping("delete/combo/{id}/{other}")
	public String deleteOther(@PathVariable("id") long id, @PathVariable("other") long other) {
		Students student = studentsService.findById(id);
		Exams exam = examsService.findById(other);
		List<Exams> exams = (List<Exams>) student.getExams();
		exams.remove(exam);
		studentsService.createStudent(student);
		return "redirect:/results";
		
	}
	
	@PostMapping("/students/add")
	public String addStudent(Model model, @RequestParam("student") long id, @RequestParam("exam") long number) {
		Students student = studentsService.findById(id);
		Exams exam = examsService.findById(number);
				
		List<Exams> exams = (List<Exams>) student.getExams();
		System.out.println(student);
		System.out.println(exam);
		exams.add(exam);
		studentsService.createStudent(student);
		
		return "redirect:/";
	}
	
	
	@PostMapping("/exam/new")
	public String exam(@Valid @ModelAttribute("exam") Exams exam, BindingResult res) {
		examsService.createExam(exam);
		return "redirect:/";
	}

}