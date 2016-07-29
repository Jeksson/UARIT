package com.jekss.repository;

import com.jekss.entityes.CategoriesName3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName3Repositiry extends JpaRepository<CategoriesName3, Integer> {

    @Query("select b from CategoriesName3 b where b.name = :name")
    CategoriesName3 findByName(@Param("name") String name);
}
