package com.jekss.service;

import com.jekss.entityes.CategoriesName6;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName6Service {

    CategoriesName6 addCategoriesName6(CategoriesName6 categoriesName6);
    void deleteCategoriesName6(int id_categoriesName6);
    CategoriesName6 getByNameCategoriesName6(String name_categoriesName6);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName6 editCategoriesName6(CategoriesName6 categoriesName6);
    List<CategoriesName6> getAll();
}
