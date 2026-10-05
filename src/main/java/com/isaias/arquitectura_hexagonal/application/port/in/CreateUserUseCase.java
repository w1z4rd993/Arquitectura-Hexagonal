package com.isaias.arquitectura_hexagonal.application.port.in;

import com.isaias.arquitectura_hexagonal.domain.model.User;

public interface CreateUserUseCase {
	User create(User user);
}
