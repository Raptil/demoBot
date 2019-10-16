package com.SeregaGroup.service.Impl;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;
import com.SeregaGroup.domain.mapper.UserMap;
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
    public UserDTO getUser(String id) {
        return UserMap.toDTO(userRepository.findUserByUserId(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return UserMap.toDTO(userRepository.findAll());
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        userRepository.save(UserMap.toEntity(userDTO));
        return userDTO;
    }

    @Override
    public UserDTO deleteUser(UserDTO userDTO) {
        userDTO.setDeleteFlg('Y');
        userRepository.save(UserMap.toEntity(userDTO));
        return userDTO;
    }
}
