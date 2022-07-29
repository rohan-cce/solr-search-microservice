package com.example.solr.service;

import com.example.solr.document.Product;
import com.example.solr.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  {

    @Autowired
    ProductRepository repository;

    public Iterable<Product> findAll(){
        return repository.findAll();
    }
    public Product findByName(String name){
        return repository.findByName(name);
    }

    public Iterable<Product> saveAll(List<Product> products){
        return repository.saveAll(products);
    }


}
