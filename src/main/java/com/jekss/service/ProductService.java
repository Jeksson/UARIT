package com.jekss.service;

import com.jekss.entityes.Product;

import java.util.List;

/**
 * Created by jekss on 26.09.16.
 */
public interface ProductService {

    Product addProduct(Product product);

    void deleteProduct(int id_product);
    Product getByNameProduct(String name_product);
    Product editProduct(Product product);
    List<Product> getAll();
    List<Product> getCategoriesName2InCategoriesName1(String categoriesName1);

}
