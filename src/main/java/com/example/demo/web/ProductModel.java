package com.example.demo.web;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private List<FellaBellaProduct> products;

    public ProductModel() {
        this.products = new ArrayList<FellaBellaProduct>();
        this.products.add(new FellaBellaProduct("p01", "name 1", "thumb1.gif", 20));
        this.products.add(new FellaBellaProduct("p02", "name 2", "thumb2.gif", 21));
        this.products.add(new FellaBellaProduct("p03", "name 3", "thumb3.gif", 22));
    }

    public List<FellaBellaProduct> findAll() {
        return this.products;
    }

    public FellaBellaProduct find(String id) {
        for (FellaBellaProduct product : this.products) {
            if (product.getId().equalsIgnoreCase(id)) {
                return product;
            }
        }
        return null;
    }

}