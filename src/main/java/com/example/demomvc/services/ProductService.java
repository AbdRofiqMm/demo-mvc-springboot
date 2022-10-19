package com.example.demomvc.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demomvc.entity.Product;
import com.example.demomvc.utils.RandomNumber;

@Service
public class ProductService {

    private static List<Product> products = new ArrayList<Product>() {
        {
            add(new Product(RandomNumber.getRandom(1000, 9999), "001", "Product 001", 1000.0));
            add(new Product(RandomNumber.getRandom(1000, 9999), "002", "Product 002", 1000.0));
            add(new Product(RandomNumber.getRandom(1000, 9999), "003", "Product 003", 1000.0));
            add(new Product(RandomNumber.getRandom(1000, 9999), "004", "Product 004", 1000.0));
            add(new Product(RandomNumber.getRandom(1000, 9999), "005", "Product 005", 1000.0));
        }
    };

    public List<Product> findAll() {
        return products;
    }

    public void addProduct(Product product) {
        product.setId(RandomNumber.getRandom(1000, 9999));
        products.add(product);
    }

}
