package com.jekss.repository;

import com.jekss.entityes.Bucket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jekss on 13.01.17.
 */
@Repository
public interface BucketRepository extends JpaRepository<Bucket, Integer> {

    @Query("select b from Bucket b where b.id = :id")
    Bucket findById(@Param("id") int id);

    @Query("select b from Bucket b where b.idSession = :idSession")
    Bucket findByIdSession(@Param("idSession") String idSession);
}
