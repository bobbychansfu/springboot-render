package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class PostsController {
    @PostMapping("addPost")
    public String addPost(@RequestBody String entity) {
        
        return entity;
    }
    
}
