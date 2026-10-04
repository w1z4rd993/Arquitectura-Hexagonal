package com.isaias.arquitectura_hexagonal.application.usecases;

import com.isaias.arquitectura_hexagonal.domain.User;
import com.isaias.arquitectura_hexagonal.domain.ports.in.CreateUserUseCase;
import com.isaias.arquitectura_hexagonal.domain.ports.out.UserRepositoryPort;

public class CreateUserUseCaseImpl implements CreateUserUseCase {
	private final UserRepositoryPort userRepositoryPort;

	public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public User create(User user) {
		return userRepositoryPort.save(user);
	}
}
