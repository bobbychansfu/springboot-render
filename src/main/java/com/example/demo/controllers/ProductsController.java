package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductsController {
    @GetMapping("getAllProducts")
    public String getAllProducts() {
        return new String();
    }
    
}
