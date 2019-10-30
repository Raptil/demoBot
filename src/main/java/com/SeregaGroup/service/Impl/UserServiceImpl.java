package com.SeregaGroup.service.Impl;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;
import com.SeregaGroup.domain.mapper.UserMap;
import com.SeregaGroup.domain.mapper.UserMapper;
import com.SeregaGroup.repository.UserRepository;
import com.SeregaGroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

import static com.SeregaGroup.repository.filter.UserSpecification.usersOrderByFirstName;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDTO getUser(String id) {
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findUserByUserId(id));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findAll());
    }

    @Override
    public List<UserDTO> getAllOrderUsers(Pageable pageable) {
        //Pageable pageable = PageRequest.of(0,10, Sort.Direction.ASC, "firstName");
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findAll(pageable).getContent());
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        userRepository.save(UserMapper.INSTANCE.userDTOToUser(userDTO));
        return userDTO;
    }

    @Override
    public UserDTO deleteUser(UserDTO userDTO) {
        userDTO.setDeleteFlg('Y');
        userRepository.save(UserMapper.INSTANCE.userDTOToUser(userDTO));
        return userDTO;
    }
}
