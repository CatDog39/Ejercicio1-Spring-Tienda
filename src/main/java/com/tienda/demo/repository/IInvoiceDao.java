package com.tienda.demo.repository;

import com.tienda.demo.entity.Customer;
import com.tienda.demo.entity.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceDao extends CrudRepository<Invoice,Integer> {
    Invoice findAllById(Integer id);
}
