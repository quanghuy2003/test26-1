package com.example.test261.service;

import com.example.test261.model.Category;
import com.example.test261.repository.CategoryRepository;

import java.util.Optional;

public class CategoryService implements ICategoryService{

    private CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.deleteById(id);
    }
}
