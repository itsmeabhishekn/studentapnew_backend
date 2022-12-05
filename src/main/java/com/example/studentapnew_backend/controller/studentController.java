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

    @GetMapping("/gallery")
    public String gallery()
    {
        return "this is gallery ";
    }
    @GetMapping("/home")
    public String home()
    {
        return "this is the home page ";
    }

}
