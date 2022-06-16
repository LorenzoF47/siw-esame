package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PortaleController {
	@Autowired BuffetService buffetService;
	@Autowired ChefService chefService;
	@Autowired IngredientiService ingredientiService;
	@Autowired PiattoService piattoService;
	
	@PostMapping("/user")
	public String getUser() {
		return "user.html";
	}
	
	
	@PostMapping("/user/{id}")
	public String getUser(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("user", this.userService.findById(id));
	    return "user.html";
	  }

	@PostMapping("/admin")
	public String getAdmin() {
		return "admin.html";
	}
	
	@PostMapping("/admin/{id}")
	public String getAdmin(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("user", this.userService.findById(id));
		return "admin.html";
	}

	@GetMapping("/utente")
	public String getUser(@PathVariable("id") Long id, Model model) {
		return "user.html";
	}
	
	@GetMapping("/utente/{id}")
	public String getUser(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("user", this.userService.findById(id));
		return "user.html";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "admin.html";
	}
	
	@GetMapping("/admin/{id}")
	public String getAdmin(@PathVariable("id") Long id, Model model) {
		return "admin.html";
	}
}
