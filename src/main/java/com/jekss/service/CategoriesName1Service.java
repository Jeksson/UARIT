package com.jekss.service;

import com.jekss.entityes.CategoriesName1;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName1Service {

    CategoriesName1 addCategoriesName1(CategoriesName1 categoriesName1);
    void deleteCategoriesName1(int id_categoriesName1);
    void deleteCategoriesName1All();
    CategoriesName1 getByNameCategoriesName1(String name_categoriesName1);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName1 editCategoriesName1(CategoriesName1 categoriesName1);
    List<CategoriesName1> getAll();
}
