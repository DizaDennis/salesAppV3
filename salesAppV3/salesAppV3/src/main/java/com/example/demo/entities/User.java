package com.example.demo.entities;
import java.util.HashSet;
import java.util.Set;

import com.example.demo.security.Authority;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


/**
 *  User entity class that will hold all of the users in the application
 *  Roles may vary and are held in the Authority table, using a OneToMany relationship
 *  
 *  
 *  @author dennisdiza
 */

@Entity
@Table(name = "users") //helps to avoid conflicting with mySQKL's user table
public class User {

	private Long id;
	private String username;
	private String password;
	private String name;
	
	/*
	 * Included here to avoid having to inherit from UserRepo
	 * Keep in mind that by using a HashSet:
	 * 		-the order of elements isn't guaranteed
	 * 		-It implements the Set interface, Serializable & Cloneable
	 * 		-Ha
	 * 
	 */
	
	Set<Authority> authorities = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	/*
	 * CascadeType basically says what should happen when something related to the authority is executed
	 * FetchType Defines strategies for fetching data from the database.
	 * 		- with EAGER, When an object is fetched from the DB, all related objects will be loaded immediately
	 */
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="user")
	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
