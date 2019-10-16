package com.SeregaGroup.controller.rest;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;
import com.SeregaGroup.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class.getName());

    @GetMapping (value = "/{id}")
    public UserDTO getUser(@PathVariable("id") String id){
        return userService.getUser(id);
    }

    @GetMapping (value = "/all")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @PutMapping(value = "/add")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        //logger.info("TEXTXTTXT"+userDTO.getFirstName());
        userService.addUser(userDTO);
        return userDTO;
    }
}
