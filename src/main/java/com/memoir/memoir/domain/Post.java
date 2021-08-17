package com.memoir.memoir.domain;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private Long uID;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    @OneToOne
    private User user;

    @OneToMany
    private Set<Comment> comments;

    public Post() {
    }

    public Post( String title, String content, Long uID) {
        this.title = title;
        this.content = content;
        this.uID = uID;
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


    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDate() {
        return dateCreated;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Long getuID() {
        return uID;
    }

    public void setuID(Long uID) {
        this.uID = uID;
    }
}
