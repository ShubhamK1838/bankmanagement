package com.bank.controller;

import com.bank.dto.AddressDTO;
import com.bank.dto.CustomerDTO;
import com.bank.dto.ProfileDTO;
import com.bank.dto.ProfileDataDTO;
import com.bank.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer/auth")
    public ResponseEntity<String> addCustomer(@RequestParam("email") String mail,
                                              @RequestParam("password") String pass,
                                              HttpServletRequest req) {
        var entity= customerService.authCustomer(mail, pass);
        req.getSession().setAttribute("customer", entity);
        return ResponseEntity.ok().body("/bank/customer/home");
    }

    @PostMapping("/customer")
    public ResponseEntity<?> registerUser(@RequestParam("user") String cust, @RequestParam("address") String address,
                                          @RequestParam("image") MultipartFile image) throws JsonProcessingException {
        if (image.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file");
        } else {

            ObjectMapper mapper = new ObjectMapper();
            CustomerDTO customerDTO = mapper.readValue(cust, CustomerDTO.class);
            AddressDTO addressDTO = mapper.readValue(address, AddressDTO.class);
            System.out.println(cust + " and\n " + address);
            customerDTO.setAddress(addressDTO);
            customerDTO.setProfile(new ProfileDTO(image));
            System.out.println(customerDTO);
            System.out.println(addressDTO);
            return ResponseEntity.ok().body(customerService.registerCustomer(customerDTO));
        }


    }


    @GetMapping("/delete/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("id") long  id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().body("OK");
    }

    @GetMapping("/customer")
    public ResponseEntity<?> getUser() {
        var a = new CustomerDTO();
        a.setAddress(new AddressDTO());
        ProfileDTO pdto = new ProfileDTO();
        pdto.setProfileData(new ProfileDataDTO());
        a.setProfile(pdto);

        return ResponseEntity.ok().body(a);
    }
}
