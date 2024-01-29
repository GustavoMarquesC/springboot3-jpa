package com.test.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
