package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.application.port.in.*;
import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.domain.model.User;

import java.util.List;

public class UserService implements GetUsersUseCase, CreateUserUseCase, GetUserUseCase, DeleteUserUseCase, EditUserUseCase {
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

	@Override
	public User getById(Long id) {
		return userRepositoryPort.getById(id);
	}

	@Override
	public void delete(Long id) {
		userRepositoryPort.deleteById(id);
	}

	@Override
	public User edit(Long id, User user) {
		return userRepositoryPort.edit(id, user);
	}
}
