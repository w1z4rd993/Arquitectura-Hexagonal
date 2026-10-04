package com.isaias.arquitectura_hexagonal.application.port.in;

import com.isaias.arquitectura_hexagonal.domain.User;

public interface CreateUserUseCase {
	User createUser(String firstName, String lastName, String dni, String email);
}
