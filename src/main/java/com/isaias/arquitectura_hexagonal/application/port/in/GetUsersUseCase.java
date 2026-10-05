package com.isaias.arquitectura_hexagonal.application.port.in;

import com.isaias.arquitectura_hexagonal.domain.model.User;

import java.util.List;

public interface GetUsersUseCase {
	List<User> getUsers();
}
