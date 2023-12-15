package com.hibernate.dao;

import com.hibernate.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerDao {
    String insertCustomer(Customer customer);
    Customer getCustomer(int customerId);
    List<Customer> getAllCustomer();
}
