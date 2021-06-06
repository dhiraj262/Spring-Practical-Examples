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
		 .authorizeRequests()
		 .antMatchers("/admin").hasRole("ADMIN")
		 .antMatchers("/user").hasAnyRole("USER")
		 .antMatchers("/").permitAll()
		 .and().formLogin();
	}
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
					.withUser("dk").password("{noop}password").roles("ADMIN")
					.and()
					.withUser("dhiraj").password("{noop}pass").roles("USER");
	}
	
}
