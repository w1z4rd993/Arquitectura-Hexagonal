package com.isaias.arquitectura_hexagonal.application.port.out;

import com.isaias.arquitectura_hexagonal.domain.User;

public interface CreateUserPort {
	User save(User user);
}
