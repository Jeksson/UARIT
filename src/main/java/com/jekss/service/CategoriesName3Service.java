package com.jekss.service;

import com.jekss.entityes.CategoriesName3;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName3Service {

    CategoriesName3 addCategoriesName3(CategoriesName3 categoriesName3);
    void deleteCategoriesName3(int id_categoriesName3);
    CategoriesName3 getByNameCategoriesName3(String name_categoriesName3);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName3 editCategoriesName3(CategoriesName3 categoriesName3);
    List<CategoriesName3> getAll();
}
