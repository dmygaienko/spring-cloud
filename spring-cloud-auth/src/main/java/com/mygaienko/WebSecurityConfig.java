package com.mygaienko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by enda1n on 25.10.2017.
 */
@Configuration
@EnableWebSecurity/*(debug = true)*/
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//    @Autowired
//    private UserDetailsService userDetailsService;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("steve").password("password").roles("CLIENT")
                .and()
                .withUser("admin").password("admin").roles("ADMIN");
//        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .httpBasic().and()
//                .formLogin().permitAll()
//                .and()
//                .requestMatchers().antMatchers("/login", "/oauth/authorize", "/oauth/confirm_access")
//                .and()
//                .authorizeRequests().anyRequest().authenticated().and()
//                .csrf().disable();
        http
                .httpBasic().and()
                .formLogin().permitAll().and()
                .requestMatchers().antMatchers("/**", "/uaa/login", "/login", "/oauth/authorize", "/oauth/confirm_access", "/uaa/oauth/token")
                .and()
                .authorizeRequests().anyRequest().authenticated().and()
                .csrf().disable();
    }

}
