package com.nt.adviser;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.exceptions.PlayerNotFoundException;

@RestControllerAdvice
public class Adviser {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(PlayerNotFoundException.class)
	public ResponseEntity<String> handlePlayerNotFoundException(PlayerNotFoundException e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
