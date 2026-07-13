package com.naman.learning.SpringSecurity.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.naman.learning.SpringSecurity.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private MyUserDetailsService userDetailsService;
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){

        http.csrf(Customizer -> Customizer.disable());
        http.authorizeHttpRequests(auth -> auth
            .requestMatchers("/register").permitAll()
            .anyRequest().authenticated()
        );
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());


        return http.build();
    }

    // @Bean
    // public UserDetailsService userDetailsService(){

    //     UserDetails user1 = User
    //                         .withDefaultPasswordEncoder()
    //                         .username("kiran")
    //                         .password("k@123")
    //                         .roles("User")
    //                         .build();

    //     UserDetails user2 = User
    //                         .withDefaultPasswordEncoder()
    //                         .username("harsh")
    //                         .password("h@123")
    //                         .roles("Admin")
    //                         .build();

    //     return new InMemoryUserDetailsManager(user1, user2);
    // }

    @Bean
    public AuthenticationProvider authenticationProvider(){

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;
    }
}
