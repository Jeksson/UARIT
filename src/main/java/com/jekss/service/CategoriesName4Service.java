package com.jekss.service;

import com.jekss.entityes.CategoriesName4;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
public interface CategoriesName4Service {

    CategoriesName4 addCategoriesName4(CategoriesName4 categoriesName4);
    void deleteCategoriesName4(int id_categoriesName4);
    CategoriesName4 getByNameCategoriesName4(String name_categoriesName4);
    boolean isNameCategoriesName(String name_categoriesName1);
    CategoriesName4 editCategoriesName4(CategoriesName4 categoriesName4);
    List<CategoriesName4> getAll();
}
