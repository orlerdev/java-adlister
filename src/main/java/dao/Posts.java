package dao;

import models.Post;

import java.util.List;

public interface Posts {

    List<Post> all();
    void insert(Post post);

}
