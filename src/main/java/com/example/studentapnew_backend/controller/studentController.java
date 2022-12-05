package com.example.studentapnew_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/")
    public String homePage()
    {
        return "Hello world";
    }

    @GetMapping("/contact")
    public String contact()
    {
        return "this is the contact page ";
    }

}
