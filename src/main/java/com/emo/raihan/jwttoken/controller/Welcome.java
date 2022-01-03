package com.emo.raihan.jwttoken.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/welcome")
    public String check(){

        return "Authentication Success";
    }

}
