package com.tienda.demo.controller;

import com.tienda.demo.entity.InvoiceItem;
import com.tienda.demo.service.InvoiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/item")
public class InvoiceItemController {

    @Autowired
    InvoiceItemService invoiceItemService;

    @PostMapping(value = "/save")
    public InvoiceItem saveItem(@RequestBody InvoiceItem item){
        return invoiceItemService.saveInvoiceItem(item);
    }

    @GetMapping(value = "/get-item")
    public InvoiceItem getInvoice(Integer id){
        return invoiceItemService.getItem(id);
    }
}
