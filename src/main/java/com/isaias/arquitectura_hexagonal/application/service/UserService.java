package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.application.port.in.CreateUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.GetUsersUseCase;
import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.domain.model.User;

import java.util.List;

public class UserService implements GetUsersUseCase, CreateUserUseCase {
	private final UserRepositoryPort userRepositoryPort;

	public UserService(UserRepositoryPort userRepositoryPort) {
		this.userRepositoryPort = userRepositoryPort;
	}

	@Override
	public List<User> getUsers() {
		return userRepositoryPort.getUsers();
	}

	@Override
	public User create(User user) {
		return userRepositoryPort.save(user);
	}
}
