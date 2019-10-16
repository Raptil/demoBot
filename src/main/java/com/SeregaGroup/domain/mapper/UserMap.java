package com.SeregaGroup.domain.mapper;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserMap {

    public static User toEntity(UserDTO userDTO) {

        if (userDTO == null) return null;

        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setMiddleName(userDTO.getMiddleName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setLastUpdate(userDTO.getLastUpdate());


        return user;
    }

    public static UserDTO toDTO(User user) {
        if (user == null) return null;

        UserDTO userDTO = new UserDTO();

        userDTO.setUserId(user.getUserId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setMiddleName(user.getMiddleName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setLastUpdate(user.getLastUpdate());


        return userDTO;
    }

    public static List<User> toEntity(List<UserDTO> userDTOS) {
        if (userDTOS == null) return null;

        List<User> users = new ArrayList<>();
        for (UserDTO userDTO : userDTOS)
            if (userDTO != null) users.add(UserMap.toEntity(userDTO));

        return users;
    }

    public static List<UserDTO> toDTO(List<User> users) {
        if (users == null) return null;

        List<UserDTO> userDTOS = new ArrayList<>();
        for (User user : users)
            if (user != null) userDTOS.add(UserMap.toDTO(user));

        return userDTOS;
    }
}
