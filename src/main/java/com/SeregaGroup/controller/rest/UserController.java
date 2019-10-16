package com.SeregaGroup.controller.rest;

import com.SeregaGroup.domain.entity.User;
import com.SeregaGroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping (value = "/{id}")
    public User getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }

    @GetMapping (value = "/all")
    public List<User> getUser(){
        return userService.getAllUsers();
    }
}
