package com.geekbrains.spring.lesson6.repositories;

import com.geekbrains.spring.lesson6.entities.Category;
import com.geekbrains.spring.lesson6.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> {

//    @Query("SELECT p FROM Product p JOIN p.category c WHERE c.name = :name")
//    Page<Product> findProductByCategoryName(@Param("name") String name, Pageable pageable);

//    @Query("SELECT p FROM Product p JOIN p.category c WHERE c.id = :id")
//    Page<Product> findProductByCategoryId(@Param("id") int id, Pageable pageable);


}
