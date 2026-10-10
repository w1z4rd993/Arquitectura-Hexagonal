package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.application.annotation.UseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.*;
import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@UseCase
public class UserService implements GetUsersUseCase, CreateUserUseCase, GetUserUseCase, DeleteUserUseCase, EditUserUseCase {
	private final UserRepositoryPort userRepositoryPort;

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
