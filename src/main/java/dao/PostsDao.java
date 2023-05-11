package dao;
import dao.Posts;
import models.Post;
import models.UserPosts;

import java.util.List;

public class PostsDao implements Posts {

  List<Post> post = UserPosts.allPosts;

  @Override
  public List<Post> all() {
    return posts;
  }

  @Override
  public void insert(Post post) {

  }
}
