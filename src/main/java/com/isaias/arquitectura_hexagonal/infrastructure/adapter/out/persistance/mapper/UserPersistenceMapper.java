package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.mapper;

import com.isaias.arquitectura_hexagonal.domain.model.User;
import com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity.UserJpaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapper {
	UserJpaEntity toEntity(User user);

	User toDomain(UserJpaEntity userJpaEntity);
}
