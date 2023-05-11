package models;
import java.io.Serializable;

public class Album implements Serializable {
  private Long id;
  private String artist;
  private String name;
  private int releaseDate;
  private Double sales;
  private String genre;

  public Album() {}

  public Album(Long id, String artist, String name, int releaseDate, Double sales, String genre) {
    this.id = id;
    this.artist = artist;
    this.name = name;
    this.releaseDate = releaseDate;
    this.sales = sales;
    this.genre = genre;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Double getSales() {
    return sales;
  }

  public void setSales(Double sales) {
    this.sales = sales;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}


