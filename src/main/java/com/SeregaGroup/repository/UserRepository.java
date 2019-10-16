package com.SeregaGroup.repository;

import com.SeregaGroup.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    public User findUserByUserId( String id);

}
