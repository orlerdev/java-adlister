package dao;

public class PostsDaoFactory {

    private static Posts postsDao;

    public static Posts getPostsDao(){
        if (postsDao == null){
            postsDao = new PostsDao();
        }
        return postsDao;
    }
}
