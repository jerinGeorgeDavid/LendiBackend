package com.jaydee.lendi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LendiController {

    @GetMapping("/")
    public String Lendi(){
        return "Welcome to Lendi App";
    }
}
