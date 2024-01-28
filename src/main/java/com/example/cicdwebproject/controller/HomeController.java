package com.example.cicdwebproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String index(Model model){
        log.debug("Welcome to localhost");

        model.addAttribute("msg", "Hi, there!");
        model.addAttribute("today", new Date());

        System.out.println(model.getAttribute("today"));

        return "index";
    }
}
