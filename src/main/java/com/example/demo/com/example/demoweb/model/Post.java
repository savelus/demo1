package com.example.demo.com.example.demoweb.model;

import java.util.Date;

public class Post {

    private final String text;
    private int likes;
    private final long id;
    private final Date creationDate;
    public Post(long id, String text, Integer likes, Date date){
        this.id = id;
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

    public void setLikes(int likes){
        this.likes = likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId(){
        return id;
    }
}
