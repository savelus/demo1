package com.example.demo.com.example.demoweb.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes;

    private Date creationDate;
    public Post(String text, Integer likes, Date date){
        this.text = text;
        this.likes = likes;
        this.creationDate = date;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
