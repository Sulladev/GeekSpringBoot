package com.geekbrains.spring.lesson6.utils;

import com.geekbrains.spring.lesson6.entities.Category;
import com.geekbrains.spring.lesson6.entities.Customer;
import com.geekbrains.spring.lesson6.entities.Order;
import com.geekbrains.spring.lesson6.entities.Product;
import com.geekbrains.spring.lesson6.repositories.CategoryRepository;
import com.geekbrains.spring.lesson6.repositories.CustomerRepository;
import com.geekbrains.spring.lesson6.repositories.OrderRepository;
import com.geekbrains.spring.lesson6.repositories.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SampleData {

    private CustomerRepository customerRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;
    private CategoryRepository categoryRepository;

    public SampleData(CustomerRepository customerRepository, ProductRepository productRepository
            , OrderRepository orderRepository, CategoryRepository categoryRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
        this.categoryRepository = categoryRepository;
    }

    @PostConstruct
    public void init() {

        Category category1 = new Category("Fruits");
        Category category2 = new Category("Vegetables");
        Category category3 = new Category("Meat");

        Product product1 = new Product("Orange", 50., category1);
        Product product2 = new Product("Lemon", 70., category1);
        Product product3 = new Product("Tomato", 20., category2);
        Product product4 = new Product("Mango", 110., category1);
        Product product5 = new Product("Apple", 95., category1);
        Product product6 = new Product("Cucumber", 76., category2);
        Product product7 = new Product("Avocado", 123., category2);
        Product product8 = new Product("Chicken", 125., category3);
        Product product9 = new Product("Pork", 90., category3);
        Product product10 = new Product("Beef",150., category3);
        Product product11 = new Product("Mutton",140., category3);
        Product product12 = new Product("Carrot",10., category2);
        Product product13 = new Product("Potato", 10.);

        Customer customer1 = new Customer("Alex");
        Customer customer2 = new Customer("Alena");

        Order order1 = new Order();
        order1.setTotalPrice(product1.getPrice());
        order1.setCustomer(customer1);

        order1.setCode("0001");

        Order order2 = new Order();
        order2.setTotalPrice(product2.getPrice());
        order2.setCustomer(customer2);

        order2.setCode("0002");

        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);
        productRepository.save(product6);
        productRepository.save(product7);
        productRepository.save(product8);
        productRepository.save(product9);
        productRepository.save(product10);
        productRepository.save(product11);
        productRepository.save(product12);


        customerRepository.save(customer1);
        customerRepository.save(customer2);


        orderRepository.save(order1);
        orderRepository.save(order2);


    }
}
