package com.SeregaGroup.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "Users")
@Entity
public class User {

    @Id
    //@GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "last_update")
    private Date lastUpdate;

    public User (){
        lastUpdate = new Date();
    }

}
