package com.Vaccination.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Vaccination.entity.Citizen;
import com.Vaccination.entity.VaccineCenter;
import com.Vaccination.service.CenterService;
import com.Vaccination.service.CitizenService;



@Controller
public class UserController {
	@Autowired
	private CenterService cc; 

	@Autowired
	private CitizenService cs;
	
	
	@GetMapping("/login")
    public String showLoginForm() {
        return "login"; 
    }
	  @GetMapping("/register")
	    public String showRegistrationForm() {
	        return "register"; 
	    }
	
	   
	  }

