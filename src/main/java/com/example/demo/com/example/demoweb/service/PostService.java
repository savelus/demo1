package com.example.demo.com.example.demoweb.service;

import com.example.demo.com.example.demoweb.model.Post;
import com.example.demo.com.example.demoweb.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    //()Arrays.asList(new Post("a", 1, new Date(2002, 3, 15)), new Post("b", 1, new Date(2003, 3, 15)), new Post("c", 3, new Date(2001, 3, 15)));
    public Iterable<Post> listAllPosts() {
                return postRepository.findAll();
    }

    public void create(String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }
}
