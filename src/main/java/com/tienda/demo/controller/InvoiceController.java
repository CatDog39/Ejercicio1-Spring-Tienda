package com.tienda.demo.controller;

import com.tienda.demo.entity.Invoice;
import com.tienda.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping(value = "/create")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return invoiceService.newInvoice(invoice);
    }

    @GetMapping(value = "/get")
    public Invoice getInvoice(Integer id){
        return invoiceService.getInvoice(id);
    }

}
