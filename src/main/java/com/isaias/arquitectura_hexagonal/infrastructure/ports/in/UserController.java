package com.isaias.arquitectura_hexagonal.infrastructure.ports.in;

import com.isaias.arquitectura_hexagonal.application.service.UserService;
import com.isaias.arquitectura_hexagonal.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
	}
}
