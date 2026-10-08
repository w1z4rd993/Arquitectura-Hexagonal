package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request;

public record EditUserRequest(String firstName, String lastName, String email, String dni) {
}
