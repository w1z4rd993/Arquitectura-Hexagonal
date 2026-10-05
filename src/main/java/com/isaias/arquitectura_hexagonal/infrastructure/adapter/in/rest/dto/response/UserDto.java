package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response;

public record UserDto(Long id, String firstName, String lastName, String dni, String email) {
}
