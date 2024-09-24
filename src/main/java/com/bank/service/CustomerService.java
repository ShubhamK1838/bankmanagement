package com.bank.service;

import com.bank.dto.CustomerDTO;
import com.bank.entity.user.Convertor;
import com.bank.entity.user.Customer;
import com.bank.err.CustomerNotFound;
import com.bank.repository.CustomerRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDTO authCustomer(String email, String password) {
        var entity = customerRepository.findByEmailAndPassword(email, password);
        if(entity == null) {
            throw new CustomerNotFound(email);
        }else
            return Convertor.convertCustomerDTO(entity);
    }
    public CustomerDTO registerCustomer(CustomerDTO customerDTO) {

        var entity= Convertor.convertCustomerEntity(customerDTO);
        entity= customerRepository.save(entity);
        return Convertor.convertCustomerDTO(entity);
    }
    public void removeCustomer(long id ) {
        var entity= getCustomer(id);
        customerRepository.deleteById(id);
    }

    public CustomerDTO getCustomer(long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer==null || customer.isEmpty()) {
            throw new CustomerNotFound(id);
        }
        return Convertor.convertCustomerDTO(customer.get());
    }


    public void deleteCustomer(long id ) {

        customerRepository.deleteCustomer(id);
    }

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> list = customerRepository.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (Customer customer : list) {
            customerDTOList.add(Convertor.convertCustomerDTO(customer));
        }
        return customerDTOList;
    }
}
