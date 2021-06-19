package domain;

import javax.persistence.*;
import javax.xml.crypto.Data;


@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private User user;
    private String comment;
    private Post post;

    @Temporal(TemporalType.DATE)
    private Data createdDate;

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

    public Data getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Data createdDate) {
        this.createdDate = createdDate;
    }
}
