package com.hibernate.service;

import com.hibernate.dao.CustomerDao;
import com.hibernate.entity.Customer;
import com.hibernate.exception.CustomException;
import com.hibernate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CustomerServiceImp implements CustomerService{

    @Autowired
    private CustomerRepository repository;
    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public String insertCustomer(Customer customer) {
        repository.save(customer);
        return "Save Success";
    }

    @Override
    @Transactional
    public Customer getCustomer(int customerId) {
        return repository.findById(customerId).orElseThrow(CustomException::new);
    }

    @Override
    @Transactional
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }
}
