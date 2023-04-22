package com.aurionpro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.aurionpro.entity.Role;
import com.aurionpro.entity.User;

public interface RoleRespository extends CrudRepository<Role, Integer> {
	//Optional<User> findByUsername(String username);

}
