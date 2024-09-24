package com.bank.entity.bank;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Bank  {
    @Id
    private long id ;
    private static final String BANK_NAME= "BANK OF BANK";
    private final static long  MINIMUM_BALANCE = 500;
    @OneToMany
    private List<Account> accountsList;

    public  Bank()
    {}


}
