package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName6;
import com.jekss.repository.CategoriesName6Repositiry;
import com.jekss.service.CategoriesName6Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName6ServiceImpl implements CategoriesName6Service {

    @Autowired
    private CategoriesName6Repositiry categoriesName6Repositiry;

    @Override
    public CategoriesName6 addCategoriesName6(CategoriesName6 categoriesName6) {
        CategoriesName6 categoriesName61 = categoriesName6Repositiry.saveAndFlush(categoriesName6);
        return categoriesName61;
    }

    @Override
    public void deleteCategoriesName6(int id_categoriesName6) {

        categoriesName6Repositiry.delete(id_categoriesName6);
    }

    @Override
    public CategoriesName6 getByNameCategoriesName6(String name_categoriesName6) {
        return categoriesName6Repositiry.findByName(name_categoriesName6);
    }

    @Override
    public boolean isNameCategoriesName(String name_categoriesName1) {
        return false;
    }

    @Override
    public CategoriesName6 editCategoriesName6(CategoriesName6 categoriesName6) {
        return categoriesName6Repositiry.saveAndFlush(categoriesName6);
    }

    @Override
    public List<CategoriesName6> getAll() {
        return categoriesName6Repositiry.findAll();
    }
}
