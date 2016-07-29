package com.jekss.repository;

import com.jekss.entityes.ManufacturesName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jekss on 16.07.16.
 */
public interface ManufacturesNameRepositiry extends JpaRepository<ManufacturesName, Integer> {

    @Query("select b from ManufacturesName b where b.name = :name")
    ManufacturesName findByName(@Param("name") String name);
}
