package com.memoir.memoir.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;
    private String comment;

    private Date dateCreated;

    @ManyToOne
    private Post post;

    public Comment() {
    }

    public Comment(Long id, User user, String comment, Post post) {
        this.id = id;
        this.user = user;
        this.comment = comment;
        this.post = post;
        this.dateCreated = dateCreated;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDate() {
        return dateCreated;
    }

    //    public Data getCreatedDate() {
//        return createdDate;
//    }
//
//    public void setCreatedDate(Data createdDate) {
//        this.createdDate = createdDate;
//    }
}
