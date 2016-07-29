package com.jekss.repository;

import com.jekss.entityes.Picture;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jekss on 16.07.16.
 */
public interface PictureRepository extends JpaRepository<Picture, Integer> {

//    @Query("select b from Picture b where b.name = :name")
//    Picture findByName(@Param("name") String name);
}
