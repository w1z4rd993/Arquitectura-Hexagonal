package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest;

import com.isaias.arquitectura_hexagonal.application.port.in.GetUsersUseCase;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private final GetUsersUseCase getUsersUseCase;

	public UserController(GetUsersUseCase getUsersUseCase) {
		this.getUsersUseCase = getUsersUseCase;
	}

	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(getUsersUseCase.getUsers());
	}
}
