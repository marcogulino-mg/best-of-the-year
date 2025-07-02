package com.java.exercise.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// INFO: This element is a Controller
@Controller
@RequestMapping("/")
public class HomeController {

    // EXPLANATION: Reply to the root address with index.html
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("name", "Marco");
        return "index";
    }
}