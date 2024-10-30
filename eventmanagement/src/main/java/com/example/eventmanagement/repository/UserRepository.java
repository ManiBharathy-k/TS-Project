  package com.example.eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eventmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
