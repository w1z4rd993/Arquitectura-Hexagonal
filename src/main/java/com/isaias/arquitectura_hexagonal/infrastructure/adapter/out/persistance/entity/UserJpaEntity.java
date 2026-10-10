package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserJpaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "firstname", nullable = false, length = 50)
	private String firstName;

	@Column(name = "lastname", nullable = false, length = 50)
	private String lastName;

	@Column(length = 8, nullable = false, unique = true)
	private String dni;

	@Column(length = 100, nullable = false, unique = true)
	private String email;
	
}
