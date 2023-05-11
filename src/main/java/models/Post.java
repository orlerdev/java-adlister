package models;
public class Post {
  private String title;
  private String post;
  private User user;

  public Post() {
  }

  public Post(String title, String post) {
    this.title = title;
    this.post = post;
  }

  public Post(String title, String post, User user) {
    this.title = title;
    this.post = post;
    this.user = user;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}

