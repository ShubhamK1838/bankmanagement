package com.bank.err.handler;

import com.bank.err.CustomerNotFound;
import com.bank.err.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(CustomerNotFound.class)
    public ResponseEntity<?> UserNotFoundHandler(Exception ex) {
        return ResponseEntity.badRequest().body(new ErrorResponse(ex));
    }
}
