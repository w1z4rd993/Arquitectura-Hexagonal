package com.isaias.arquitectura_hexagonal.infrastructure.ports.out.mapper;

import com.isaias.arquitectura_hexagonal.domain.User;
import com.isaias.arquitectura_hexagonal.infrastructure.ports.out.entity.UserJpaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserJpaMapper {
	UserJpaEntity toUserJpaEntity(User user);

	User toUserDomain(UserJpaEntity userJpaEntity);
}
