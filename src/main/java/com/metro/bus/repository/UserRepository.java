package com.metro.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metro.bus.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
