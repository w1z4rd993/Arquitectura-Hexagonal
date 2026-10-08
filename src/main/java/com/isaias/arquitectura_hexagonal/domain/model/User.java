package com.isaias.arquitectura_hexagonal.domain.model;

public class User {
	private Long id;
	private String firstName;
	private String lastName;
	private String dni;
	private String email;

	public User(Long id, String firstName, String lastName, String dni, String email) {
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
