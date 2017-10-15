package com.mygaienko.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enda1n on 15.10.2017.
 */
@RestController
public class GreetingControllerImpl implements GreetingController {

    public String greeting() {
        return "Hello from EurekaClient!";
    }
}
