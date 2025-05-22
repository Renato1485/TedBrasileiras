package com.brasileiras.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brasileiras.ecommerce.model.User;
import com.brasileiras.ecommerce.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }
    
    @GetMapping("/id")
    public Optional<User> getById(@PathVariable Long id){
        return userService.findById();
    }

    @PostMapping("path")
    public User create (@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id){
        userService.deleteById(id);
    }
    
}