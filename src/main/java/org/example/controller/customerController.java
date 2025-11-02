package org.example.controller;

import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController {
    @Autowired
    CustomerService customerService;

    public void addCustomer(){

    }
}
