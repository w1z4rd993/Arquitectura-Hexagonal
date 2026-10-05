package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response;

public record CreateUserResponse(Long id, String firstName, String lastName, String dni, String email) {
}
