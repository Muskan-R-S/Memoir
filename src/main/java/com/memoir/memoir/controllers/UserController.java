package com.memoir.memoir.controllers;

import com.memoir.memoir.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.memoir.memoir.repositories.UserRepository;


@Controller
public class UserController {

    @Autowired
    UserRepository urepo;

    @RequestMapping("/login")
    public String loginForm() {
        return "login" ;
    }

    @RequestMapping("/register")
    public String registerationForm(){
        return "registeration";
    }

    @PostMapping(path = "/login")
    public String loginUser(@RequestParam("username") String userName,@RequestParam("password") String password) {

        User user;
        user = (User) urepo.findByuserName(userName);

        System.out.println("User:" +userName );
        System.out.println("User found:" +user.getUserName());

        String upass;
        upass = user.getPassword();

        System.out.println("Password= " +upass);
        System.out.println("Password entered= " +password);

        if ( user != null && upass.equals(password) ) {
            return "home";
        }
        return "login";
    }

    @PostMapping(path = "/register")
    public String registerUser(@RequestParam("first-name") String firstName,@RequestParam("last-name") String lastName, @RequestParam("email") String email,@RequestParam("username") String username, @RequestParam("password") String password) {

        User user;
        user = (User) urepo.findByEmail(email);

        System.out.println("Fname"+ firstName );

        if( (firstName.isEmpty()) || (lastName.isEmpty()) || (email.isEmpty()) || ( username.isEmpty()) || (password.isEmpty()) ) {
            System.out.println("ENTER ALL FIELDS");
            return "registeration";
        }
        if( user == null) {
            user = new User( firstName, lastName, email, username, password);
            urepo.save(user);
            return "login";
        }
        return "registeration";

    }


}
