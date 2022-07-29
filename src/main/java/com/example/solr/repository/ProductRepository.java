package com.example.solr.repository;

import com.example.solr.document.Product;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends SolrCrudRepository<Product,Integer> {
    @Query(value = "name:*?0*")
    Product findByName(String name);


}
