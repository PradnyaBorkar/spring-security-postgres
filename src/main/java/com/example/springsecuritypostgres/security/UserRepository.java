package com.example.springsecuritypostgres.security;

import com.example.springsecuritypostgres.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String name);

}
