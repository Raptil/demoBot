package com.SeregaGroup.service.Impl;

import com.SeregaGroup.domain.entity.User;
import com.SeregaGroup.repository.UserRepository;
import com.SeregaGroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String id) {
        return userRepository.findUserByUserId(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
