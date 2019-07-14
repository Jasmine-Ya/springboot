package com.jasmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafDemo {
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("content", "Hello Thymeleaf");
        return "index";
    }
}

