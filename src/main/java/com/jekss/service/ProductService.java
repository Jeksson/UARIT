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
    List<String> getCategoriesName2(String categoriesName1);
    List<String> getCategoriesName3(String categoriesName2);
    List<String> getCategoriesName4(String categoriesName3);
    List<String> getCategoriesName5(String categoriesName4);
    List <String> getCategName1All();
    List<String> getAllBrand();
}
