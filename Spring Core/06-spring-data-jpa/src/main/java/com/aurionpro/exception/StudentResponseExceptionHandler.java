package com.aurionpro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentResponseExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

		// create a Student Error Message
		StudentErrorResponse error = new StudentErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// return ResponseEntity

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {

		// create a Student Error Message
		StudentErrorResponse error = new StudentErrorResponse();

		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// return ResponseEntity

		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(NoStudentRecordFoundException exc) {

		// create a Student Error Message
		StudentErrorResponse error = new StudentErrorResponse();

		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimeStamp(System.currentTimeMillis());

		// return ResponseEntity

		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
