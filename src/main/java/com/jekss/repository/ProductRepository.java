package com.jekss.repository;


import com.jekss.entityes.Product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


/**
 * Created by jekss on 26.09.16.
 */
public interface ProductRepository extends JpaRepository<Product, Integer>, Repository<Product, Integer>{

    @Query("select p from Product p where p.name=:name")
    Product findByNameQury(@Param("name") String name);

    @Query("select p from Product p where p.categoriesName1=:categoriesName1")
    Product findByCategoriesName1Query(@Param("categoriesName1") String categoriesName1);


}
