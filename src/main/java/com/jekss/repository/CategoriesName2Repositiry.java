package com.jekss.repository;

import com.jekss.entityes.CategoriesName2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName2Repositiry extends JpaRepository<CategoriesName2, Integer> {

    @Query("select b from CategoriesName2 b where b.name = :name")
    CategoriesName2 findByName(@Param("name") String name);
}
