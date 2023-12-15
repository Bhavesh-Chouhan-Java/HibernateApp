package com.hibernate.dao;

import com.hibernate.entity.Customer;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerDAOImpl implements CustomerDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public String insertCustomer(Customer customer) {
        Session unwrap = entityManager.unwrap(Session.class);
        Query<Customer> query = unwrap.createQuery("insert into Customer (customerName, customerAge, customerEmail, customerMobile) values (:customerName, :customerAge, :customerEmail, :customerMobile)", Customer.class);
        query.setParameter("customerName",customer.getCustomerName());
        query.setParameter("customerAge",customer.getCustomerAge());
        query.setParameter("customerEmail",customer.getCustomerEmail());
        query.setParameter("customerMobile",customer.getCustomerMobile());
        query.executeUpdate();
        Customer singleResultOrNull = query.getSingleResultOrNull();
        System.out.println("getCustomerName : "+singleResultOrNull.getCustomerName());
        return "Save Success";
    }

    @Override
    public Customer getCustomer(int customerId) {

        return null;
    }

    @Override
    public List<Customer> getAllCustomer() {
        Session unwrap = entityManager.unwrap(Session.class);
        Query<Customer> fromTCustomer = unwrap.createQuery("from Customer", Customer.class);
        return fromTCustomer.getResultList();
    }
}
