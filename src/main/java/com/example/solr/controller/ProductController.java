package com.example.solr.controller;

import com.example.solr.document.Product;
import com.example.solr.repository.ProductRepository;
import com.example.solr.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @PostConstruct
    public void addProducts(){
        List<Product> employees = new ArrayList<>();
        employees.add(new Product(1, "phantom",15000000.00 ));
        employees.add(new Product(2, "a8", 10000000.0));
        employees.add(new Product(3, "city", 1000000.0));
        productService.saveAll(employees);
    }

    @GetMapping("/get-all-products")
    public Iterable<Product> getProducts(){
        return productService.findAll();
    }

    @GetMapping("/get-products/{name}")
    public Product getProductByName(@PathVariable("name") String name){
        return productService.findByName(name);
    }
}
