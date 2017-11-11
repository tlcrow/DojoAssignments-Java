package com.tlc.loginandreg.controllers;

import java.security.Principal;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tlc.loginandreg.models.User;
import com.tlc.loginandreg.services.UserService;
import com.tlc.loginandreg.validator.UserValidator;

@Controller
public class Users {
    private UserService userService;
    private UserValidator userValidator;
    
    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
    
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        // 1
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        System.out.println("Why?");
        return "homePage.jsp";
    }
    
    @RequestMapping({"/login", "/registration"})
    public String registerForm(@Valid @ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
    	if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
        return "registrationPage.jsp";
    }
    
    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        // NEW
        userValidator.validate(user, result);

        if (result.hasErrors()) {
            return "registrationPage.jsp";
        }
        if(userService.findByUsername(user.getUsername()) != null) {
        	 	model.addAttribute("errorMessage", "Username already exist. Please login.");
        		return "loginPage.jsp";
        }
        userService.saveWithUserRole(user);
        model.addAttribute("errorMessage", "Email created. Please login.");
        return "registrationPage.jsp";
    }

}

