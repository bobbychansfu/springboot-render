package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductsController {
    @GetMapping("viewAllPosts")
    public String viewAllPosts() {
        return new String();
    }

    @GetMapping("viewPost/{id}")
    public String viewPost() {
        return new String();
    }
    
}
