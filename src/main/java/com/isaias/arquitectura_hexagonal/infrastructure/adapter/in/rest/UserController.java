package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest;

import com.isaias.arquitectura_hexagonal.application.port.in.*;
import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.CreateUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.EditUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.CreateUserResponse;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.EditUserResponse;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.UserDto;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.mapper.UserRestMapper;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private final GetUsersUseCase getUsersUseCase;
	private final GetUserUseCase getUserUseCase;
	private final CreateUserUseCase createUserUseCase;
	private final EditUserUseCase editUserUseCase;
	private final DeleteUserUseCase deleteUserUseCase;
	private final UserRestMapper userRestMapper;

	public UserController(GetUsersUseCase getUsersUseCase, CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase, EditUserUseCase editUserUseCase, DeleteUserUseCase deleteUserUseCase, UserRestMapper userRestMapper) {
		this.getUsersUseCase = getUsersUseCase;
		this.createUserUseCase = createUserUseCase;
		this.getUserUseCase = getUserUseCase;
		this.editUserUseCase = editUserUseCase;
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
		return ResponseEntity.ok().build();
	}

	@PutMapping("/{id}")
	public ResponseEntity<EditUserResponse> editUser(@PathVariable Long id, @Valid @RequestBody EditUserRequest editUserRequest) {
		User editedUser = userRestMapper.toModel(editUserRequest);
		EditUserResponse response = userRestMapper.toEditUserResponse(editUserUseCase.edit(id, editedUser));
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
