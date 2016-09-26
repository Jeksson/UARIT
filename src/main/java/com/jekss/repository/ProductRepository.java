package com.jekss.repository;


import com.jekss.entityes.Product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jekss on 26.09.16.
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where p.name_product=:name")
    Product findByName(@Param("name") String name);

    @Query("select distinct p from Product p where p.categoriesName1_product = :categoriesName1_product")
    List<Product> findDistinctByCategoriesName1(@Param("categoriesName1_product") String categoriesName1_product);


}
