package com.example.sprinboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sprinboot.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
