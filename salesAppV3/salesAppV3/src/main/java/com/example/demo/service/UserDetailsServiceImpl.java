package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.demo.Repositories.UserRepository;
import com.example.demo.entities.User;
import com.example.demo.security.CustomSecurityUser;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUsername(username);

		
		if(user == null) 
			
			throw new UsernameNotFoundException("Invalid login Credentials");
			
			return new CustomSecurityUser(user);
		}
	
		
		
		
	}


