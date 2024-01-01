package com.example.demo.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entities.User;

public class CustomSecurityUser extends User implements UserDetails {

	
	private static final long serialVersionUID = -4519480039320112635L;
	
	public CustomSecurityUser() {
		
	}
	
	/*
	 *  Revise function below .....
	 */
	
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(getId());
		this.setName(user.getName());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
		
	}
	

	@Override
	public Set<Authority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.getAuthorities();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
