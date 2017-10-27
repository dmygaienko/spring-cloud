package com.mygaienko.service;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by enda1n on 26.10.2017.
 */
@Configuration
@EntityScan(basePackages = {"com.mygaienko.model"})
@EnableJpaRepositories(basePackages = {"com.mygaienko.dao"})
@ComponentScan(basePackages = {"com.mygaienko.service", "com.mygaienko.controller"})
public class ServiceConfig {
}
