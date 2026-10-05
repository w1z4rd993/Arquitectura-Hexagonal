package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.mapper;

import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.CreateUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.CreateUserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRestMapper {
	User toEntity(CreateUserRequest createUserRequest);

	CreateUserResponse toResponse(User user);
}
