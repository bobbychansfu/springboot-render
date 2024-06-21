package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ProductsController {
    @GetMapping("viewAllProducts")
    public String viewAllProducts() {
        return "view products";
    }
    
}
