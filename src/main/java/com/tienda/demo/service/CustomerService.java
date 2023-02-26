package com.tienda.demo.service;

import com.tienda.demo.entity.Customer;
import com.tienda.demo.repository.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    ICustomerDao customerDao;

    public Customer createCustomer(Customer newCustomer){
        return customerDao.save(newCustomer);
    }
}
