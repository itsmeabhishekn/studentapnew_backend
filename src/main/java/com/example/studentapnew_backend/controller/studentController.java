package com.example.studentapnew_backend.controller;

import com.example.studentapnew_backend.dao.StudentDao;
import com.example.studentapnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class studentController {

    @Autowired
    private StudentDao dao;

    @GetMapping("/")
    public String homePage()
    {
        return "Hello world";
    }

    @CrossOrigin
  @PostMapping(path="/add",consumes = "application/json" , produces = "application/json")
    public String add(@RequestBody Students s)
  {
      System.out.println(s.getName().toString());
      dao.save(s);
      return "student added ";

  }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Students> viewAll()
    {
        return (List<Students>) dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Students> search(@RequestBody Students s)
    {
        String admnNo=String.valueOf(s.getAdmnNo());
        System.out.println(admnNo);
        return (List<Students>) dao.search(s.getAdmnNo());
    }


    @CrossOrigin(origins = "*")
    @PostMapping("/delete")
    public HashMap<String, String> delete(@RequestBody Students d )
    {
        String admnNo = String.valueOf(d.getAdmnNo());
        System.out.println(admnNo);
        dao.delete(d.getAdmnNo());
        HashMap<String,String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }



}
