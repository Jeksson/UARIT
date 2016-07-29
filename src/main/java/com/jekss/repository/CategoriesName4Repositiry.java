package com.jekss.repository;

import com.jekss.entityes.CategoriesName4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName4Repositiry extends JpaRepository<CategoriesName4, Integer> {

    @Query("select b from CategoriesName4 b where b.name = :name")
    CategoriesName4 findByName(@Param("name") String name);
}
