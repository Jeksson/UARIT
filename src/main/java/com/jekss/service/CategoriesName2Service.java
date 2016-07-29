package com.jekss.service;

import com.jekss.entityes.CategoriesName2;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName2Service {

    CategoriesName2 addCategoriesName2(CategoriesName2 categoriesName2);
    void deleteCategoriesName2(int id_categoriesName2);
    CategoriesName2 getByNameCategoriesName2(String name_categoriesName2);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName2 editCategoriesName2(CategoriesName2 categoriesName2);
    List<CategoriesName2> getAll();
}
