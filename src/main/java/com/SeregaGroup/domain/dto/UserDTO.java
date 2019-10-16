package com.SeregaGroup.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {


    private String userId;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String password;

    public Date lastUpdate;
}
