package com.aurionpro.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aurionpro.entity.Role;
import com.aurionpro.entity.User;
import com.aurionpro.repository.*;
import com.aurionpro.exception.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRespository userRepository;
	
	@Autowired
	private RoleRespository roleRepository;
	
//	@Autowired
//	private BCrypPassword bCryptPasswordEncoder;
	
	@Override
	public User getUser(Long id) {
		Optional<User> user = userRepository.findById(id);
		return unwrapUser(user, id);
	}

	static User unwrapUser(Optional<User> entity, Long id) {
		if(entity.isPresent())
			return entity.get();
		else
			throw new EntityNotFoundException(id, User.class);
	}

	@Override
	public User getUser(String userName) {
		Optional<User> user = userRepository.findByUsername(userName);
		return unwrapUser(user, 101L);
	}

	@Override
	public User saveUser(User user) {
//		user.setPassword(BCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User addRoleToUser(Long userid, Integer roleid) {
		User user = userRepository.findById(userid).get();
		Set<Role> roles = user.getRoles();
		Role role = roleRepository.findById(roleid).get();
		roles.add(role);
		userRepository.save(user);
		return null;
	}

}
