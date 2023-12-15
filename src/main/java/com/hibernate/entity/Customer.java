package com.hibernate.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "t_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_age")
    private int customerAge;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "customer_mobile")
    private String customerMobile;


}
