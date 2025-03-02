package com.nt.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.exceptions.TeamNotFoundException;

@RestControllerAdvice
public class IPLTeamAdvicer {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(TeamNotFoundException.class)
	public ResponseEntity<String> handleTeamNotFoundException(TeamNotFoundException e)
	{
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
