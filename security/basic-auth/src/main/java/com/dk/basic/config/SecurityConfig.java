package com.dk.basic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()   //allows restricting access.
		.anyRequest().authenticated()	//Specify that URLs are allowed by any authenticated user
		.and()              //return the string builder
		.httpBasic();      //configures basic authentication
	}
	
	public void configure(AuthenticationManagerBuilder registry) throws Exception {
		registry.inMemoryAuthentication().withUser("dk").password("{noop}password").roles("ADMIN");
	}
	
}
