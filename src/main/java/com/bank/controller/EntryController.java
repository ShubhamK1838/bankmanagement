package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/customer/")
public class EntryController {

    @GetMapping("/say")
    public String say() {
        return "DONE....";
    }

    @GetMapping("/home")
    public String getCustomerHome()
    {
        return "home";
    }

    @GetMapping("/signup")
    public String getRegisterPage()
    {
        return "signup";
    }
    @GetMapping("/login")
    public String getLoginPage()
    {
        return "login";
    }


}
