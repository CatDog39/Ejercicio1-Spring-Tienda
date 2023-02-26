package com.tienda.demo.controller;

import com.tienda.demo.entity.Product;
import com.tienda.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/save")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping(value = "/save-all")
    public boolean saveProducts(@RequestBody List<Product> product){
        return productService.saveProducts(product);
    }

    @GetMapping(value = "/get-lower-products")
    public List<Product>lowerPricedProduct(Double price){
        return productService.getLowerPricedProduct(price);
    }

    @GetMapping(value = "/get-name")
    public Product findForName(String name){
        return productService.findNameProduct(name);
    }
}
