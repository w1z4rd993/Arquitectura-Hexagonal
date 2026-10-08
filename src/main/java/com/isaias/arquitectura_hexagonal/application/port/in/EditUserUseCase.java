package com.isaias.arquitectura_hexagonal.application.port.in;

import com.isaias.arquitectura_hexagonal.domain.model.User;

public interface EditUserUseCase {
	User edit(Long id, User user);
}
