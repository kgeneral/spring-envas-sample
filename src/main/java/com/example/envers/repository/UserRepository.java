package com.example.envers.repository;

import com.example.envers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.history.RevisionRepository;

public interface UserRepository extends JpaRepository<User, String>, QueryDslPredicateExecutor<User>, RevisionRepository<User, String, Integer> {
}
