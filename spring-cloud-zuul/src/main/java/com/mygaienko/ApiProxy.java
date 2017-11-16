package com.mygaienko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Import;

/**
 * Created by enda1n on 24.10.2017.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
@EnableDiscoveryClient
@Import({SecurityConfig.class/*, SessionConfig.class*/})
public class ApiProxy {

    public static void main(String[] args) {
        SpringApplication.run(ApiProxy.class, args);
    }

}
