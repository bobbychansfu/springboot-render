package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Post;

import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostsController {

    private List<Post> posts = new ArrayList<Post>();

    @PostMapping("/addPost")
    public Post addPost(@RequestBody Post newPost, HttpServletResponse response) {
        System.out.println("POST /addPost");
        System.out.println(newPost.getTitle());
        System.out.println(newPost.getContent());
        posts.add(newPost);
        response.setStatus(HttpServletResponse.SC_CREATED);   // 201
        return newPost;
    }

    @GetMapping("/viewPosts")
    public List<Post> getPosts() {
        System.out.println("GET /allPosts");
        return posts;                               
    }
    

}
