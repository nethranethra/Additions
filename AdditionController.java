package com.example.AddNumberSpring.controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.Addition;



@Controller
public class AdditionController {

	@GetMapping("/index")
    public String ViewForm(Model model) {
        model.addAttribute("Addition", new Addition());
        return "index";
    }
	@PostMapping("/addtion")
	public String addForm(@ModelAttribute Addition addtion,BindingResult result,Model model)
	{
		model.addAttribute("addtion",addtion);
		return "calculate";
	}
}