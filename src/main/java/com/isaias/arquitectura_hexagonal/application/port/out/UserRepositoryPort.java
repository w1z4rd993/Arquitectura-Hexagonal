package com.isaias.arquitectura_hexagonal.application.port.out;

import com.isaias.arquitectura_hexagonal.domain.model.User;

import java.util.List;

public interface UserRepositoryPort {
	List<User> getUsers();

	User save(User user);
}
