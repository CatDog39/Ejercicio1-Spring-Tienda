package com.tienda.demo.repository;

import com.tienda.demo.entity.InvoiceItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInvoiceItemDao extends CrudRepository<InvoiceItem,Integer> {
}
