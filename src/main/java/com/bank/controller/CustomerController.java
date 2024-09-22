package com.bank.controller;

import com.bank.dto.AddressDTO;
import com.bank.dto.CustomerDTO;
import com.bank.dto.ProfileDTO;
import com.bank.dto.ProfileDataDTO;
import com.bank.service.CustomerService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/user")
    public ResponseEntity<?> registerUser(@RequestParam("user") String cust, @RequestParam("address") String address,
                             @RequestParam("image") MultipartFile image) throws JsonProcessingException {
        if (image.isEmpty()) {
            return ResponseEntity.badRequest().body("Please select a file");
        } else {

            ObjectMapper mapper = new ObjectMapper();
            CustomerDTO customerDTO = mapper.readValue(cust, CustomerDTO.class);
            AddressDTO addressDTO = mapper.readValue(address, AddressDTO.class);
            System.out.println(cust+" and\n " + address );
            customerDTO.setAddress(addressDTO);
            customerDTO.setProfile(new ProfileDTO(image));
            System.out.println(customerDTO);
            System.out.println(addressDTO);
            return ResponseEntity.ok().body(customerService.registerCustomer(customerDTO));
        }


    }


    @GetMapping("/user")
    public ResponseEntity<?> getUser() {
        var a = new CustomerDTO();
        a.setAddress(new AddressDTO());
        ProfileDTO pdto = new ProfileDTO();
        pdto.setProfileData(new ProfileDataDTO());
        a.setProfile(pdto);

        return ResponseEntity.ok().body(a);
    }
}
