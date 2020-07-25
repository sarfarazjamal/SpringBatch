package com.jamal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamal.springboot.medel.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
