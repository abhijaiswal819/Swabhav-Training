package com.aurionpro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.aurionpro.entity.User;

public interface UserRespository extends CrudRepository<User, Long>{
	Optional<User> findByUsername(String username);
	
}
