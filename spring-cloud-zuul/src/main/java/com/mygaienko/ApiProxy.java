package com.mygaienko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by enda1n on 24.10.2017.
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiProxy {

    public static void main(String[] args) {
        SpringApplication.run(ApiProxy.class, args);
    }

}
