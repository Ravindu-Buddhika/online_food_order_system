package org.example.controller;

import org.example.model.dto.CustomerDTO;
import org.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class customerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public void addCustomer(@RequestBody CustomerDTO customer){
        customerService.addCustomer(customer);
    }
}
