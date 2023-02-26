package com.tienda.demo.repository;

import com.tienda.demo.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductDao extends CrudRepository<Product,Integer> {

    @Query(value = "select * from products where price <= ?",nativeQuery = true)
    public List<Product> searchLowerPricedProducts(Double price);

    public Optional<Product> findByName (String name);

}
