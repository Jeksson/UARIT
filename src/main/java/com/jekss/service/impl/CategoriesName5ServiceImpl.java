package com.jekss.service.impl;

import com.jekss.entityes.CategoriesName5;
import com.jekss.repository.CategoriesName5Repositiry;
import com.jekss.service.CategoriesName5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jekss on 16.07.16.
 */
@Service
public class CategoriesName5ServiceImpl implements CategoriesName5Service {

    private CategoriesName5 categoriesName5;
    @Autowired
    private CategoriesName5Repositiry categoriesName5Repositiry;

    @Override
    public CategoriesName5 addCategoriesName5(CategoriesName5 categoriesName5) {
        CategoriesName5 categoriesName51 = categoriesName5Repositiry.saveAndFlush(categoriesName5);
        return categoriesName51;
    }

    @Override
    public void deleteCategoriesName5(int id_categoriesName5) {

        categoriesName5Repositiry.delete(id_categoriesName5);
    }

    @Override
    public CategoriesName5 getByNameCategoriesName5(String name_categoriesName5) {
        return categoriesName5Repositiry.findByName(name_categoriesName5);
    }
    @Override
    public boolean isNameCategoriesName(String name_categoriesName5) {
        categoriesName5 = getByNameCategoriesName5(name_categoriesName5);
        if (categoriesName5.equals(null) || !categoriesName5.getName().equals(name_categoriesName5)){
            return true;
        }else return false;
    }

    @Override
    public CategoriesName5 editCategoriesName5(CategoriesName5 categoriesName5) {
        return categoriesName5Repositiry.saveAndFlush(categoriesName5);
    }

    @Override
    public List<CategoriesName5> getAll() {
        return categoriesName5Repositiry.findAll();
    }
}
