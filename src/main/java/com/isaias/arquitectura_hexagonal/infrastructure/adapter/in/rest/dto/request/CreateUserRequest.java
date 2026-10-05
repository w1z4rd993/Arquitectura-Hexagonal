package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request;

public record CreateUserRequest(String firstName, String lastName, String dni, String email) {
}
