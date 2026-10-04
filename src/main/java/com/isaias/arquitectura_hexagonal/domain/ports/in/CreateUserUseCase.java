package com.isaias.arquitectura_hexagonal.domain.ports.in;

import com.isaias.arquitectura_hexagonal.domain.User;

public interface CreateUserUseCase {
	User create(User user);
}
