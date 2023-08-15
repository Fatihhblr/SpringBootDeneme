package com.example.deneme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.deneme.entities.User;
@Repository

public interface UserRepository extends JpaRepository<User, Integer>{

}
