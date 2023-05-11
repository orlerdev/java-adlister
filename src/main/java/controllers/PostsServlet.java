package controllers;

import dao.Posts;
import dao.PostsDaoFactory;
import models.Post;
import models.UserPosts;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/posts")
public class PostsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Post> posts = PostsDaoFactory.getPostsDao().all();
        req.setAttribute("posts", posts);
        req.getRequestDispatcher("/blog/posts.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String body = req.getParameter("body");
        Post post = new Post(title, body, UserPosts.randomUser());
//        UserPosts.allPosts.add(post);
        Posts postsDao = PostsDaoFactory.getPostsDao();
        postsDao.insert(post);
        resp.sendRedirect("/posts");
    }
}
