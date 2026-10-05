package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance;

import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.domain.exception.UserNotFoundException;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity.UserJpaEntity;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.mapper.UserPersistenceMapper;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.repository.UserJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPersistenceAdapter implements UserRepositoryPort {
	private final UserJpaRepository userRepository;
	private final UserPersistenceMapper userMapper;

	public UserPersistenceAdapter(UserJpaRepository userRepository, UserPersistenceMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper = userMapper;
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll().stream().map(userMapper::toDomain).toList();
	}

	@Override
	public User save(User user) {
		UserJpaEntity userEntity = userMapper.toEntity(user);
		return userMapper.toDomain(userRepository.save(userEntity));
	}

	@Override
	public User getById(Long id) {
		return userRepository.findById(id)
				.map(userMapper::toDomain)
				.orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
	}
}
