package com.tlc.lookify.controllers;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tlc.lookify.models.lookifyModel;
import com.tlc.lookify.services.lookifyService;


@Controller
@RequestMapping("/")
public class lookifyController {
	private lookifyService lookifyservice;
	
	public lookifyController(lookifyService lookifyservice){
		this.lookifyservice = lookifyservice;
	}
	
	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("dashboard")
	public String main(Model model) {
		model.addAttribute("songs", lookifyservice.all());
		return "main.jsp";
	}

	@RequestMapping("songs/new")
	public String newSong() {
		return "new.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("song") lookifyModel song, BindingResult res, RedirectAttributes flash) {
		if(res.hasErrors()) {
			flash.addFlashAttribute("errs", res.getAllErrors());
			return "redirect:/songs/new";
		}
		else {
			lookifyservice.create(song);
		}
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/songs/{id}")
	public String song(@PathVariable("id") long id,Model model){
		lookifyModel song = lookifyservice.getByIndex(id);		
		model.addAttribute("song",song);
		return "song.jsp";
	}
	
	@PostMapping("/search")
	public String artist(@RequestParam(value="artist") String artist, Model model){
		model.addAttribute("song", lookifyservice.findByArtist(artist));
		return "search.jsp";
	}
	
	@RequestMapping("/songs/top")
	public String topSong(Model model) {
		model.addAttribute("songs", lookifyservice.top());
		return "top.jsp";
	}
	
	@RequestMapping("/delete/{id}")
	public String destroy(@PathVariable("id") long id){
		lookifyservice.destroy(id);
		return "redirect:/dashboard";
	}
	
}
