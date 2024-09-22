package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EntryController {

    @GetMapping("/say")
    public String say() {
        return "DONE....";
    }

    
}
