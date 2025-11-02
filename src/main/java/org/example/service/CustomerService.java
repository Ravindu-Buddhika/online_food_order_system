package org.example.service;

import org.example.model.dto.CustomerDTO;
import org.example.model.entity.CustomerEntity;
import org.example.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(CustomerDTO customer){


    }
}
