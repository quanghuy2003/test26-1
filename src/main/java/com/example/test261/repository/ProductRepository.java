package com.example.test261.repository;

import com.example.test261.model.Category;
import com.example.test261.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Iterable<Product>findByName(String name);
    @Query("select q from Product q where q.category.name like ?1")
    Iterable<Product> findByCategory(String category);

}
