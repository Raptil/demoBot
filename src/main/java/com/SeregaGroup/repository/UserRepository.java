package com.SeregaGroup.repository;

import com.SeregaGroup.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User>, PagingAndSortingRepository<User, String> {
    public User findUserByUserId( String id);
}
