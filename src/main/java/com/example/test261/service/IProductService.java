package com.example.test261.service;

import com.example.test261.model.Product;

public interface IProductService extends IService<Product>{
    Iterable<Product>findByName(String name);

}
