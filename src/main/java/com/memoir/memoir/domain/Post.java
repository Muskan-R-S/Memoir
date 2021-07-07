package com.memoir.memoir.domain;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    @OneToOne
    private User user;


//    private Data createdDate;

    @OneToMany
    private Set<Comment> comments;


    public Post() {
    }

    public Post( String title, String content, User user/*, Data createdDate*/) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.user = user;
//        this.createdDate = createdDate;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

//    public Data getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Data createdDate) {
//        this.createdDate = createdDate;
//    }


    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}