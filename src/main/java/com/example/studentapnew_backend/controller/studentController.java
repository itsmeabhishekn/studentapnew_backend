package com.example.studentapnew_backend.controller;

import com.example.studentapnew_backend.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/")
    public String homePage()
    {
        return "Hello world";
    }

  @PostMapping(path="/add",consumes = "application/json" , produces = "application/json")
    public String add(@RequestBody Students s)
  {
      System.out.println(s.getName().toString());
      return "student added ";
  }

}
