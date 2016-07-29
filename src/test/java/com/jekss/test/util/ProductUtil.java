package com.jekss.test.util;

import com.jekss.entityes.*;
import com.jekss.entityes.ManufacturesName;
import com.jekss.entityes.Product;

/**
 * Created by jekss on 09.07.16.
 */
public class ProductUtil {

    public static Product createProduct(){
        Product product = new Product();
        product.setName("name_import");
        return product;
    }

    public static Product createProductAll(){
        CategoriesName1 categoriesName1 = new CategoriesName1();
        CategoriesName2 categoriesName2 = new CategoriesName2();
        CategoriesName3 categoriesName3 = new CategoriesName3();
        CategoriesName4 categoriesName4 = new CategoriesName4();
        CategoriesName5 categoriesName5 = new CategoriesName5();
        CategoriesName6 categoriesName6 = new CategoriesName6();

        ManufacturesName manufacturesName = new ManufacturesName();
        manufacturesName.setName("manufactur");

        Product product = new Product(1990, "name_product_55", 3.0, manufacturesName);

        product.setCategoriesName1_product(categoriesName1);
        product.setCategoriesName2_product(categoriesName2);
        product.setCategoriesName3_product(categoriesName3);
        product.setCategoriesName4_product(categoriesName4);
        product.setCategoriesName5_product(categoriesName5);
        product.setCategoriesName6_product(categoriesName6);
        return product;
    }
}
