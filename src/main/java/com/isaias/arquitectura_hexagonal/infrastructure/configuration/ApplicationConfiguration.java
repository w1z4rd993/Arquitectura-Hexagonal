package com.isaias.arquitectura_hexagonal.infrastructure.configuration;

import com.isaias.arquitectura_hexagonal.application.service.UserService;
import com.isaias.arquitectura_hexagonal.application.usecases.CreateUserUseCaseImpl;
import com.isaias.arquitectura_hexagonal.domain.ports.out.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
	@Bean
	public UserService userService(UserRepositoryPort userRepositoryPort) {
		return new UserService(new CreateUserUseCaseImpl(userRepositoryPort));
	}
}
