package com.example.treekin.controller;

import com.example.treekin.model.User;
import com.example.treekin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/registerUser")
    public void registerUser(
            @RequestBody User user
    ) {
        userService.registerUser(user);
    }

    @GetMapping("/registeredUsers")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return userService.helloWorld();
    }
}
