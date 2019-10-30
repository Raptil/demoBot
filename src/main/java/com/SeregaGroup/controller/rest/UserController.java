package com.SeregaGroup.controller.rest;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
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

    @GetMapping (value = "/all1")
    public List<UserDTO> getUserOrder(Pageable pageable){
        return userService.getAllOrderUsers(pageable);
    }

    @PutMapping(value = "/add")
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        //logger.info("TEXTXTTXT"+userDTO.getFirstName());
        userService.addUser(userDTO);
        return userDTO;
    }
    @PutMapping(value = "/delete")
    public UserDTO deleteUser(@RequestBody UserDTO userDTO){
        //logger.info("TEXTXTTXT"+userDTO.getFirstName());
        return userService.deleteUser(userDTO);
    }
}
