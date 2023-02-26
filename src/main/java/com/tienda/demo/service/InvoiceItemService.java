package com.tienda.demo.service;

import com.tienda.demo.entity.InvoiceItem;
import com.tienda.demo.repository.IInvoiceItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceItemService {

    @Autowired
    IInvoiceItemDao invoiceItemDao;

    public InvoiceItem saveInvoiceItem(InvoiceItem invoiceItem){
        return invoiceItemDao.save(invoiceItem);
    }

    public InvoiceItem getItem(Integer id){
        return invoiceItemDao.findById(id).orElse(null);
    }
}
