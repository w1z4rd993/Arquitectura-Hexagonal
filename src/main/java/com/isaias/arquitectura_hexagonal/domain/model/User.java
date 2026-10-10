package com.isaias.arquitectura_hexagonal.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String dni;
	private String email;
}
