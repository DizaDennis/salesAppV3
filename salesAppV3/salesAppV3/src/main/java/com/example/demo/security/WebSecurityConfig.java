package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;

/***
 * 
 * Using this class to configure security instead of having to do it in XML
 * 
 */

@Configuration
public class WebSecurityConfig extends WsConfigurerAdapter{
	
	
	private UserDetailsService userDetailsService;
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth
		.userDetailsService(userDetailsService)
		.passwordEncoder(getPasswordEncoder());
		
	}
	
	
	
}


