package com.example.test261.service;

import com.example.test261.model.Category;
import com.example.test261.model.Product;
import org.springframework.data.jpa.repository.Query;

public interface IProductService extends IService<Product>{
    Iterable<Product>findByName(String name);
    Iterable<Product> findByCategory(String category);
}
