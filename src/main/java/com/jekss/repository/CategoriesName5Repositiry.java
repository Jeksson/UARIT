package com.jekss.repository;

import com.jekss.entityes.CategoriesName5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName5Repositiry extends JpaRepository<CategoriesName5, Integer> {

    @Query("select b from CategoriesName5 b where b.name = :name")
    CategoriesName5 findByName(@Param("name") String name);
}
