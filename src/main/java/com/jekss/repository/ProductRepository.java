package com.jekss.repository;

import com.jekss.entityes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jekss on 26.09.16.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Query("select p from Product p where p.name = :name")
    Product findByName(@Param("name") String name);

    @Query("select distinct p.categoriesName1 from Product p")
    List <String> findByCategoriesName1All();

    @Query("select p from Product p where p.categoriesName1 = :categoriesName1")
    List<Product> findByCategoriesName1Query(@Param("categoriesName1") String categoriesName1);


}
