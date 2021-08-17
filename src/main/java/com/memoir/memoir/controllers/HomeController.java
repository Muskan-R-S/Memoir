package com.memoir.memoir.controllers;

import com.memoir.memoir.domain.Post;
import com.memoir.memoir.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PostRepository postRepo;

    @RequestMapping("/home")
    public String homePag(Model model){

        List<Post> posts = (List<Post>) postRepo.findAll();
        model.addAttribute("posts", posts);
        return "home";
    }

}
