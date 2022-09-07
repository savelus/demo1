package com.example.demo.com.example.demoweb.service;

import com.example.demo.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private final List<Post> posts = new ArrayList<>();
    //()Arrays.asList(new Post("a", 1, new Date(2002, 3, 15)), new Post("b", 1, new Date(2003, 3, 15)), new Post("c", 3, new Date(2001, 3, 15)));
    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts.size(), text, 0, new Date()));
    }
}
