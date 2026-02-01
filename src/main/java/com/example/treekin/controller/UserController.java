package com.example.treekin.controller;

import com.example.treekin.model.User;
import com.example.treekin.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public void registerUser(
            @RequestBody User user
    ) {
        userService.registerUser(user);
    }

    @GetMapping("/getById/{id}")
    public User getUserById(
            @PathVariable Integer id
    ) {
        return userService.findUserById(id);
    }

    @GetMapping("/getAll")
    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return userService.helloWorld();
    }
}
