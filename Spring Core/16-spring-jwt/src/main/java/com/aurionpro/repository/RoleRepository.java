package com.aurionpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	 
}
