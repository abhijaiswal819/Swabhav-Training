package com.aurionpro.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.aurionpro.entity.User;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(Long id, Class<?> entity){
		super("The " + entity.getSimpleName().toLowerCase() + "with id " + id + " does not exist in our record");

	}

}
