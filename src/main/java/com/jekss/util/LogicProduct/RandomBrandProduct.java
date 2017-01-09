package com.jekss.util.LogicProduct;

import com.jekss.entityes.Product;
import com.jekss.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jekss on 06.01.17.
 */
@Service
public class RandomBrandProduct {

    @Resource
    private ProductService productService;

    public List<String> randomBrand(){
        List<String> products = productService.getAllBrand();

        List<String> res = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i<9; i++){

            res.add(products.get(random.nextInt(products.size()-1)));

        }

        return res;
    }





}
