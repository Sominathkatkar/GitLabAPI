package com.sacumen.config;


import org.springframework.context.annotation.Bean;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;



@SuppressWarnings("deprecation")
@Component
@EnableWebSecurity
public class MySecurityAdapter extends WebSecurityConfigurerAdapter{
	

	
		/*
		 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
		 * Exception { http.cors().and().csrf().disable() .authorizeHttpRequests()
		 * .requestMatchers("/signIn").permitAll()
		 * .requestMatchers("/welcome","/signIn") .permitAll() .anyRequest()
		 * .authenticated() .and() .formLogin();
		 * 
		 * return http.build(); }
		 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable(). authorizeHttpRequests()
		.antMatchers("/GitLabApiController/welcome").permitAll()
		//.antMatchers("/GitLabApiController/projects").permitAll()
		.antMatchers("/GitLabApiController/projects").hasRole("ADMIN")
		.antMatchers("/GitLabApiController/users").hasRole("USER")
		.antMatchers("/GitLabApiController/projects/{id}").hasRole("ADMIN")	
		.anyRequest().authenticated()
         .and()
		.httpBasic();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password(this.passwordEncoder().encode("user")).roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password(this.passwordEncoder().encode("admin@123")).roles("ADMIN");
	}
	
	  @Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }

	 

}
