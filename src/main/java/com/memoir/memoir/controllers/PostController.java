package com.memoir.memoir.controllers;

import com.memoir.memoir.domain.Post;
import com.memoir.memoir.domain.User;
import com.memoir.memoir.repositories.PostRepository;
import com.memoir.memoir.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @Autowired
    PostRepository postrepo;
    @Autowired
    UserRepository urepo;



    @PostMapping(path = "/publish")
    public String CreateBlog(@RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("username") String username) {

        System.out.println("Enter publish");
        Post post;
        User user;
        Long uID;
        user = urepo.findByuserName(username);
        uID = user.getId();
        System.out.println("Title:"+title +"content:-" +content+ "username:-"+username);
        post = new Post(title, content, uID );
        postrepo.save(post);
        return "redirect:/home";

    }


}
