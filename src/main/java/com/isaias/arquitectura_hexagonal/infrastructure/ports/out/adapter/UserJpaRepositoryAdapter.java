package com.isaias.arquitectura_hexagonal.infrastructure.ports.out.adapter;

import com.isaias.arquitectura_hexagonal.domain.User;
import com.isaias.arquitectura_hexagonal.domain.ports.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.infrastructure.ports.out.entity.UserJpaEntity;
import com.isaias.arquitectura_hexagonal.infrastructure.ports.out.mapper.UserJpaMapper;
import com.isaias.arquitectura_hexagonal.infrastructure.ports.out.repository.UserJpaRepository;
import org.springframework.stereotype.Component;

@Component
public class UserJpaRepositoryAdapter implements UserRepositoryPort {
	private final UserJpaRepository userJpaRepository;
	private final UserJpaMapper userJpaMapper;

	public UserJpaRepositoryAdapter(UserJpaRepository userJpaRepository, UserJpaMapper userJpaMapper) {
		this.userJpaRepository = userJpaRepository;
		this.userJpaMapper = userJpaMapper;
	}

	@Override
	public User save(User user) {
		UserJpaEntity userEntity = userJpaMapper.toUserJpaEntity(user);
		return userJpaMapper.toUserDomain(userJpaRepository.save(userEntity));
	}
}
