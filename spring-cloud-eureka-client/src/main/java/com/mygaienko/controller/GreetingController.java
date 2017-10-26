package com.mygaienko.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by enda1n on 15.10.2017.
 */
public interface GreetingController {

    @RequestMapping("/greeting")
    String greeting();
}
