package com.example.treekin.service;

import com.example.treekin.model.User;
import com.example.treekin.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if (optionalUser.isPresent()) {
            throw new IllegalStateException("User with Id " + optionalUser.get().getId() + " already exists");
        }
        userRepository.save(user);
    }

    public User findUserById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else {
            throw new IllegalStateException("User with Id " + id + " not found");
        }
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public String helloWorld(){
        return "Hello World";
    }
}
