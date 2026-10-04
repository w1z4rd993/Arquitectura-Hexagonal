package com.isaias.arquitectura_hexagonal.domain;

public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String message) {
		super(message);
	}
}
