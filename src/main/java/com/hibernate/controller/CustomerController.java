package com.hibernate.controller;

import com.hibernate.entity.Customer;
import com.hibernate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;



    @PostMapping
    public String insertCustomer(@RequestBody Customer customer) {

        return service.insertCustomer(customer);

    }


    @GetMapping("/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId) {
        return service.getCustomer(customerId);
    }


    @GetMapping
    public List<Customer> getAllCustomer() {
        return service.getAllCustomer();
    }
}
