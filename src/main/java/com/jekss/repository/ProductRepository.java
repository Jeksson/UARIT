package com.jekss.repository;

import com.jekss.entityes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 09.07.16.
 */
public interface ProductRepository extends JpaRepository< Product, Integer> {

    @Query("select b from Product b where b.name = :name")
    Product findByName(@Param("name") String name);

}
