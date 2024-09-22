package com.bank.service;

import com.bank.dto.CustomerDTO;
import com.bank.entity.Convertor;
import com.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO registerCustomer(CustomerDTO customerDTO) {

        var entity= Convertor.convertCustomerEntity(customerDTO);
        entity= customerRepository.save(entity);
        return Convertor.convertCustomerDTO(entity);
    }
}
