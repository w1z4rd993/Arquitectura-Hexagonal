package com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.mapper;

import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.CreateUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.request.EditUserRequest;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.CreateUserResponse;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.EditUserResponse;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.in.rest.dto.response.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserRestMapper {
	@Mapping(target = "id", ignore = true)
	User toEntity(CreateUserRequest createUserRequest);

	CreateUserResponse toResponse(User user);

	UserDto toDto(User user);

	@Mapping(target = "id", ignore = true)
	User toModel(EditUserRequest editUserRequest);

	EditUserResponse toEditUserResponse(User user);
}
