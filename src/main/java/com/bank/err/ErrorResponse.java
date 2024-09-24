package com.bank.err;


import java.time.LocalDateTime;

public class ErrorResponse {
    private String message;
    private LocalDateTime timestamp;
    public ErrorResponse(Exception error ) {
        this.message = error.getMessage();
        this.timestamp = LocalDateTime.now();
    }
    public String getMessage() {return message;}
    public LocalDateTime getTimestamp() {return timestamp;}

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
