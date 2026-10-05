package com.isaias.arquitectura_hexagonal.infrastructure.ports.out.repository;

import com.isaias.arquitectura_hexagonal.infrastructure.ports.out.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {
}
