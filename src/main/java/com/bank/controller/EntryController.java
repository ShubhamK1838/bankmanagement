package com.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customer/")
public class EntryController {



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
    @RequestMapping("/login")
    public String getLoginPage()
    {
        return "login";
    }
}
//http://localhost:8081/bank/customer/home#transactions