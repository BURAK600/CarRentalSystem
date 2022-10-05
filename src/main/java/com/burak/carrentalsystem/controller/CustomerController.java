package com.burak.carrentalsystem.controller;


import com.burak.carrentalsystem.repository.entity.Customer;

import com.burak.carrentalsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.burak.carrentalsystem.constants.EndPoint.*;

@Controller
@RequestMapping(VERSION+API+CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(SAVE)
    public ResponseEntity<Customer> save(String idNumber, String firstName, String lastName, String address, String phoneNumber, Long carId) {
        Customer customer = Customer.builder().idNumber(idNumber).firstName(firstName).lastName(lastName).address(address).phoneNumber(phoneNumber).carId(carId)
                .build();
        return ResponseEntity.ok(customerService.save(customer));

    }

    @GetMapping(DELETEBYID)
    public void deleteById(Long id){
        customerService.deleteById(id);

    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }
}