package models;
public class Quote {
  private Long id;
  private String content;
  private Author author;

  public Quote() {
  }

  public Quote(Long id, String content, Author author) {
    this.id = id;
    this.content = content;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }
}
