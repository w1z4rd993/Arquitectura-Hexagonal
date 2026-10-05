package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.repository;

import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {
}
