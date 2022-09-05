package com.example.demo.com.example.demoweb.service;

import com.example.demo.com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> posts = Arrays.asList(new Post("a", 1, new Date(2002, 3, 15)),
            new Post("b", 1, new Date(2003, 3, 15)),
            new Post("c", 3, new Date(2001, 3, 15)));
        return posts;
    }
}
