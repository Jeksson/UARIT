package com.jekss.service;

import com.jekss.entityes.CategoriesName5;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName5Service {

    CategoriesName5 addCategoriesName5(CategoriesName5 categoriesName5);
    void deleteCategoriesName5(int id_categoriesName5);
    CategoriesName5 getByNameCategoriesName5(String name_categoriesName5);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName5 editCategoriesName5(CategoriesName5 categoriesName5);
    List<CategoriesName5> getAll();
}
