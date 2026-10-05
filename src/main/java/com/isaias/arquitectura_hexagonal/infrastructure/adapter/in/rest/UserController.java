package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest;

import com.isaias.arquitectura_hexagonal.application.port.in.CreateUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.DeleteUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.GetUserUseCase;
import com.isaias.arquitectura_hexagonal.application.port.in.GetUsersUseCase;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.CreateUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.CreateUserResponse;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.UserDto;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.mapper.UserRestMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private final GetUsersUseCase getUsersUseCase;
	private final CreateUserUseCase createUserUseCase;
	private final GetUserUseCase getUserUseCase;
	private final DeleteUserUseCase deleteUserUseCase;
	private final UserRestMapper userRestMapper;

	public UserController(GetUsersUseCase getUsersUseCase, CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase, DeleteUserUseCase deleteUserUseCase, UserRestMapper userRestMapper) {
		this.getUsersUseCase = getUsersUseCase;
		this.createUserUseCase = createUserUseCase;
		this.getUserUseCase = getUserUseCase;
		this.deleteUserUseCase = deleteUserUseCase;
		this.userRestMapper = userRestMapper;
	}

	@GetMapping
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(getUsersUseCase.getUsers());
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
		return ResponseEntity.ok(userRestMapper.toDto(getUserUseCase.getById(id)));
	}

	@PostMapping
	public ResponseEntity<CreateUserResponse> createUser(@RequestBody CreateUserRequest userRequest) {
		User user = userRestMapper.toEntity(userRequest);
		CreateUserResponse response = userRestMapper.toResponse(createUserUseCase.create(user));
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteUserById(@PathVariable Long id) {
		deleteUserUseCase.delete(id);
		return ResponseEntity.noContent().build();
	}
}
