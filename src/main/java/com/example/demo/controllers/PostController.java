package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PostController {
    @PostMapping("addPost")
    public String postMethodName(@RequestBody String entity) {
        System.out.println("adding post");
        return entity;
    }
    
    @GetMapping("getPost")
    public String getPost(@RequestParam String param) {
        return new String();
    }
    
}
