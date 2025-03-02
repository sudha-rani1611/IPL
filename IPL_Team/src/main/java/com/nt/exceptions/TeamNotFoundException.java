package com.nt.exceptions;

public class TeamNotFoundException extends RuntimeException{
	public TeamNotFoundException(String Msg) {
		super(Msg);
	}
}
