package com.rsg.conference.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rsg.conference.models.Registration;

@Controller
public class RegistrationController {
	
	@GetMapping("registration")
	//This module attribute map with module attribute in jsp page 
	public String getRegistration(@ModelAttribute("registration")Registration registration ) 
	{
		return "registration";
	}
	
	@PostMapping("registration")
	public String addRegistration(@Valid @ModelAttribute("registration")Registration registration, 
															BindingResult result) 
	{
		if (result.hasErrors())
		{
			System.out.println("In error returning back");
			return "registration";
		}
		System.out.println("name passed: " + registration.getName());
		return "redirect:registration";
	}

}
