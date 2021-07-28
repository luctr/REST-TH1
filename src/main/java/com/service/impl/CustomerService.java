package com.service.impl;

import com.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    private ICustomerService customerService;

    @Override
    public Iterable<Customer> findAll() {
        return customerService.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerService.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerService.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerService.remove(id);
    }
}
