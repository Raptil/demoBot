package com.SeregaGroup.repository.filter;

import com.SeregaGroup.domain.entity.User;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class UserSpecification {

    public static Specification<User> usersOrderByFirstName(){
            return new Specification<User>() {
                @Override
                public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    criteriaQuery.orderBy(criteriaBuilder.asc(root.get("firstName")));
                    return  criteriaBuilder.and();
                }
            };
    }
}
