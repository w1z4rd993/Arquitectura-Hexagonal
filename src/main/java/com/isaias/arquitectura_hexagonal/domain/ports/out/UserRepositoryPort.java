package com.isaias.arquitectura_hexagonal.domain.ports.out;

import com.isaias.arquitectura_hexagonal.domain.User;

public interface UserRepositoryPort {
	User save(User user);
}
