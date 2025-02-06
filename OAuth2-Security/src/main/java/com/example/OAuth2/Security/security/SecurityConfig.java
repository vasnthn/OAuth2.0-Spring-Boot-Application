package com.example.OAuth2.Security.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF protection
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/", "/api/v1/products/create").permitAll() // Public access to product listing
                .requestMatchers("/api/v1/products").authenticated() // Secure product creation
                .anyRequest().authenticated()
            )
            .oauth2Login(oauth2 -> oauth2
                .defaultSuccessUrl("/api/v1/products", true) // Redirect after login
            );

        return http.build();
    }
}
