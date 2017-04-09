package com.jekss.service.impl;

import com.jekss.entityes.Bucket;
import com.jekss.repository.BucketRepository;
import com.jekss.service.BucketService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jekss on 13.01.17.
 */

@Service
@Transactional(readOnly = true)
public class BucketServiceImpl implements BucketService {

    private Map<Integer, Integer> productList;

    @Resource
    private BucketRepository bucketRepository;

    @Override
    public Bucket getBucket(int id) {
        return bucketRepository.findById(id);
    }

    @Override
    public Bucket getBucketBySession(String idSession) {
        return bucketRepository.findByIdSession(idSession);
    }

    @Override
    public Bucket editBucket(Bucket bucket) {
        return bucketRepository.saveAndFlush(bucket);
    }


    @Override
    public Bucket addBucket(Bucket bucket) {
        Bucket bucket1 = bucketRepository.saveAndFlush(bucket);
        return bucket1;
    }

    @Override
    public void removeBucket(int sessionId) {
        bucketRepository.delete(sessionId);
    }

    @Override
    public Bucket editMapProductInBucket(String idSession, Map<Integer, Integer> productMap) {

        Bucket bucket = getBucketBySession(idSession);

        if (bucket == null || bucket.equals(null)) {
            bucket = new Bucket(idSession);
            bucket.setProductListInBucket(productMap);
            bucket = addBucket(bucket);
        }

        Map<Integer, Integer> newProductMap = bucket.getProductListInBucket();

        if (!productMap.equals(null) || !bucket.getProductListInBucket().equals(null)) {
            newProductMap.putAll(productMap);
            bucket.setProductListInBucket(newProductMap);
        } else {
            newProductMap = new HashMap<>();
            newProductMap.putAll(productMap);
            bucket.setProductListInBucket(newProductMap);
        }
        return editBucket(bucket);
    }

    @Override
    public Bucket changeProductInBucket(String idSession, Integer idProduct, Integer count) {

        Bucket bucket = getBucketBySession(idSession);
        if (bucket != null || !bucket.equals(null)) {
            productList = bucket.getProductListInBucket();
            for (Map.Entry<Integer, Integer> entry : productList.entrySet()) {
                if (entry.getKey().equals(idProduct)) {
                    entry.setValue(count);
                }
            }
            bucket.setProductListInBucket(productList);
        }
        return editBucket(bucket);
    }

    @Override
    public Bucket removeProductInBucket(String idSession, Integer idProduct, Integer count) {

        Bucket bucket = getBucketBySession(idSession);
        if (bucket != null || !bucket.equals(null)){
            productList = bucket.getProductListInBucket();
            productList.remove(idProduct);
            bucket.setProductListInBucket(productList);
        }
        return editBucket(bucket);
    }
}
