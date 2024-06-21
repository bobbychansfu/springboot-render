package com.example.demo;

import java.util.Date;

public class Helpers {
    public static String getHello() {
        return "Hello";
    }
    public String formatProduct() {
        return "Product";
    }
    
    public String formatDate(Date d) {
        return d.toString();
    }
}
