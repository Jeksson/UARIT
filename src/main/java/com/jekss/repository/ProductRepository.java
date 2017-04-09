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

    @Query("select p from Product p where p.id = :id")
    Product findById(@Param("id") int id);

    @Query("select distinct p.categoriesName1 from Product p")
    List <String> findByCategoriesName1All();

    @Query("select distinct p.categoriesName2 from Product p where p.categoriesName1 = :categoriesName1")
    List<String> findByCategoriesName2QueryCategorName1(@Param("categoriesName1") String categoriesName1);

    @Query("select distinct p.categoriesName3 from Product p where p.categoriesName2 = :categoriesName2")
    List<String> findByCategoriesName3QueryCategorName2(@Param("categoriesName2") String categoriesName2);

    @Query("select distinct p.categoriesName4 from Product p where p.categoriesName3 = :categoriesName3")
    List<String> findByCategoriesName4QueryCategorName3(@Param("categoriesName3") String categoriesName3);

    @Query("select distinct p.categoriesName5 from Product p where p.categoriesName4 = :categoriesName4")
    List<String> findByCategoriesName5QueryCategorName4(@Param("categoriesName4") String categoriesName4);

    @Query("select distinct p.categoriesName6 from Product p where p.categoriesName5 = :categoriesName5")
    List<String> findByCategoriesName6QueryCategorName5(@Param("categoriesName5") String categoriesName5);

    @Query("select distinct p.manufactures from Product p")
    List<String> findByBrandAll();
}
