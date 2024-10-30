package com.example.eventmanagement.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
@Entity
public class User {
	@Id
	private Long id; 
	 private String username; 
	 private String password; 
	 private String email; 
	 @Enumerated(EnumType.STRING)
	 private Role role; 
	 private Timestamp createdDate;
	 private Timestamp updatedDate;
	public User(Long id, String username, String password, String email, Role role, Timestamp createdDate,
			Timestamp updatedDate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	public User() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Timestamp getcreatedDate() {
		return createdDate;
	}
	public void setcreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getupdatedDate() {
		return updatedDate;
	}
	public void setupdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
	 
}
