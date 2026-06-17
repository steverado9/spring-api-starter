package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //sever side rendering (ssr)
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Stephen");
        return "index";
    }
}
