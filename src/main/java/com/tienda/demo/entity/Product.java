package com.tienda.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "products")
public class Product implements Serializable {

    /*
     *
     */

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;

    @Column(name="creation_date")
    private Date creationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @PrePersist
    public void prePersist(){
        this.creationDate = new Date();
    }

}
