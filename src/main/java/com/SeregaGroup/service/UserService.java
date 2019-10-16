package com.SeregaGroup.service;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    public UserDTO getUser(String id);

    public List<UserDTO> getAllUsers();

    public UserDTO addUser(UserDTO userDTO);

    public UserDTO deleteUser(UserDTO userDTO);
}
