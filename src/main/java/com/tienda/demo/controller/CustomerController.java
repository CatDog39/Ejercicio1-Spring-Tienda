package com.tienda.demo.controller;

import com.tienda.demo.entity.Customer;
import com.tienda.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(value = "/create")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }
}
