package com.tienda.demo.repository;

import com.tienda.demo.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDao extends CrudRepository<Customer,Integer> {
}
