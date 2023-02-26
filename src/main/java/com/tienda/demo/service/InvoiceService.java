package com.tienda.demo.service;

import com.tienda.demo.entity.Invoice;
import com.tienda.demo.repository.IInvoiceDao;
import com.tienda.demo.repository.IInvoiceItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    IInvoiceDao invoiceDao;

    public Invoice newInvoice(Invoice newInvoice){
        return invoiceDao.save(newInvoice);
    }

    public Invoice getInvoice(Integer id){
        return invoiceDao.findAllById(id);
        //return invoiceDao.findAllById(id).orElse(null);
    }
}
