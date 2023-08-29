package com.userauth.UserAuth.Controllers;

import com.userauth.UserAuth.Entities.User;
import com.userauth.UserAuth.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthControllers {

    @Autowired
    AuthService authService;

    @GetMapping("/home")
    public String home(){
        return "Hello World";
    }

    @PostMapping("/signup")
    public String signup(@RequestBody User user){
        if (authService.signup(user))
            return "Success";
        return "Failed";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user){
        if (authService.login(user))
            return "Success";
        return "Failed";
    }
}
