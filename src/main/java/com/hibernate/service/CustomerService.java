package com.hibernate.service;

import com.hibernate.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CustomerService{
    String insertCustomer(Customer customer);
    Customer getCustomer(int customerId);
    List<Customer> getAllCustomer();
}
