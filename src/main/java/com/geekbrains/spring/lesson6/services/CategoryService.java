package com.geekbrains.spring.lesson6.services;

import com.geekbrains.spring.lesson6.entities.Category;
import com.geekbrains.spring.lesson6.entities.Product;
import com.geekbrains.spring.lesson6.repositories.CategoryRepository;
import com.geekbrains.spring.lesson6.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;
    private ProductRepository productRepository;

    public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    public List<Category> findAll () {
        return categoryRepository.findAll();
    }

    public  Page<Product> findProductByCategoryId(@Param("id") int id, int page, int size) {
        return productRepository.findProductByCategoryId(id, PageRequest.of(page, size));
    }



}
