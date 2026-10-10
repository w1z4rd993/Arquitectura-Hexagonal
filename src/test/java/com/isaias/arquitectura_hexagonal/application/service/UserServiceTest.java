package com.isaias.arquitectura_hexagonal.application.service;

import com.isaias.arquitectura_hexagonal.application.port.out.UserRepositoryPort;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

	@Mock
	private UserRepositoryPort userRepositoryPort;

	@InjectMocks
	private UserService userService;


	@Test
	void shouldCreateUserThroughRepositoryPort() {
		User user = new User(1L, "Ana", "Pérez", "12345678", "ana@example.com");
		when(userRepositoryPort.save(user)).thenReturn(user);

		User result = userService.create(user);

		assertSame(user, result);
		verify(userRepositoryPort).save(user);
	}

	@Test
	void shouldReturnUsersFromRepositoryPort() {
		List<User> users = List.of(
				new User(1L, "Ana", "Pérez", "12345678", "ana@example.com")
		);
		when(userRepositoryPort.getUsers()).thenReturn(users);

		List<User> result = userService.getUsers();

		assertEquals(users, result);
		verify(userRepositoryPort).getUsers();
	}

	@Test
	void shouldReturnUserByIdFromRepositoryPort() {
		Long id = 1L;
		User user = new User(id, "Ana", "Pérez", "12345678", "ana@example.com");
		when(userRepositoryPort.getById(id)).thenReturn(user);

		User result = userService.getById(id);

		assertSame(user, result);
		verify(userRepositoryPort).getById(id);
	}

	@Test
	void shouldDeleteUserThroughRepositoryPort() {
		Long id = 1L;

		userService.delete(id);

		verify(userRepositoryPort).deleteById(id);
	}

	@Test
	void shouldEditUserThroughRepositoryPort() {
		Long id = 1L;
		User user = new User(id, "Ana", "Pérez", "12345678", "ana@example.com");
		when(userRepositoryPort.edit(id, user)).thenReturn(user);

		User result = userService.edit(id, user);

		assertSame(user, result);
		verify(userRepositoryPort).edit(id, user);
	}
}
