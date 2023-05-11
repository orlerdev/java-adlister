package models;

import java.io.Serializable;

public class Post implements Serializable {
    private String title;
    private String body;
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post() {
    }

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }
}
