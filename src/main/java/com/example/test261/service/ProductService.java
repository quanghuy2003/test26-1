package com.example.test261.service;

import com.example.test261.model.Product;
import com.example.test261.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{

@Autowired
private ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Iterable<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
