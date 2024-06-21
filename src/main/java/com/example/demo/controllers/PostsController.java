package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class PostsController {
    @PostMapping("addPost")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
    @PutMapping("editPost/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        
        return entity;
    }
}
