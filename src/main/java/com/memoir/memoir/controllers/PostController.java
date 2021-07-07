package com.memoir.memoir.controllers;

import com.memoir.memoir.domain.Post;
import com.memoir.memoir.domain.User;
import com.memoir.memoir.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @Autowired
    PostRepository postrepo;


    @PostMapping(path = "/post")
    public String CreateBlog(@RequestParam("Title") String title, @RequestParam("content") String content, ) {

        Post post;
        post = new Post(title, content,)


    }


}
