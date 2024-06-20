package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PostController {
    @PostMapping("addPost")
    public String postMethodName(@RequestBody String entity) {
        System.out.println("adding post");
        return entity;
    }
    
}
