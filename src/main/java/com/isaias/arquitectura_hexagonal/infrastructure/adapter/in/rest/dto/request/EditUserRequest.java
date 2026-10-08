package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public record EditUserRequest(
		@Length(min = 3, max = 50, message = "The name must be between 3 and 50 characters")
		@NotNull(message = "The name cannot be null")
		String firstName,

		@Length(min = 3, max = 50, message = "The last name must be between 3 and 50 characters")
		@NotNull(message = "The lastname cannot be null")
		String lastName,

		@Pattern(regexp = "^\\d{8}$", message = "The DNI must contain 8 digits")
		@NotNull(message = "The DNI cannot be null")
		String dni,

		@Email(message = "The email must have a valid format")
		@Length(min = 3, max = 100, message = "The email must be between 3 and 100 characters")
		@NotNull(message = "The email cannot be null")
		String email) {
}
