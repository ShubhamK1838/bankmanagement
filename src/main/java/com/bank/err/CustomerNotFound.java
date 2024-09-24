package com.bank.err;

public class CustomerNotFound  extends RuntimeException {

    public CustomerNotFound(long id ) {
        super("Customer Not Found With id " + id );
    }
    public CustomerNotFound(String email) {
        super("Customer Not Found With email: " + email + " and password "  );
    }

}
