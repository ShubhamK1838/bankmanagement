package com.bank.repository;


import com.bank.entity.user.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface  CustomerRepository  extends JpaRepository<Customer,Long> {


    public Customer findByEmailAndPassword(String email, String password);

    @Transactional
    @Modifying
    @Query("delete from Customer c where c.id=:id")
    public void deleteCustomer(@RequestParam("id") long id );

}
