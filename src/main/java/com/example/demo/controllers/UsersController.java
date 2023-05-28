package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.Users;

@Controller
public class UsersController {
    @GetMapping("/users/view")
    public String getAllUsers(Model model){
        System.out.println("Getting all users");
        // TODO: get all users from database
        List<Users> users = new ArrayList<>();
        users.add(new Users("bobby","1234",25));
        users.add(new Users("sara","1234",15));
        users.add(new Users("steve","1234",35));
        users.add(new Users("jacob","1234",5));
        // end of database call
        model.addAttribute("us", users);
        return "users/showAll";
    }
}
