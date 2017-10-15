package com.mygaienko.service;

import com.mygaienko.controller.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by enda1n on 15.10.2017.
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}
