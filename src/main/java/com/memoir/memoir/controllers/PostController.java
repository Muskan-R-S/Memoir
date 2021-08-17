package com.memoir.memoir.controllers;

import com.memoir.memoir.domain.Post;
import com.memoir.memoir.domain.User;
import com.memoir.memoir.repositories.PostRepository;
import com.memoir.memoir.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    PostRepository postrepo;
    @Autowired
    UserRepository urepo;


    @GetMapping("/post/{id}")
    @ResponseBody
    public String getPostById(@PathVariable String id) {
        return "ID: " + id;
    }

    @PostMapping("/post/{id}")
    public String postPage(Model model,@PathVariable String id){
        Post post = postrepo.findById(id);
        model.addAttribute("post", post);
        return "redirect:/post";
    }


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
