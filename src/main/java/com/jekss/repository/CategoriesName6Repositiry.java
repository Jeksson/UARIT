package com.jekss.repository;

import com.jekss.entityes.CategoriesName6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName6Repositiry extends JpaRepository <CategoriesName6, Integer> {

    @Query("select b from CategoriesName6 b where b.name = :name")
    CategoriesName6 findByName(@Param("name") String name);
}
