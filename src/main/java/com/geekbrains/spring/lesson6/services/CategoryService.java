package com.geekbrains.spring.lesson6.services;

import com.geekbrains.spring.lesson6.entities.Category;
import com.geekbrains.spring.lesson6.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll () {
        return categoryRepository.findAll();
    }
}
