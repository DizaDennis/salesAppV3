package com.example.demo.security;

import org.springframework.security.core.GrantedAuthority;

import com.example.demo.entities.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * Class to set up roles and assign them to a user
 * A table is created in the DB to help with holding the relationships
 * ManyToOne relationship with the User table
 * 
 * @author dennisdiza
 */



@Entity
public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 6863203898470952486L;
	private Long id;
	private String authority;
	private User user;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.authority;
	}
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
 