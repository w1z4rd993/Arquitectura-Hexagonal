package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.application.port.in.CreateUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.out.CreateUserPort;
import com.isaias.arquitectura_hexagonal.domain.User;

public class CreateUserService implements CreateUserUseCase {
	private final CreateUserPort createUserPort;

	public CreateUserService(CreateUserPort createUserPort) {
		this.createUserPort = createUserPort;
	}

	@Override
	public User createUser(String firstName, String lastName, String dni, String email) {
		User saveUser = User.create(null, firstName, lastName, dni, email);
		this.createUserPort.save(saveUser);
		return saveUser;
	}
}
