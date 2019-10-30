package com.SeregaGroup.domain.mapper;

import com.SeregaGroup.domain.dto.UserDTO;
import com.SeregaGroup.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO (User user);

    List<UserDTO> userToUserDTO (List<User> users);

    User userDTOToUser (UserDTO userDTO);

    List<User> userDTOToUser (List<UserDTO> userDTOs);
}
