package com.jekss.service;

import com.jekss.entityes.Bucket;

import java.util.List;
import java.util.Map;

/**
 * Created by jekss on 13.01.17.
 */


public interface BucketService {

    Bucket getBucket(int id);
    Bucket getBucketBySession(String idSession);
    Bucket editBucket(Bucket bucket);
    Bucket addBucket(Bucket bucket);
    void removeBucket(int sessionId);
    Bucket editMapProductInBucket(String idSession, Map<Integer, Integer> productMap);
    Bucket changeProductInBucket(String idSession, Integer idProduct, Integer count);
    Bucket removeProductInBucket(String idSession, Integer idProduct, Integer count);

}
