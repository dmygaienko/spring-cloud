package com.mygaienko.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by enda1n on 15.10.2017.
 */
@RestController
public class Controller {

    @RequestMapping("/greeting")
    public String greeting() {
        return "Hello from EurekaClient!";
    }
}
