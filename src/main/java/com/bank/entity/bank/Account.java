package com.bank.entity.bank;

import com.bank.entity.user.Customer;
import com.bank.enums.AccountType;
import jakarta.persistence.*;

@Entity
public class Account   {


    @Id
    private int id;
    private long balance;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Customer accountOwner;


    public Account(){}


}
