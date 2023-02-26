package com.tienda.demo.service;

import com.tienda.demo.entity.Product;
import com.tienda.demo.repository.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductDao productDao;

    public Product saveProduct(Product product){
        return productDao.save(product);
    }

    public boolean saveProducts(List<Product> products){
        try {
            productDao.saveAll(products);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<Product> getLowerPricedProduct(Double price){
        return productDao.searchLowerPricedProducts(price);
    }

    public Product findNameProduct(String name){
        return productDao.findByName(name).orElse(null);
    }
}
