package com.geekbrains.spring.lesson6.controllers;

import com.geekbrains.spring.lesson6.entities.Category;
import com.geekbrains.spring.lesson6.entities.Product;
import com.geekbrains.spring.lesson6.services.CategoryService;
import com.geekbrains.spring.lesson6.services.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public String firstRequest(Model model) {
        model.addAttribute("categories", categoryService.findAll());
        return "categories";
    }

    @GetMapping("/info/{id}")
    public String showCategoryProducts (@PathVariable int id, Model model
            , @RequestParam(defaultValue = "1", name = "p") Integer page) {
        page = (page < 1) ? 1 : page;
        Page<Product> products =  categoryService.findProductByCategoryId(id, page -1 , 3);
        model.addAttribute("products", products);
        return "category_info";
    }
}
