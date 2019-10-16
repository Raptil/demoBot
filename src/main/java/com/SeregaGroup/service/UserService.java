package com.SeregaGroup.service;

import com.SeregaGroup.domain.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public User getUser(String id);

    public List<User> getAllUsers();
}
