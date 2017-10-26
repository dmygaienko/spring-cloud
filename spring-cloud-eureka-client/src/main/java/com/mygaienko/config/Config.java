package com.mygaienko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by enda1n on 15.10.2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.mygaienko"})
@Import({SessionConfig.class})
public class Config {
}
