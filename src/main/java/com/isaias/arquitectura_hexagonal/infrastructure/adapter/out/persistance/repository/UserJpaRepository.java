package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.repository;

import com.isaias.arquitectura_hexagonal.domain.exception.UserNotFoundException;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {
	default UserJpaEntity findUserById(Long id) {
		return findById(id).orElseThrow(() -> new UserNotFoundException(("Usuario no encontrado")));
	}
}
