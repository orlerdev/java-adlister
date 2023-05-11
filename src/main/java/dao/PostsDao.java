package dao;

import models.Post;
import models.UserPosts;

import java.util.List;

public class PostsDao implements Posts{

    List<Post> posts = UserPosts.allPosts;

    @Override
    public List<Post> all() {
        return posts;
    }

    @Override
    public void insert(Post post) {
        posts.add(post);
    }
}
