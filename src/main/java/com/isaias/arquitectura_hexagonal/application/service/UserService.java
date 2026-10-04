package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.domain.User;
import com.isaias.arquitectura_hexagonal.domain.ports.in.CreateUserUseCase;

public class UserService implements CreateUserUseCase {
	private final CreateUserUseCase createUserUseCase;

	public UserService(CreateUserUseCase createUserUseCase) {
		this.createUserUseCase = createUserUseCase;
	}

	@Override
	public User create(User user) {
		return createUserUseCase.create(user);
	}
}
