package com.bank.err.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class ViewHanlder {

    @ExceptionHandler(Exception.class)
    public String resourceNotFound(){
        return "pagenotfound";
    }
}
