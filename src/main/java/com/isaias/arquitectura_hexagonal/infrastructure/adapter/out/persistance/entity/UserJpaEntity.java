package com.isaias.arquitectura_hexagonal.infrastructure.adapter.out.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
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

	public UserJpaEntity() {
	}

	public UserJpaEntity(Long id, String firstName, String lastName, String dni, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dni = dni;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
