package com.isaias.arquitectura_hexagonal.infrastructure.configuration;

import com.isaias.arquitectura_hexagonal.application.port.in.CreateUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.DeleteUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.GetUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.GetUsersUseCase;
import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.application.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class BeanConfiguration {
	@Bean
	public GetUsersUseCase getUsersUseCase(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}

	@Bean
	public CreateUserUseCase createUserUseCase(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}

	@Bean
	public GetUserUseCase getUserUseCase(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}

	@Bean
	public DeleteUserUseCase deleteUserUseCase(UserRepositoryPort userRepositoryPort) {
		return new UserService(userRepositoryPort);
	}
}
