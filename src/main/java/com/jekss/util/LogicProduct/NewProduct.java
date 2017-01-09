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
public class NewProduct {


    @Resource
    private ProductService productService;

    public List<Product> newProd(){
        List<Product> products = productService.getAll();

        List<Product> res = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i<30; i++){

            res.add(products.get(random.nextInt(products.size()-1)));

        }
        return res;
    }
}
