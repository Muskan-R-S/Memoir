package com.memoir.memoir.domain;

import javax.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;
    private String comment;

    @ManyToOne
    private Post post;

    public Comment() {
    }

    public Comment(Long id, User user, String comment, Post post /*Data createdDate*/) {
        this.id = id;
        this.user = user;
        this.comment = comment;
        this.post = post;
//        this.createdDate = createdDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

//    public Data getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Data createdDate) {
//        this.createdDate = createdDate;
//    }
}
