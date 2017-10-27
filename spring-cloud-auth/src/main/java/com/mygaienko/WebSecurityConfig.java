package com.mygaienko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by enda1n on 25.10.2017.
 */
@Configuration
@EnableWebSecurity/*(debug = true)*/
@Order(-1)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .parentAuthenticationManager(authenticationManager)
                .inMemoryAuthentication()
                    .withUser("steve").password("password").roles("CLIENT").and()
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
//        http
//                .httpBasic().and()
//                .formLogin()
//                    .loginProcessingUrl("/login")
//                    .loginPage("/login.html")
//                    .defaultSuccessUrl("/oauth/authorize")
//                    .permitAll().and()
////                .requestMatchers()
////                    .antMatchers("/**", "/templates/**", "/login", "/oauth/authorize", "/oauth/confirm_access", "/uaa/oauth/token")
////                .and()
//                .authorizeRequests()
//                    .antMatchers("/login", "/login.html", "/logout").permitAll()
//                    .antMatchers("/**").authenticated().and()
//
//                .csrf().disable();

        http.csrf().disable()
                .authorizeRequests()
                    .antMatchers(
                            "/login", "/index", "/login.html",
                            "/index.html", "/logout.do", "/resources/**").permitAll()
                    .antMatchers("/**").authenticated()
                .and()
                .formLogin()
                    .loginProcessingUrl("/login.html")
//                    .usernameParameter("name")
                    .loginPage("/login.html")
                        .permitAll();
    }

}
