package com.jekss.repository;

import com.jekss.entityes.CategoriesName1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName1Repositiry extends JpaRepository<CategoriesName1, Integer>{

    @Query("select b from CategoriesName1 b where b.name = :name")
    CategoriesName1 findByName(@Param("name") String name);

}
