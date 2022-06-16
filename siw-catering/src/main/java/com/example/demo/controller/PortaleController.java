package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PortaleController {
	@Autowired UserService userService;
	@Autowired AdminService adminService;
	
	@Autowired BuffetService buffetService;
	@Autowired ChefService chefService;
	@Autowired IngredientiService ingredienteService;
	@Autowired PiattoService piattoService;
	
	@PostMapping("/user")
	public String Home() {
		return "home.html";
	}
	
	
	@GetMapping("/user/{id}")
	public String getUserPage(Model model) {
	    return "user.html";
	  }

//	@PostMapping("/admin")
//	public String getAdmin() {
//		return "admin.html";
//	}
	
	@PostMapping("/admin/{id}")
	public String getAdminPage(Model model) {
		return "admin.html";
	}

	@GetMapping("/utente/buffet/{id}")
	public String getBuffet(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("buffet", this.buffetService.findById(id));
		return "buffet.html";
	}
	
	@GetMapping("/utente/chef/{id}")
	public String getChef (@PathVariable("id") Long id, Model model) {
	    model.addAttribute("chef", this.chefService.findById(id));
		return "chef.html";
	}
	
	@GetMapping("/utente/piatto/{id}")
	public String getPiatto (@PathVariable("id") Long id, Model model) {
	    model.addAttribute("piatto", this.piattoService.findById(id));
		return "piatto.html";
	}
	
	@GetMapping("/utente/ingrediente/{id}")
	public String getIngrediente(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("ingrediente", this.ingredienteService.findById(id));
		return "ingrediente.html";
	}
	
	@PostMapping("/admin/buffet/{id}")
	public String addBuffet(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("buffet", this.buffetService.findById(id));
		return "buffet.html";
	}
	
	@PostMapping("/admin/buffet/{id}")
	public String removeBuffet(@PathVariable("id") Long id, Model model) {
	    model.deleteAttribute("buffet", this.buffetService.findById(id));
		return "buffet.html";
	}
	
	@PostMapping("/admin/chef/{id}")
	public String addChef (@PathVariable("id") Long id, Model model) {
	    model.addAttribute("chef", this.chefService.findById(id));
		return "chef.html";
	}
	
	@PostMapping("/admin/chef/{id}")
	public String removeChef (@PathVariable("id") Long id, Model model) {
	    model.deleteAttribute("chef", this.chefService.findById(id));
		return "chef.html";
	}
	
	@PostMapping("/admin/piatto/{id}")
	public String addPiatto(@PathVariable("id") Long id, Model model) {
	    model.addAttribute("piatto", this.piattoService.findById(id));
		return "piatto.html";
	}
	
	@PostMapping("/admin/piatto/{id}")
	public String removePiatto (@PathVariable("id") Long id, Model model) {
	    model.deleteAttribute("piatto", this.piattoService.findById(id));
		return "piatto.html";
	}
}
