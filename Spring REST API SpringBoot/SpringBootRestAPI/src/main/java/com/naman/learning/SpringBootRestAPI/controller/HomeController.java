package com.naman.learning.SpringBootRestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    @ResponseBody
    public String greet(){
        return "Welcome to the JAVA DEV World";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "We dont teach, we Educate!";
    }
}
