package com.example.demo.com.example.demoweb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post() { }
    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
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
