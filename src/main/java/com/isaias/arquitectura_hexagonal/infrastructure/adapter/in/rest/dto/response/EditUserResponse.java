package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response;

public record EditUserResponse(
		Long id,
		String firstName,
		String lastName,
		String email,
		String dni) {
}
